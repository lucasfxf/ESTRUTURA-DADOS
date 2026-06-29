import java.util.LinkedList;

public class atvd03 {

    /*
    3. Escreva uma função que remova todos os elementos
    com valores pares de uma lista encadeada.
    */

    public static void removerPares(LinkedList<Integer> lista) {

        lista.removeIf(numero -> numero % 2 == 0);

    }

    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(10);
        lista.add(15);
        lista.add(20);
        lista.add(25);
        lista.add(30);

        System.out.println("Antes: " + lista);

        removerPares(lista);

        System.out.println("Depois: " + lista);
    }
}