/*Escreva uma função que verifique se uma fila 
encadeada que contém números inteiros está em ordem crescente.*/

import org.w3c.dom.Node;


public boolean estaCrescente() {
    Node atual = inicio;

    while (atual != null && atual.proximo != null) {
        if (atual.dado > atual.proximo.dado) {
            return false;
        }
        atual = atual.proximo;
    }

    return true;
}
    public boolean estaCrescente() {
    Node atual = inicio;

    while (atual != null) {
        if (__________) {
            return false;
        }
        atual = __________;
    }

    return true;
}

