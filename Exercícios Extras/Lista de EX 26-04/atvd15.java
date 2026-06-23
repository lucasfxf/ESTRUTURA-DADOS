atvd15ic boolean buscarElemento(int valor) {
    int i = inicio;

    while (i != fim) {
        if (elementos[i] == valor) {
            return true;
        }
        i = (i + 1) % elementos.length;
    }

    // verificar o último elemento
    if (elementos[fim] == valor) {
        return true;
    }

    return false;
}