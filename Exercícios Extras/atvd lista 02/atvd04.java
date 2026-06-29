public class atvd04 {

    /*
    4. Criar uma função recursiva que retorne a soma
    dos elementos de um vetor de n elementos.
    */

    public static int soma(int[] vetor, int indice) {

        if (indice == vetor.length) {
            return 0;
        }

        return vetor[indice] + soma(vetor, indice + 1);
    }

    public static void main(String[] args) {

        int[] vetor = {2, 4, 6, 8};

        System.out.println("Soma = " + soma(vetor, 0));
    }
}