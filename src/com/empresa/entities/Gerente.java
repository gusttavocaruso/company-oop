package com.empresa.entities;

public class Gerente extends Colaborador {

  public Gerente(String nome, String contratacao) {
    super(nome, "Gerente", contratacao);
    this.setSalario(20000);
    this.setBonusAnual(3000);
  }

  // // @Override
  // public void adicionarAumentoAnual() {
  //   this.setSalario(this.getSalario() + 3000);
  // }

}
