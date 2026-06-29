public class atvd16 {

    // Classe do nó
    static class Node {
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

    // Método para enfileirar
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

    // Método que retorna a posição de um valor
    public int buscarPosicao(int valor) {
        Node atual = inicio;
        int pos = 0;

        while (atual != null) {
            if (atual.dado == valor) {
                return pos;
            }
            atual = atual.proximo;
            pos++;
        }

        return -1; // Não encontrou
    }

    // Método principal
    public static void main(String[] args) {
        atvd16 fila = new atvd16();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.enfileirar(40);
        fila.enfileirar(50);

        System.out.println("Posição do 10: " + fila.buscarPosicao(10));
        System.out.println("Posição do 30: " + fila.buscarPosicao(30));
        System.out.println("Posição do 50: " + fila.buscarPosicao(50));
        System.out.println("Posição do 100: " + fila.buscarPosicao(100));
    }
}