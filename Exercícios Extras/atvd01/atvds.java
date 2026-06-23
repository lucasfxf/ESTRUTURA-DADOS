public class atvds {
    public static void main(){

        //Básico
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a * b);

        System.out.println("------------------------");

        //Divisão
        int x = 15;
        System.out.println(x / 3);

        System.out.println("-----------------------------");

        //Média
        double nota1 = 6.5;
        double nota2 = 7.0;
        double nota3 = 5.5;

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("Média: " + media);
        
        System.out.println("-------------------------------");

        //maior ou menor etc

        int l = 10;
        int m = 20;

        if (l == m) {
            System.out.println("Os números são iguais");
        } else if (l > m) {
            System.out.println("A primeira variável é maior");
        } else {
            System.out.println("A segunda variável é maior");
        }

    }
}


