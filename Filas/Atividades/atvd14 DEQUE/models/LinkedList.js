class LinkedList{
    #head;
    #tail;
    #qtd;

    constructor(){
        this.#head = null;
        this.#tail = null;
        this.#qtd = 0;
    }

    isEmpty(){
        return this.#head === null;
    }

    getFirst(){
        return this.isEmpty() ? null : this.#head.dado;
    }

    //--------------------------------------------------------------------------------------------------
    addFirst(novoDado){
        const novoNo = new No(novoDado);

        if(this.isEmpty())
            this.#tail = novoNo;
        else{
            novoNo.proximo = this.#head;
            this.#head.anterior = novoNo;
        }

        this.#head = novoNo;
        this.#qtd++;
        return true;
    }

    //--------------------------------------------------------------------------------------------------
    addLast(novoDado){
        const novoNo = new No(novoDado);

        if(this.isEmpty())
            this.#head = novoNo;
        else{
            novoNo.anterior = this.#tail;
            this.#tail.proximo = novoNo;
        }

        this.#tail = novoNo;
        this.#qtd++;
        return true;
    }

    //--------------------------------------------------------------------------------------------------
    addAtIndex(dado, index){
        if(index <= 0) return this.addFirst(dado);
        if(index >= this.#qtd) return this.addLast(dado);

        let atual = this.#head;

        for(let i = 0; i < index; i++){
            atual = atual.proximo;
        }

        const novoNo = new No(dado);

        novoNo.proximo = atual;
        novoNo.anterior = atual.anterior;

        atual.anterior.proximo = novoNo;
        atual.anterior = novoNo;

        this.#qtd++;
        return true;
    }

    //--------------------------------------------------------------------------------------------------
    removeFirst(){
        if(this.isEmpty()) return null;

        const dadoRemovido = this.#head.dado;
        this.#head = this.#head.proximo;

        if(this.#head == null)
            this.#tail = null;
        else
            this.#head.anterior = null;

        this.#qtd--;
        return dadoRemovido;
    }

    //--------------------------------------------------------------------------------------------------
    removeLast(){
        if(this.isEmpty()) return null;

        const dadoRemovido = this.#tail.dado;
        this.#tail = this.#tail.anterior;

        if(this.#tail == null)
            this.#head = null;
        else
            this.#tail.proximo = null;

        this.#qtd--;
        return dadoRemovido;
    }

    //------------------------------------------------------
    removeAtIndex(index){
        if(this.isEmpty()) return null;

        if(index === 0) return this.removeFirst();
        if(index === this.#qtd - 1) return this.removeLast();

        let atual = this.#head;

        for(let i = 0; i < index; i++){
            atual = atual.proximo;
        }

        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;

        this.#qtd--;
        return atual.dado;
    }

    //--------------------------------------------------------------------------------------------------
    // ordenado por prioridade
    addOrdenado(tarefa) {
        if (this.isEmpty()) {
            return this.addFirst(tarefa);
        }

        let atual = this.#head;
        let pos = 0;

        while (atual && atual.dado.prioridade <= tarefa.prioridade) {
            atual = atual.proximo;
            pos++;
        }

        return this.addAtIndex(tarefa, pos);
    }
//---------------'-----------------------------------------------------------------------------------
    // remover com tempo
    removeFirstComTempo(){
        if(this.isEmpty()) return null;

        const tarefa = this.#head.dado;

        const agora = new Date();
        const inicio = new Date(`${converterDataFormatoISO8601(tarefa.data)}T${tarefa.hora}`);

        const diff = agora - inicio;

        const minutos = Math.floor(diff / 60000);
        const horas = Math.floor(minutos / 60);
        const dias = Math.floor(horas / 24);

        alert(`Concluída em ${dias} dias, ${horas % 24} horas e ${minutos % 60} minutos`);

        return this.removeFirst();
    }

    //------------------------------------------------------------------------------------------
    // tarefa mais antiga
    tarefaMaisAntiga(){
        if(this.isEmpty()){
            return alert("Lista de Tarefas Vazia");
        }

        let atual = this.#head;
        let maisAntiga = atual.dado;

        while(atual){
            if(
                isMenor(
                    atual.dado.data,
                    atual.dado.hora,
                    maisAntiga.data,
                    maisAntiga.hora
                )
            ){
                maisAntiga = atual.dado;
            }

            atual = atual.proximo;
        }

        alert("Tarefa mais antiga: " + maisAntiga.toString());
    }

    get length(){
        return this.#qtd;
    }
//--------------------------------------------------------------------------------------------------
    [Symbol.iterator]() {
        let noAtual = this.#head;

        return {
            next: function() {
                if (noAtual !== null) {
                    let valor = noAtual.dado;
                    noAtual = noAtual.proximo;
                    return { value: valor, done: false };
                } else {
                    return { done: true };
                }
            }
        };
    }
//--------------------------------------------------------------------------------------------------
    toString() {
        let atual = this.#head;
        let retorno = "";

        while(atual != null){
            retorno += "| " + atual.dado.toString() + " ";
            atual = atual.proximo;
        }

        return retorno;
    }
}