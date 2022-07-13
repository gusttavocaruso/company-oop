package com.empresa.main;

import java.util.List;
import com.empresa.entities.Colaborador;
import com.empresa.entities.Gerente;
import com.empresa.entities.Secretario;
import com.empresa.entities.Vendedor;

public class ColaboradoresMock {

  private Colaborador col = new Colaborador();
  Vendedor anaSilva = new Vendedor("Ana Silva", "12/2021");
  Vendedor joaoMendes = new Vendedor("João Mendes", "12/2021");

  public void setListaInicial() {
    col.adicionarFuncionario(new Secretario("Jorge Carvalho", "01/2018"));
    col.adicionarFuncionario(new Secretario("Maria Souza", "12/2015"));
    col.adicionarFuncionario(anaSilva);
    col.adicionarFuncionario(joaoMendes);
    col.adicionarFuncionario(new Gerente("Juliana Alves", "07/2017"));
    col.adicionarFuncionario(new Gerente("Bendo Albino", "03/2014"));
  }

  public List<Colaborador> getListaInicial() {
    return this.col.listarFuncionariosAtivos();
  }

  public void mockRegistroVendas() {
    anaSilva.addVendaByData("12/2021", 5200);
    anaSilva.addVendaByData("01/2022", 4000);
    anaSilva.addVendaByData("02/2022", 4200);
    anaSilva.addVendaByData("03/2022", 5850);
    anaSilva.addVendaByData("04/2022", 7000);
  }

}
