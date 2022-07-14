package com.empresa.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.empresa.entities.Colaborador;
import com.empresa.entities.Gerente;
import com.empresa.entities.Secretario;
import com.empresa.entities.Vendedor;

public class ColaboradoresMock {

  // private Colaborador colab = new Colaborador();
  private List<Colaborador> colabList = new ArrayList<>();

  private Map<String, Map<String, Integer>> registroVendas = new HashMap<>();
  private Map<String, Integer> vendas = new HashMap<>();

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
    vendas.put("12/2021", 5200);
    vendas.put("01/2022", 4000);
    vendas.put("02/2022", 4200);
    vendas.put("03/2022", 5850);
    vendas.put("04/2022", 7000);

    registroVendas.put("Ana Silva", vendas);
  }

  public Map<String, Integer> getRegistroVendas() {
    return anaSilva.getRegistroVendas();
  }

}
