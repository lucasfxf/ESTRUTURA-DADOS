public class atvd21 {

    // Classe do nó
    class Node {
        int dado;
        Node proximo;

        Node(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    // Topo da pilha
    Node topo;

    // Empilhar
    public void empilhar(int valor) {
        Node novo = new Node(valor);
        novo.proximo = topo;
        topo = novo;
    }

    // Mostrar o topo da pilha
    public int mostrarTopo() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return -1;
        }

        return topo.dado;
    }

    // Método principal
    public static void main(String[] args) {
        atvd21 pilha = new atvd21();

        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);

        System.out.println("Topo da pilha: " + pilha.mostrarTopo());
    }
}