package atvd03;

//com for
public class atvd03 {
    public static void main() {

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

    }

    //com while
        int i = 1;

        while (i <= 100) {
            System.out.println(i);
            i++;
        }



        int numero = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        //somar entre
        int N = 10;
        int soma = 0;

        for (int i = 1; i <= N; i++) {
            soma += i;   // mesma coisa que soma = soma + i;
        }

        System.out.println("A soma de 1 até " + N + " é: " + soma);

        //fatorial
        int n = 5;
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;   // mesma coisa que: fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);

        import java.util.Scanner;

        //0 e 10
        Scanner sc = new Scanner(System.in);
        double nota;

        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = sc.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Valor inválido!");
            System.out.print("Digite novamente: ");
            nota = sc.nextDouble();
        }

        System.out.println("Nota válida: " + nota);

        sc.close();
    }




