package br.com.academico.teste;

import br.com.academico.modelo.Aluno;

public class TesteDeCRUD {

  public static void main(String[] args) throws Exception {
    Aluno aluno1 = new Aluno();

    aluno1.setCpf("1");
    aluno1.setNome("Henzo");
    aluno1.setIdade(20);
    aluno1.setAltura(1.81);

    System.out.println("Aluno criado e preenchido");
  }
}
