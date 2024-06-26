package model;

public class Titulo implements Comparable<Titulo> {
    String nome;

    public Titulo(String nome) {
        this.setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}

