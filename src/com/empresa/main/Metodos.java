package com.empresa.main;

import java.util.List;

import com.empresa.entities.Colaborador;

public class Metodos {
  
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

  public Double totalPagarByData(List<Colaborador> colaboradoresAtivos, String mes, String ano) {
    Double total = 0.0;

    for (Colaborador colab : colaboradoresAtivos) {

      String[] colabContratacao = colab.getContratacao().split("/");
      String mesContratacao = colabContratacao[0];
      String anoContratacao = colabContratacao[1];
      
      if (colab.getCargo().equals("Gerente")) {

        total += (colab.getSalario());
      } else {
        total += (colab.getSalario() + colab.getBeneficio());
      }
    }

    return total;
  }

}
