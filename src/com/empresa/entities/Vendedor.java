package com.empresa.entities;

import java.util.HashMap;
import java.util.Map;

public class Vendedor extends Colaborador {

  private Map<String, Integer> registroVendas;

  public Vendedor(String nome, String contratacao) {
    super(nome, "Vendedor", contratacao);
    this.setSalario(12000);
    this.setBeneficio(0.3);
    this.setBonusAnual(1800);
    this.registroVendas = new HashMap<>();
  }

  public Map<String, Integer> getRegistroVendas() {
    return this.registroVendas;
  }

  public void addVendaByData(String data, Integer totalVendas) {
    this.registroVendas.put(data, totalVendas);
  }

  public Double getComissaoByMes(String data) {
    Integer vendasMes = this.getRegistroVendas().get(data);
    return this.getBeneficio() * vendasMes;
  }

}
