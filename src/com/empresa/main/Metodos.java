package com.empresa.main;

import java.util.List;

import com.empresa.entities.Colaborador;

public class Metodos {

  public Double totalPagarMes(List<Colaborador> colaboradoresAtivos) {
    Double total = 0.0;

    for (Colaborador colaborador : colaboradoresAtivos) {
      if (colaborador.getCargo().equals("Gerente")) {
        total += (colaborador.getSalario());
      } else {
        total += (colaborador.getSalario() + colaborador.getBeneficio());
      }
    }

    return total;
  }

  public Double totalPagarByData(List<Colaborador> colabsAtivos, String mes, String ano) {
    Double total = 0.0;

    for (Colaborador colab : colabsAtivos) {
      concederAjustesSalarioByAno(colab, mes, ano);

      if (colab.getCargo().equals("Gerente")) {
        total += (colab.getSalario());
      } else {
        total += (colab.getSalario() + colab.getBeneficio());
      }
    }

    return total;
  }

  /**
   * Método para conceder aumento anual no salário do colaborador de acordo com o cargo.
   * @param colab colaborador da lista de colaboradores ativos.
   */
  public void concederAjustesSalarioByAno(Colaborador colab, String mes, String ano) {
    String[] colabContratacao = colab.getContratacao().split("/");
    Integer mesContratacao = Integer.parseInt(colabContratacao[0]);
    Integer anoContratacao = Integer.parseInt(colabContratacao[1]);

    Integer anosDeEmpresa = Integer.parseInt(ano) - anoContratacao;
    Integer mesesDeEmpresa = (Integer.parseInt(mes) - mesContratacao) + (anosDeEmpresa * 12);

    var cc = mesesDeEmpresa / 12;
    while (cc != 0) {
      colab.adicionarAumentoAnual();
      cc -= 1;
    }
  }

}
