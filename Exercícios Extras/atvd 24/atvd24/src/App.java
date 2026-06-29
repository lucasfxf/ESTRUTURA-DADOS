import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        //criando 
        Scanner leia = new Scanner(System.in);
        Fibonacci fibo = new Fibonacci();

        System.out.println("Entre com o termo: ");
        int termo = leia.nextInt();
        int resultado = fibo.calcular(termo);

        System.out.printf("Termo %d = %d", termo, resultado);
        leia.close();
    }
}
