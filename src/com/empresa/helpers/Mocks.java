package com.empresa.helpers;

import java.util.ArrayList;
import java.util.List;

import com.empresa.entities.Colaborador;
import com.empresa.entities.Gerente;
import com.empresa.entities.Secretario;
import com.empresa.entities.Vendedor;

public class Mocks {

  private List<Colaborador> colabList = new ArrayList<>();

  public void mockListaColaboradores() {
    colabList.add(new Secretario("Jorge Carvalho", "01/2018"));
    colabList.add(new Secretario("Maria Souza", "12/2015"));
    colabList.add(new Vendedor("Ana Silva", "12/2021"));
    colabList.add(new Vendedor("João Mendes", "12/2021"));
    colabList.add(new Gerente("Juliana Alves", "07/2017"));
    colabList.add(new Gerente("Bento Albino", "03/2014"));
  }

  public List<Colaborador> getListaColaboradores() {
    return this.colabList;
  }

  public void mockRegistroVendas() {
    for (Colaborador colab : getListaColaboradores()) {
      if (colab.getNome().equals("Ana Silva")) {
        colab.addVendaByData("12/2021", 5200);
        colab.addVendaByData("01/2022", 4000);
        colab.addVendaByData("02/2022", 4200);
        colab.addVendaByData("03/2022", 5850);
        colab.addVendaByData("04/2022", 7000);
      } else if (colab.getNome().equals("João Mendes")) {
        colab.addVendaByData("12/2021", 3400);
        colab.addVendaByData("01/2022", 7700);
        colab.addVendaByData("02/2022", 5000);
        colab.addVendaByData("03/2022", 5900);
        colab.addVendaByData("04/2022", 6500);
      }
    }

  }

}
