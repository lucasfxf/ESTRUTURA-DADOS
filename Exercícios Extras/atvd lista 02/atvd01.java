import java.util.LinkedList;
import java.util.Scanner;

/*
1. Considerando uma lista encadeada, implemente a função:
pesquisa() retornando 1 se o dado foi encontrado e 0, caso contrário.
*/

class Encadeada {

    public int pesquisa(LinkedList<Integer> lista, int valor) {

        for (Integer numero : lista) {
            if (numero == valor) {
                return 1;
            }
        }

        return 0;
    }
}

public class atvd01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        LinkedList<Integer> lista = new LinkedList<>();

        // Adicionando alguns valores na lista
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        System.out.print("Digite um valor: ");
        int valor = leia.nextInt();

        Encadeada enc = new Encadeada();

        int resultado = enc.pesquisa(lista, valor);

        if (resultado == 1) {
            System.out.println("Valor encontrado!");
        } else {
            System.out.println("Valor não encontrado!");
        }

        leia.close();
    }
}