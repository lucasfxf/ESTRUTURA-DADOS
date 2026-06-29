import java.util.Scanner;

public class atvd05 {

    /*
    5. Crie uma função recursiva para converter
    um valor decimal para binário utilizando recursividade.
    */

    public static void binario(int numero) {

        if (numero > 1) {
            binario(numero / 2);
        }

        System.out.print(numero % 2);
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leia.nextInt();

        System.out.print("Binário: ");
        binario(numero);

        leia.close();
    }
}