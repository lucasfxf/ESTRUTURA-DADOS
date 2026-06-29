import java.util.LinkedList;

public class atvd02 {

    /*
    2. Escreva uma função que verifique se uma lista encadeada
    que contém números inteiros está em ordem crescente.
    */

    public static boolean ordemCrescente(LinkedList<Integer> lista) {

        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        if (ordemCrescente(lista)) {
            System.out.println("A lista está em ordem crescente.");
        } else {
            System.out.println("A lista NÃO está em ordem crescente.");
        }
    }
}