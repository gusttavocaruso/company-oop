package com.empresa.main;

public class Application {

  public static void main(String[] args) {
    RhMethods rhMetodos = new RhMethods();

    //Mock funcionários
    rhMetodos.setListaInicial();

    var colaboradoresAtivos = rhMetodos.getListaInicial();

    Double totalPagarMes = rhMetodos.totalPagarMes(colaboradoresAtivos);


    System.out.println(totalPagarMes);

  }

}
