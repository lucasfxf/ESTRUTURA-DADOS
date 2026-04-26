package Java;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        // Adicionando elementos
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Pilha: " + pilha);

        // Ver o topo
        System.out.println("Topo: " + pilha.peek());

        // Remover elemento
        pilha.pop();

        System.out.println("Depois do pop: " + pilha);

        // Verificar se está vazia
        System.out.println("Está vazia? " + pilha.isEmpty());
    }
}