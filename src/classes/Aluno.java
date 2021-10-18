package classes;

import java.util.Objects;

public class Aluno {

   private Long codAluno;
   private String nomeAluno;
   private String enderecoAluno;
   private int idadeAluno;
   private String dataNascimentoAluno;
   private String numeroCpfAluno;
   private  String rgAluno;
   private String nomeMaeAluno;
   private String nomePaiAluno;
   private String dataMatriculaAluno;
   private String serieMatriculaAluno;


    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    public Long getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(Long codAluno) {
        this.codAluno = codAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public void setIdadeAluno(int idadeAluno) {
        this.idadeAluno = idadeAluno;
    }

    public String getDataNascimentoAluno() {
        return dataNascimentoAluno;
    }

    public void setDataNascimentoAluno(String dataNascimentoAluno) {
        this.dataNascimentoAluno = dataNascimentoAluno;
    }

    public String getNumeroCpfAluno() {
        return numeroCpfAluno;
    }

    public void setNumeroCpfAluno(String numeroCpfAluno) {
        this.numeroCpfAluno = numeroCpfAluno;
    }

    public String getRgAluno() {
        return rgAluno;
    }

    public void setRgAluno(String rgAluno) {
        this.rgAluno = rgAluno;
    }

    public String getNomeMaeAluno() {
        return nomeMaeAluno;
    }

    public void setNomeMaeAluno(String nomeMaeAluno) {
        this.nomeMaeAluno = nomeMaeAluno;
    }

    public String getNomePaiAluno() {
        return nomePaiAluno;
    }

    public void setNomePaiAluno(String nomePaiAluno) {
        this.nomePaiAluno = nomePaiAluno;
    }

    public String getDataMatriculaAluno() {
        return dataMatriculaAluno;
    }

    public void setDataMatriculaAluno(String dataMatriculaAluno) {
        this.dataMatriculaAluno = dataMatriculaAluno;
    }

    public String getSerieMatriculaAluno() {
        return serieMatriculaAluno;
    }

    public void setSerieMatriculaAluno(String serieMatriculaAluno) {
        this.serieMatriculaAluno = serieMatriculaAluno;
    }

    public double mediaNotasAluno(){

        double calculoMedia = (nota1+nota2+nota3+nota4) / 4;

        if (calculoMedia > 60){
            System.out.println("Situacao: Aprovado");
        }else{
            System.out.println("Situacao: Reprovado");
        }

        return calculoMedia;

    }


}
