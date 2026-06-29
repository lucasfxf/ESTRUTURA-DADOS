public class atvd15 {

    int[] elementos = new int[10];
    int inicio = 0;
    int fim = -1;

    public boolean buscarElemento(int valor) {

        if (fim == -1) {
            return false;
        }

        for (int i = inicio; i <= fim; i++) {
            if (elementos[i] == valor) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        atvd15 fila = new atvd15();

        fila.elementos[0] = 10;
        fila.elementos[1] = 20;
        fila.elementos[2] = 30;
        fila.fim = 2;

        System.out.println(fila.buscarElemento(20)); // true
        System.out.println(fila.buscarElemento(50)); // false
    }
}