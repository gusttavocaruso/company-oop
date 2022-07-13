package com.empresa.entities;

public class Vendedor extends Colaborador {

  private Long totalVendasMes;

  public Vendedor(String nome, String contratacao) {
    super(nome, "Vendedor", contratacao);
    this.setSalario(12000);
    this.setBeneficio(12000 * 0.3);
  }

  @Override
  public void adicionarAumentoAnual() {
    this.setSalario(this.getSalario() + 1800);
  }

  public Long getTotalVendasMes() {
    return totalVendasMes;
  }

  public void setTotalVendasMes(Long totalVendasMes) {
    this.totalVendasMes = totalVendasMes;
  }

}
