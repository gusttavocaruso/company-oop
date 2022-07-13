package com.empresa.entities;

import java.util.ArrayList;
import java.util.List;

public class Colaborador {

  private String nome;
  private String cargo;
  private String contratacao;

  private Integer salario;
  private Double beneficio;
  private Integer bonusAnual;

  public List<Colaborador> listaColaboradores;

  public Colaborador() {
    this.listaColaboradores = new ArrayList<>();
  }

  public Colaborador(String nome, String cargo, String contratacao) {
    this.nome = nome;
    this.cargo = cargo;
    this.contratacao = contratacao;
    this.listaColaboradores = new ArrayList<>();
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

  public List<Colaborador> listarColaboradoresAtivos() {
    return this.listaColaboradores;
  }

  public void addColaborador(Colaborador novoFuncionario) {
    this.listaColaboradores.add(novoFuncionario);
  }

  public void adicionarAumentoAnual() {
    this.setSalario(this.getSalario() + this.bonusAnual);
  }

}
