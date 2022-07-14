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

    var colaboradoresAtivos = mockColaboradoresAtivos();
    var colaboradoresComBeneficio = mockColaboradoresComBeneficio();

    // Double totalPagarThisMes = method.totalPagarMes(colaboradoresAtivos);
    Double totalPagarByData = method.totalPagarByData(colaboradoresAtivos, "06", "2022");
    Double salarioPagarByData = method.salariosPagarByData(colaboradoresAtivos, "06", "2022");
    Double beneficioPagarByData = method.beneficiosPagarByData(colaboradoresComBeneficio, "06", "2022");
    String maiorSalarioByData = method.maiorPagamentoByData(colaboradoresAtivos, "06", "2022");
    String maiorBeneficioByData = method.maiorBeneficioByData(colaboradoresComBeneficio, "06", "2022");

    // System.out.println(totalPagarThisMes);
    System.out.println("Total a pagar no mês selecionado R$: " +totalPagarByData);
    System.out.println("Salários a pagar no mês selecionado R$: " +salarioPagarByData);
    System.out.printf("Beneficios a pagar no mês selecionado R$: %.2f", beneficioPagarByData);
    System.out.println("O colaborador que mais recebeu no mês selecionado foi o " +maiorSalarioByData);
    System.out.println("O colaborador que mais recebeu beneficios no mês selecionado foi o " +maiorBeneficioByData);

  }

  /**
   * Mockando um getAll no banco de dados.
   * @return lista de funcionários ativos.
   */
  public static List<Colaborador> mockColaboradoresAtivos() {
    mock.mockListaColaboradores();
    mock.mockRegistroVendas();

    return mock.getListaColaboradores();
  }

  public static List<Colaborador> mockColaboradoresComBeneficio() {
    return mock.getListaColaboradores()
        .stream()
        .filter((colab) -> colab.getCargo() != "Gerente")
        .collect(Collectors.toList());
  }

}
