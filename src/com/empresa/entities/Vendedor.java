package com.empresa.entities;

import java.util.HashMap;
import java.util.Map;

public class Vendedor extends Colaborador {

  public Vendedor(String nome, String contratacao) {
    super(nome, "Vendedor", contratacao);
    this.setSalario(12000);
    this.setBeneficio(0.0);
    this.setBonusAnual(1800);
    this.registroVendas = new HashMap<>();
  }

  @Override
  public Map<String, Integer> getRegistroVendas() {
    return this.registroVendas;
  }

  @Override
  public void addVendaByData(String data, Integer totalVendas) {
    this.registroVendas.put(data, totalVendas);
  }

  public void getComissaoByMes(String data) {
    Integer vendasMes = this.getRegistroVendas().get(data);
    if (vendasMes != null) {
      this.setBeneficio(vendasMes * 0.3);
    }
  }

}
