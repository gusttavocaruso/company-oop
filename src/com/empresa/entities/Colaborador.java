package com.empresa.entities;

import java.util.Map;

public class Colaborador {

  private String nome;
  private String cargo;
  private String contratacao;

  private Integer salario;
  private Double beneficio;
  private Integer bonusAnual;

  public Map<String, Integer> registroVendas;

  public Colaborador(String nome, String cargo, String contratacao) {
    this.nome = nome;
    this.cargo = cargo;
    this.contratacao = contratacao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getContratacao() {
    return contratacao;
  }

  public void setContratacao(String contratacao) {
    this.contratacao = contratacao;
  }

  public Integer getSalario() {
    return salario;
  }

  public void setSalario(Integer salario) {
    this.salario = salario;
  }

  public Double getBeneficio() {
    return beneficio;
  }

  public void setBeneficio(Double beneficio) {
    this.beneficio = beneficio;
  }

  public Integer getBonusAnual() {
    return bonusAnual;
  }

  public void setBonusAnual(Integer bonusAnual) {
    this.bonusAnual = bonusAnual;
  }

  public void adicionarAumentoAnual() {
    this.setSalario(this.getSalario() + this.bonusAnual);
  }

  public void addVendaByData(String data, Integer totalVendas) {
    this.registroVendas.put(data, totalVendas);
  }

  public void setComissaoByMes(String data) {
    Integer vendasMes = this.getRegistroVendas().get(data);
    if (vendasMes != null) {
      this.setBeneficio(vendasMes * 0.3);
    }
  }

  public Map<String, Integer> getRegistroVendas() {
    return this.registroVendas;
  }

}
