import java.util.Stack;

public class Java02 {
    public static void main(){
        //Criando a pilha
        Stack<Integer> pilha  = new Stack<>();

        //Adicionando valores
        pilha.push(5);
        pilha.push(10);
        pilha.push(15);

        //Mostrando o topo
        System.out.println("Topo:" + pilha.peek());

        //Removendo um elemento
        System.out.println("Item Removido: " + pilha.pop());

        //Mostrando a pilha
        System.out.println("Pilha: " + pilha);

        //Verificar se esta vazia
        System.out.println("Esta vazia? " + pilha.isEmpty());
    }
}
