package com.empresa.entities;

public class Secretario extends Colaborador {

  public Secretario(String nome, String contratacao) {
    super(nome, "Secretario", contratacao);
    this.setSalario(7000);
    this.setBeneficio(this.getSalario() * 0.2);
    this.setBonusAnual(1000);
  }

  // @Override
  // public void adicionarAumentoAnual() {
  //   this.setSalario(this.getSalario() + 1000);
  // }

}
