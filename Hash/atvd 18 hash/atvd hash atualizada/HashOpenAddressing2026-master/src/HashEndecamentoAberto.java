// temos a entrada hash no começo e as posições são chamadas de bucket
// dado = objetos
// chave = identificador
// a nomenclatura do hash pra inserir se chama put
// no hash map do java o tamanho padrao é 16
// Hash com Endereçamento Aberto

public class HashEndecamentoAberto<T> {

    private static final int VAZIO = 0;
    private static final int REMOVIDO = 1;
    private static final int OCUPADO = 2;
    private static final double LOAD_FACTOR = 0.75;

    private HashEntry<T>[] tabela;
    private int tamanho;
    private int numElementos;

    //------------------Classe interna para representar cada dado armazenado na tabela hash----------------------
    private static class Dado<T> {
        long key;
        T value;

        Dado(long key, T value) {
            this.key = key;
            this.value = value;
        }
    }

    //------------------Classe interna para representar cada entrada da tabela hash----------------------
    private static class HashEntry<T> {
        Dado<T> dado;
        int estado;

        HashEntry() {
            this.estado = VAZIO;
        }
    }

    //------------------Construtor------------------------------------
    public HashEndecamentoAberto(int tamanho) {
        this.tamanho = tamanho;

        tabela = new HashEntry[tamanho];

        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new HashEntry<>();
        }
    }

    public HashEndecamentoAberto() {
        this.tamanho = 10;

        tabela = new HashEntry[tamanho];

        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new HashEntry<>();
        }
    }

    //------------------------------------------------------
    private int funcaoHash(long chave, int i) {
        return (int) ((chave + i) % tamanho);
    }

    //------------------------------------------------------
    public void put(long key, T value) {

        if ((double) numElementos / tamanho >= LOAD_FACTOR) {
            redimensiona();
        }

        Dado<T> dado = new Dado<>(key, value);

        int i = 0;
        int map;

        do {
            map = funcaoHash(key, i);

            if (tabela[map].estado != OCUPADO) {
                tabela[map].dado = dado;
                tabela[map].estado = OCUPADO;
                numElementos++;
                return;
            }

            i++;

        } while (i < tamanho);
    }

    //------------------------------------------------------
    public int containsKey(long chaveBusca) {

        int deslocamento = 0;
        int comparacoes = 0;

        do {

            int posicao = funcaoHash(chaveBusca, deslocamento);

            comparacoes++;

            if (tabela[posicao].estado == VAZIO) {
                return comparacoes;
            }

            if (tabela[posicao].estado == OCUPADO &&
                tabela[posicao].dado.key == chaveBusca) {

                return comparacoes;
            }

            deslocamento++;

        } while (deslocamento < tamanho);

        return comparacoes;
    }

    //------------------------------------------------------
    public int getIndex(long key) {

        int i = 0;
        int map;

        do {

            map = funcaoHash(key, i);

            if (tabela[map].estado == VAZIO) {
                return -1;
            }

            if (tabela[map].estado == OCUPADO &&
                tabela[map].dado.key == key) {

                return map;
            }

            i++;

        } while (i < tamanho);

        return -1;
    }

    //------------------------------------------------------
    public boolean deleteHash(long key) {

        int indice = getIndex(key);

        if (indice == -1) {
            return false;
        }

        tabela[indice].estado = REMOVIDO;
        tabela[indice].dado = null;
        numElementos--;

        return true;
    }

    //------------------------------------------------------
    public void printHash() {

        for (int i = 0; i < tamanho; i++) {

            if (tabela[i].estado == OCUPADO) {

                System.out.printf(
                    "[%d] - %d - %s |%n",
                    i,
                    tabela[i].dado.key,
                    tabela[i].dado.value.toString()
                );

            } else {

                System.out.printf("[%d] -___|%n", i);
            }
        }
    }

    //------------------------------------------------------
    private void redimensiona() {

        int novoTamanho = tamanho * 2;

        HashEntry<T>[] novaTabela = new HashEntry[novoTamanho];

        for (int i = 0; i < novoTamanho; i++) {
            novaTabela[i] = new HashEntry<>();
        }

        for (HashEntry<T> entry : tabela) {

            if (entry.estado == OCUPADO) {

                int i = 0;
                int map;

                do {

                    map = (int) ((entry.dado.key + i) % novoTamanho);

                    if (novaTabela[map].estado != OCUPADO) {

                        novaTabela[map].dado = entry.dado;
                        novaTabela[map].estado = OCUPADO;

                        break;
                    }

                    i++;

                } while (i < novoTamanho);
            }
        }

        tabela = novaTabela;
        tamanho = novoTamanho;
    }
}