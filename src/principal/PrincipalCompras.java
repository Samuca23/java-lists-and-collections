package principal;

import model.Cartao;
import model.Compra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int init = 0;
        List<Compra> compraList = new ArrayList<>();
        System.out.println("Limite do cartão: ");
        Cartao cartao = new Cartao(Integer.parseInt(scanner.nextLine()));

        while (init == 0) {
            System.out.println("Produto: ");
            String produto = scanner.nextLine();
            System.out.println("Valor do produto: ");
            int valorProduto = Integer.parseInt(scanner.nextLine());
            if (cartao.temLimite(valorProduto)) {
                compraList.add(new Compra(produto, valorProduto));
                cartao.setLimite(cartao.getLimite() - valorProduto);
                System.out.println("Deseja finalizar a compra? 1 (Sim) 0 (Não)");
                init = Integer.parseInt(scanner.nextLine());
                if (init == 1) {
                    finalizaCompra(compraList, cartao);
                    scanner.close();
                }
            } else {
                System.out.println("Você não tem limite suficiente para comprar");
                finalizaCompra(compraList, cartao);
                init = 1;
                scanner.close();
            }
        }
    }

    public static void finalizaCompra(List<Compra> compraList, Cartao cartao) {
        System.out.println("Compra Finalizada");
        System.out.println("*********************");
        for (Compra compras: compraList) {
            System.out.println(compras.getNome() + " - R$ " + compras.getValor());
        }
        System.out.println("Limite do cartão disponível: R$ " + cartao.getLimite());
        System.out.println("*********************");
    }

}
