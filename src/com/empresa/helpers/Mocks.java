package com.empresa.helpers;

import java.util.ArrayList;
import java.util.List;

import com.empresa.entities.Colaborador;
import com.empresa.entities.Gerente;
import com.empresa.entities.Secretario;
import com.empresa.entities.Vendedor;

public class Mocks {

  private List<Colaborador> colabList = new ArrayList<>();

  Vendedor anaSilva = new Vendedor("Ana Silva", "12/2021");
  Vendedor joaoMendes = new Vendedor("João Mendes", "12/2021");

  public void mockListaColaboradores() {
    colabList.add(new Secretario("Jorge Carvalho", "01/2018"));
    colabList.add(new Secretario("Maria Souza", "12/2015"));
    colabList.add(anaSilva);
    colabList.add(joaoMendes);
    colabList.add(new Gerente("Juliana Alves", "07/2017"));
    colabList.add(new Gerente("Bento Albino", "03/2014"));
  }

  public List<Colaborador> getListaColaboradores() {
    return this.colabList;
  }

  public void mockRegistroVendas() {
    anaSilva.addVendaByData("12/2021", 5200);
    anaSilva.addVendaByData("01/2022", 4000);
    anaSilva.addVendaByData("02/2022", 4200);
    anaSilva.addVendaByData("03/2022", 5850);
    anaSilva.addVendaByData("04/2022", 7000);

    joaoMendes.addVendaByData("12/2021", 3400);
    joaoMendes.addVendaByData("01/2022", 7700);
    joaoMendes.addVendaByData("02/2022", 5000);
    joaoMendes.addVendaByData("03/2022", 5900);
    joaoMendes.addVendaByData("04/2022", 6500);
  }

  public Vendedor getAnaSilva() {
    return anaSilva;
  }

  public Vendedor getJoaoMendes() {
    return joaoMendes;
  }

}
