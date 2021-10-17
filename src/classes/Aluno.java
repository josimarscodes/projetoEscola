package classes;

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
   private double nota1;
   private double nota2;
   private double nota3;
   private double nota4;


    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
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

    public void imprimeDadosAluno(){

        System.out.println("");
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Endereco: " + enderecoAluno);
        System.out.println("cpf: " + numeroCpfAluno);
        System.out.println("Idade: " + idadeAluno);
        System.out.println("---------");
        System.out.println("Media da nota do aluno " + nomeAluno + " = " + mediaNotasAluno());

    }
}
