package com.empresa.main;

import java.util.List;
import com.empresa.entities.Colaborador;
import com.empresa.entities.Gerente;
import com.empresa.entities.Secretario;
import com.empresa.entities.Vendedor;

public class RhMethods {

  private Colaborador col = new Colaborador();

  public void setListaInicial() {
    col.adicionarFuncionario(new Secretario("Jorge Carvalho", "01/2018"));
    col.adicionarFuncionario(new Secretario("Maria Souza", "12/2015"));
    col.adicionarFuncionario(new Vendedor("Ana Silva", "12/2021"));
    col.adicionarFuncionario(new Vendedor("João Mendes", "12/2021"));
    col.adicionarFuncionario(new Gerente("Juliana Alves", "07/2017"));
    col.adicionarFuncionario(new Gerente("Bendo Albino", "03/2014"));
  }

  public List<Colaborador> getListaInicial() {
    return this.col.listarFuncionariosAtivos();
  }

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

}
