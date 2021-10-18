package main;

import classes.Aluno;

import javax.swing.*;

public class main {

    public static void main(String[] agrs){

        Aluno aluno = new Aluno();

        aluno.setNomeAluno("josimar jose sousa");
        aluno.setEnderecoAluno("Papagaio");
        aluno.setNumeroCpfAluno("23566589455");
        aluno.setIdadeAluno(40);

        String disciplina1 = JOptionPane.showInputDialog("Digite o nome da disciplina 1:");
        String nota1 = JOptionPane.showInputDialog("Digite a nota 1: ");
        String disciplina2 = JOptionPane.showInputDialog("Digite o nome da disciplina 2:");
        String nota2 = JOptionPane.showInputDialog("Digite a nota 2: ");
        String disciplina3 = JOptionPane.showInputDialog("Digite o nome da disciplina 3:");
        String nota3 = JOptionPane.showInputDialog("Digite a nota 3: ");
        String disciplina4 = JOptionPane.showInputDialog("Digite o nome da disciplina 4:");
        String nota4 = JOptionPane.showInputDialog("Digite a nota 4: ");

        aluno.setDisciplina1(disciplina1);
        aluno.setNota1(Double.parseDouble(nota1));
        aluno.setDisciplina2(disciplina2);
        aluno.setNota2(Double.parseDouble(nota2));
        aluno.setDisciplina3(disciplina3);
        aluno.setNota3(Double.parseDouble(nota3));
        aluno.setDisciplina4(disciplina4);
        aluno.setNota4(Double.parseDouble(nota4));

        System.out.println(aluno);
        System.out.println("Media do aluno: " + aluno.mediaNotasAluno());

    }
}
