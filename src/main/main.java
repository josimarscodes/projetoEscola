package main;

import classes.Aluno;

public class main {

    public static void main(String[] agrs){

        Aluno aluno = new Aluno();

        aluno.setNomeAluno("josimar jose sousa");
        aluno.setEnderecoAluno("Papagaio");
        aluno.setNumeroCpfAluno("23566589455");
        aluno.setIdadeAluno(40);

        aluno.setNota1(60);
        aluno.setNota2(61);
        aluno.setNota3(59);
        aluno.setNota4(60.5);

        aluno.imprimeDadosAluno();


    }
}
