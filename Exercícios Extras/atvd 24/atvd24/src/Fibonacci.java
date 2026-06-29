public class Fibonacci {
    public int calcular (int n){
       System.out.printf("fibo(%d)\n", n);
       
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        //passo recursivo
        return calcular(n-1) + calcular(n-2);
    }
}