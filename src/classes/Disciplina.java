package classes;

import java.util.Objects;

public class Disciplina {

    private Double notaDisciplina;
    private String nomeDisciplina;

    public Double getNotaDisciplina() {
        return notaDisciplina;
    }

    public void setNotaDisciplina(Double notaDisciplina) {
        this.notaDisciplina = notaDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "notaDisciplina=" + notaDisciplina +
                ", nomeDisciplina='" + nomeDisciplina + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina)) return false;
        Disciplina that = (Disciplina) o;
        return getNotaDisciplina().equals(that.getNotaDisciplina()) && getNomeDisciplina().equals(that.getNomeDisciplina());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNotaDisciplina(), getNomeDisciplina());
    }
}
