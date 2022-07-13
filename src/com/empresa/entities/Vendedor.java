package com.empresa.entities;

import java.util.HashMap;
import java.util.Map;

public class Vendedor extends Colaborador {

  private Long totalVendasMes;
  Map<String, Integer> registroVendasByMes;

  public Vendedor(String nome, String contratacao) {
    super(nome, "Vendedor", contratacao);
    this.setSalario(12000);
    this.setBeneficio(12000 * 0.3);
    this.setBonusAnual(1800);
    this.registroVendasByMes = new HashMap<>();
  }

  public Long getTotalVendasMes() {
    return totalVendasMes;
  }

  public void setTotalVendasMes(Long totalVendasMes) {
    this.totalVendasMes = totalVendasMes;
  }

  public Map<String, Integer> getRegistroVendasByMes() {
    return registroVendasByMes;
  }

  public void addVendaByData(String data, Integer totalVendas) {
    this.registroVendasByMes.put(data, totalVendas);
  }

  

}
