package com.empresa.main;

import java.util.List;
import com.empresa.entities.Colaborador;

public class Application {

  public static void main(String[] args) {

    /**
     * Mockando um getAll no banco de dados.
     * @return lista de funcionários ativos.
     */
    var colaboradoresAtivos = mockColaboradores();

    Metodos method = new Metodos();

    Double totalPagarMes = method.totalPagarMes(colaboradoresAtivos);


    System.out.println(totalPagarMes);

  }

  public static List<Colaborador> mockColaboradores() {
    ColaboradoresMock colabMock = new ColaboradoresMock();
    colabMock.setListaInicial();
    return colabMock.getListaInicial();
  }

}
