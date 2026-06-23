//17. Crie uma função para apresentar o último elemento da fila.

public int ultimoElemento(){
    if (qtd == 0) {
        System.out.println("Fila vazia!");
        return -1;
    }

    return elementos[fim];
}