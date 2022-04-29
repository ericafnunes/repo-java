package com.letscode.Lista;


import java.util.ArrayList;
import java.util.List;

public class ListaCompras {public static void main(String[] args) {
    List<String> compras = new ArrayList<>();

    compras.add("Bolo");
    compras.add("Sabão");
    compras.add("Arroz");
    compras.add("Batata");
    compras.add("Ervilha");
    compras.add("Sabão");
    compras.add("Carne");
    compras.add("Macarrão");
    compras.add("Detergente");
    compras.add("Alcool");

    System.out.println("Lista de compras: " + compras);

    // 2- filter
    compras.stream().filter(i -> i.startsWith("B")).forEach(i->System.out.println(("Itens da lista com letra B: " + i)));

    // 3- forEach
    long contagem = compras.stream().filter(i -> i.startsWith("E")).count();
    System.out.println("Quantidade de itens que iniciam com a letra E: " + contagem);

    // 4- Passando lista em maiscula
    String reducedList =
            compras
                    .stream()
                    .map(x -> x.toUpperCase())
                    .reduce((item1, item2) -> {
                        return item1 + " --- " + item2;
                    })
                    .orElse("Lista vazia");
    System.out.println(reducedList);
    }
}
