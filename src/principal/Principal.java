package principal;

import model.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();
        listNumber.add(5);
        listNumber.add(8);
        listNumber.add(11);
        listNumber.add(1);

        System.out.println(listNumber);
        System.out.println("Ordenando");
        Collections.sort(listNumber);
        System.out.println(listNumber);

        System.out.println("Ordenando Lista de String");
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("Lápis"));
        listaTitulos.add(new Titulo("Papel"));
        listaTitulos.add(new Titulo("Tesoura"));
        listaTitulos.add(new Titulo("Caneta"));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }

        System.out.println("List");
        List<Titulo> listTitle = new ArrayList<>();
        listTitle.add(new Titulo("List 1"));
        listTitle.add(new Titulo("List 2"));
        listTitle.add(new Titulo("List 3"));
        for (Titulo title : listTitle) {
            System.out.println(title.getNome());
        }

        System.out.println("LinkedList");
        List<Integer> listInt = new LinkedList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        System.out.println(listInt);

        System.out.println("Lista Polimorfica");
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Poli 1");
        listaPolimorfica.add("Poli 2");
        listaPolimorfica.add("Poli 3");
        System.out.println(listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Poli 9");
        listaPolimorfica.add("Poli 10");
        listaPolimorfica.add("Poli 11");
        System.out.println(listaPolimorfica);
    }
}
