package main;

import classes.Aluno;
import classes.Disciplina;

import javax.swing.*;

public class main {

    public static void main(String[] agrs){

        Aluno aluno = new Aluno();

        aluno.setNomeAluno("josimar jose sousa");
        aluno.setEnderecoAluno("Papagaio");
        aluno.setNumeroCpfAluno("23566589455");
        aluno.setIdadeAluno(40);

        String discip1 = JOptionPane.showInputDialog("Digite o nome da disciplina 1:");
        String nota1 = JOptionPane.showInputDialog("Digite a nota 1: ");
        String discip2 = JOptionPane.showInputDialog("Digite o nome da disciplina 2:");
        String nota2 = JOptionPane.showInputDialog("Digite a nota 2: ");
        String discip3 = JOptionPane.showInputDialog("Digite o nome da disciplina 3:");
        String nota3 = JOptionPane.showInputDialog("Digite a nota 3: ");
        String discip4 = JOptionPane.showInputDialog("Digite o nome da disciplina 4:");
        String nota4 = JOptionPane.showInputDialog("Digite a nota 4: ");

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNomeDisciplina(discip1);
        Disciplina disciplina2 = new Disciplina();
        disciplina1.setNomeDisciplina(discip2);
        Disciplina disciplina3 = new Disciplina();
        disciplina1.setNomeDisciplina(discip3);
        Disciplina disciplina4 = new Disciplina();
        disciplina1.setNomeDisciplina(discip4);




    }
}
