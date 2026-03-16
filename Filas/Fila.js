class Fila {
    #inicio;
    #fim;
    #qtd;
    #elementos;

    constructor(tamanho = 10){
        this.#inicio = 0;
        this.#fim = -1;
        this.#qtd = 0;
        this.#elementos = new Array(tamanho);
    }

    isEmpty(){
        return this.#qtd === 0;
    }

    isFull(){
        return this.#qtd === this.#elementos.length;
    }

    enqueue(valor){
        if(this.isFull()){
            console.log("Fila cheia");
            return;
        }

        this.#fim = (this.#fim + 1) % this.#elementos.length;
        this.#elementos[this.#fim] = valor;
        this.#qtd++;
    }

    dequeue(){
        if(this.isEmpty()){
            console.log("Fila vazia");
            return null;
        }

        const valor = this.#elementos[this.#inicio];
        this.#inicio = (this.#inicio + 1) % this.#elementos.length;
        this.#qtd--;

        return valor;
    }
}

/* TESTE DA FILA */

const fila = new Fila(5);

console.log("Fila vazia?", fila.isEmpty());

fila.enqueue(10);
fila.enqueue(20);
fila.enqueue(30);

console.log("Removido:", fila.dequeue());
console.log("Removido:", fila.dequeue());

console.log("Fila vazia?", fila.isEmpty());