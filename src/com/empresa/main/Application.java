package com.empresa.main;

import java.util.List;
import com.empresa.entities.Colaborador;

public class Application {

  public static void main(String[] args) {

    Metodos method = new Metodos();
    var colaboradoresAtivos = mockColaboradoresAtivos();

    Double totalPagarThisMes = method.totalPagarMes(colaboradoresAtivos);
    Double totalPagarByData = method.totalPagarByData(colaboradoresAtivos, "06", "2022");

    // System.out.println(totalPagarThisMes);
    System.out.println("Total a pagar no mês selecionado R$: " + totalPagarByData);

  }

  /**
   * Mockando um getAll no banco de dados.
   * @return lista de funcionários ativos.
   */
  public static List<Colaborador> mockColaboradoresAtivos() {
    ColaboradoresMock colabMock = new ColaboradoresMock();
    colabMock.setListaInicial();
    return colabMock.getListaInicial();
  }

}
