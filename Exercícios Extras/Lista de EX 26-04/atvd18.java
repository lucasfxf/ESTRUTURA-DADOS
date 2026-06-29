public class atvd18 {

    int[] elementos = new int[10];
    int inicio = 0;
    int fim = -1;
    int qtd = 0;

    // Método para enfileirar
    public void enfileirar(int valor) {
        if (qtd == elementos.length) {
            System.out.println("Fila cheia!");
            return;
        }

        fim++;
        elementos[fim] = valor;
        qtd++;
    }

    // Método que retorna a quantidade de elementos
    public int qtdElementos() {
        return qtd;
    }

    // Método principal
    public static void main(String[] args) {
        atvd18 fila = new atvd18();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.enfileirar(40);

        System.out.println("Quantidade de elementos: " + fila.qtdElementos());
    }
}