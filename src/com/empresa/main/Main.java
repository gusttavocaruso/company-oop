package com.empresa.main;

import java.util.List;
import java.util.stream.Collectors;

import com.empresa.entities.Colaborador;
import com.empresa.helpers.Mocks;
import com.empresa.helpers.Metodos;

public class Main {

  static final Mocks mock = new Mocks();
  static final Metodos method = new Metodos();

  public static void main(String[] args) {

    mock.mockListaColaboradores();
    var colabsAtivos = mock.getListaColaboradores();
    var colabsComBeneficio = mockColaboradoresComBeneficio();
    mock.mockRegistroVendas();

    // Double totalPagarThisMes = method.totalPagarMes(colabsAtivos);
    Double totalPagarByData = method.totalPagarByData(colabsAtivos, "06", "2022");
    Double salarioPagarByData = method.salariosPagarByData(colabsAtivos, "06", "2022");
    Double beneficioPagarByData = method.beneficiosPagarByData(colabsComBeneficio, "12", "2021");
    String maiorSalarioByData = method.maiorPagamentoByData(colabsAtivos, "06", "2022");
    String maiorBeneficioByData = method.maiorBeneficioByData(colabsComBeneficio, "06", "2022");

    // System.out.println(totalPagarThisMes);
    System.out.println("Total a pagar no mês selecionado R$: " +totalPagarByData);
    System.out.println("Salários a pagar no mês selecionado R$: " +salarioPagarByData);
    System.out.println("Beneficios a pagar no mês selecionado R$: " +beneficioPagarByData);
    System.out.println("O colaborador que mais recebeu no mês selecionado foi o " +maiorSalarioByData);
    System.out.println("O colaborador que mais recebeu beneficios no mês selecionado foi o " +maiorBeneficioByData);

  }

  public static List<Colaborador> mockColaboradoresComBeneficio() {
    return mock.getListaColaboradores()
        .stream()
        .filter((colab) -> colab.getCargo() != "Gerente")
        .collect(Collectors.toList());
  }

}
