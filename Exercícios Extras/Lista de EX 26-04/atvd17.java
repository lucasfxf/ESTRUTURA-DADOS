public class atvd17 {

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

    // Método que retorna o último elemento
    public int ultimoElemento() {
        if (qtd == 0) {
            System.out.println("Fila vazia!");
            return -1;
        }

        return elementos[fim];
    }

    // Método principal
    public static void main(String[] args) {
        atvd17 fila = new atvd17();

        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.enfileirar(40);

        System.out.println("Último elemento da fila: " + fila.ultimoElemento());
    }
}