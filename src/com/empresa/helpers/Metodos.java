package com.empresa.helpers;

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

  public Double salariosPagarByData(List<Colaborador> colabsAtivos, String mes, String ano) {
    Double total = 0.0;

    for (Colaborador colab : colabsAtivos) {
      concederAjustesSalarioByAno(colab, mes, ano);
      total += colab.getSalario();
    }

    return total;
  }

  public Double beneficiosPagarByData(List<Colaborador> colabsBenef, String mes, String ano) {
    Double total = 0.0;

    for (Colaborador colab : colabsBenef) {
      concederAjustesSalarioByAno(colab, mes, ano);
      total += colab.getBeneficio();
    }

    return total;
  }

  public String maiorPagamentoByData(List<Colaborador> colabsAtivos, String mes, String ano) {
    Double maiorPag = 0.0;
    String colabMaiorPag = "";

    for (Colaborador colab : colabsAtivos) {
      concederAjustesSalarioByAno(colab, mes, ano);

      if (colab.getCargo().equals("Gerente")) {
        if (colab.getSalario() > maiorPag) {
          colabMaiorPag = colab.getNome();
        }
      } else {
        if ((colab.getSalario() + colab.getBeneficio()) > maiorPag) {
          colabMaiorPag = colab.getNome();
        }
      }
    }

    return colabMaiorPag;
  }

  public String maiorBeneficioByData(List<Colaborador> colabsBenef, String mes, String ano) {
    Double maiorBen = 0.0;
    String colabMaiorBen = "";

    for (Colaborador colab : colabsBenef) {
      concederAjustesSalarioByAno(colab, mes, ano);

      if (colab.getBeneficio() > maiorBen) {
        colabMaiorBen = colab.getNome();
      }
    }

    return colabMaiorBen;
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
