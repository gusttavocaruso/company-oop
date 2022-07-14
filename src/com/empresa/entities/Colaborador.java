package com.empresa.entities;

public class Colaborador {

  private String nome;
  private String cargo;
  private String contratacao;

  private Integer salario;
  private Double beneficio;
  private Integer bonusAnual;

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

}
