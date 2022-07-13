package com.empresa.main;

import java.util.List;
import com.empresa.entities.Colaborador;
import com.empresa.entities.Gerente;
import com.empresa.entities.Secretario;
import com.empresa.entities.Vendedor;

public class ColaboradoresMock {

  private Colaborador col = new Colaborador();

  public void setListaInicial() {
    // col.adicionarFuncionario(new Secretario("Jorge Carvalho", "01/2018"));
    // col.adicionarFuncionario(new Secretario("Maria Souza", "12/2015"));
    // col.adicionarFuncionario(new Vendedor("Ana Silva", "12/2021"));
    // col.adicionarFuncionario(new Vendedor("João Mendes", "12/2021"));
    col.adicionarFuncionario(new Gerente("Juliana Alves", "06/2021"));
    col.adicionarFuncionario(new Gerente("Bendo Albino", "06/2020"));
  }

  public List<Colaborador> getListaInicial() {
    return this.col.listarFuncionariosAtivos();
  }

}
