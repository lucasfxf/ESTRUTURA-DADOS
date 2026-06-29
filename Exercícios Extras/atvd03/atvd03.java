package atvd03;

import java.util.Scanner;

public class atvd03 {

    public static void main(String[] args) {

        // Contando de 1 a 100 com for
        System.out.println("Contagem com FOR:");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // Contando de 1 a 100 com while
        System.out.println("\nContagem com WHILE:");
        int i = 1;

        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        // Tabuada do 5
        System.out.println("\nTabuada do 5:");
        int numero = 5;

        for (i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Soma de 1 até N
        System.out.println("\nSoma de 1 até N:");
        int N = 10;
        int soma = 0;

        for (i = 1; i <= N; i++) {
            soma += i;
        }

        System.out.println("A soma de 1 até " + N + " é: " + soma);

        // Fatorial
        System.out.println("\nFatorial:");
        int n = 5;
        int fatorial = 1;

        for (i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é: " + fatorial);

        // Validação de nota
        System.out.println("\nValidação de nota:");
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
}