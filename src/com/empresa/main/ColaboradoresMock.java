package com.empresa.main;

import java.util.List;
import java.util.Map;

import com.empresa.entities.Colaborador;
import com.empresa.entities.Gerente;
import com.empresa.entities.Secretario;
import com.empresa.entities.Vendedor;

public class ColaboradoresMock {

  private Colaborador colab = new Colaborador();
  Vendedor anaSilva = new Vendedor("Ana Silva", "12/2021");
  Vendedor joaoMendes = new Vendedor("João Mendes", "12/2021");

  public void mockListaColaboradores() {
    colab.addColaborador(new Secretario("Jorge Carvalho", "01/2018"));
    colab.addColaborador(new Secretario("Maria Souza", "12/2015"));
    colab.addColaborador(anaSilva);
    colab.addColaborador(joaoMendes);
    colab.addColaborador(new Gerente("Juliana Alves", "07/2017"));
    colab.addColaborador(new Gerente("Bendo Albino", "03/2014"));
  }

  public List<Colaborador> getListaColaboradores() {
    return this.colab.listarColaboradoresAtivos();
  }

  public void mockRegistroVendas() {
    anaSilva.addVendaByData("12/2021", 5200);
    anaSilva.addVendaByData("01/2022", 4000);
    anaSilva.addVendaByData("02/2022", 4200);
    anaSilva.addVendaByData("03/2022", 5850);
    anaSilva.addVendaByData("04/2022", 7000);
  }

  public Map<String, Integer> getRegistroVendas() {
    return anaSilva.getRegistroVendas();
  }

}
