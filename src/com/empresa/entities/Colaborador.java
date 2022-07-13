package com.empresa.entities;

import java.util.ArrayList;
import java.util.List;

public class Colaborador {

  private String nome;
  private String cargo;
  private String contratacao;

  private Integer salario;
  private Double beneficio;

  public List<Colaborador> listaFuncionarios;

  public Colaborador() {
    this.listaFuncionarios = new ArrayList<>();
  }

  public Colaborador(String nome, String cargo, String contratacao) {
    this.nome = nome;
    this.cargo = cargo;
    this.contratacao = contratacao;
    this.listaFuncionarios = new ArrayList<>();
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

  public List<Colaborador> listarFuncionariosAtivos() {
    return this.listaFuncionarios;
  }

  public void adicionarFuncionario(Colaborador novoFuncionario) {
    this.listaFuncionarios.add(novoFuncionario);
  }

}
