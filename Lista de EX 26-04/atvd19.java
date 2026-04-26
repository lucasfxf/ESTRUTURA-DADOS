import java.util.Stack;

public class atvd19 {

    public static void converter(int numero, int base){
        Stack<Integer> pilha = new Stack<>();

        while (numero > 0){
            int resto = numero % base;
            pilha.push(resto);
            numero = numero / base;
        }

        while (!pilha.isEmpty()){
            System.out.print(pilha.pop());
        }
    }

    public static void main(String[] args){
        converter(10, 2);
    }
}