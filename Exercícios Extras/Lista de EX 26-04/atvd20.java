public class atvd20 {

    // Classe do nó
    class Node {
        int dado;
        Node proximo;

        Node(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    // Início e fim da fila
    Node inicio;
    Node fim;

    // Enfileirar
    public void enfileirar(int valor) {
        Node novo = new Node(valor);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    // Verifica se a fila está em ordem crescente
    public boolean estaCrescente() {
        Node atual = inicio;

        while (atual != null && atual.proximo != null) {
            if (atual.dado > atual.proximo.dado) {
                return false;
            }

            atual = atual.proximo;
        }

        return true;
    }

    // Método principal
    public static void main(String[] args) {
        atvd20 fila = new atvd20();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.enfileirar(40);

        if (fila.estaCrescente()) {
            System.out.println("A fila está em ordem crescente.");
        } else {
            System.out.println("A fila NÃO está em ordem crescente.");
        }
    }
}