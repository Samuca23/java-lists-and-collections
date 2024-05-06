package model;

public class Cartao {

    public Cartao(int limite) {
        setLimite(limite);
    }

    int limite;

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public int descontaValor(int valor) {
        return getLimite() - valor;
    }

    public boolean temLimite(int valor) {
        if (getLimite() < valor) {
            return false;
        }

        return  true;
    }
}
