package model;

public class Compra implements Comparable<Compra> {

    public Compra (String nome, int valor) {
        setNome(nome);
        setValor(valor);
    }

    String nome;
    int valor;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getValor() {
        return valor;
    }

    @Override
    public int compareTo(Compra o) {
       return this.getValor().compareTo(o.getValor());
    }
}
