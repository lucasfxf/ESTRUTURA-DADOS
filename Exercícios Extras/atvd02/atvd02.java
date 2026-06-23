package atvd02;
//impar e par
public class atvd02 {
    public static void main(){
    int a = 5;

    if(a % 2 == 1){
        System.out.println("É ímpar!");
    } else {
        System.out.println("É par!");
    }


//maior numero
    //    int a = 10;
        int b = 25;
        int c = 18;

        if (a >= b && a >= c) {
            System.out.println("O maior número é: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("O maior número é: " + b);
        } else {
            System.out.println("O maior número é: " + c);
        }
    
        //ano bissexto
        int ano = 2024;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("É ano bissexto");
        } else {
            System.out.println("Não é ano bissexto");
        }

        //calculadora
        double num1 = 10;
        double num2 = 5;
        char operador = '+';  // pode mudar aqui

        double resultado;

        if (operador == '+') {
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);

        } else if (operador == '-') {
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);

        } else if (operador == '*') {
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);

        } else if (operador == '/') {

            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: divisão por zero!");
            }

        } else {
            System.out.println("Operador inválido!");
        }

        //senha e login
        String usuario = "admin";
        String senha = "1234";

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido");

        } else if (!usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Acesso negado usuário");

        } else if (usuario.equals(usuarioCorreto) && !senha.equals(senhaCorreta)) {
            System.out.println("Acesso negado senha");

        } else {
            System.out.println("Acesso negado usuário e senha");
        }
    }
}


