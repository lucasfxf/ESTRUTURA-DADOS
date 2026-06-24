public class Fibonacci {
//fibo recursivo
public static int fiboRecursivo(int n){
    if(n == 0){
        return 0;
    }
    
    if(n == 1){
        return 1;
    }
    
    return fiboRecursivo(n - 1) + fiboRecursivo(n - 2);
}

//------------------------------------------------------------

//fibo iterativo
public static int fiboIterativo(int n){
    if (n == 0)
    return 0;

    if (n == 1)
    return 1;

int anterior = 0;
int atual = 1;

for(int i = 2; i <= n; i++){
   int proximo = anterior + atual;
   anterior = atual;
   atual = proximo;
}   
return atual;
}

//------------------------------------------------------------

public static void main(String[] args) {
    System.out.println(fiboRecursivo(7));
    System.out.println(fiboIterativo(7));
}
}