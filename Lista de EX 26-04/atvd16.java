//16. Crie um método que dado um valor, retorne a posição que o mesmo se
//encontra na fila linear com implementação dinâmica.

public int buscarPosicao(int valor) {
    Node atual = inicio;
    int pos = 0;

    while (atual != null) {
         if (atual.dado == valor) {
            return pos;
        }
        atual = atual.proximo;
        pos++;
    }

    return -1; // não encontrou
}