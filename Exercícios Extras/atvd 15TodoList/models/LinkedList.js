// models/LinkedList.js
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

    //--------------------------------  

    addFirst(novoDado){
        const novoNo = new No(novoDado);
        if(this.isEmpty())// vazia
            this.#tail = novoNo;
        else{
           novoNo.proximo = this.#head;
           this.#head.anterior = novoNo;
        }
        this.#head = novoNo;
        this.#qtd++;
        return true;
    }

//--------------------------------  

    addLast(novoDado){
        const novoNo = new No(novoDado);
        if(this.isEmpty())// vazia
            this.#head = novoNo;
        else{
           novoNo.anterior = this.#tail;
           this.#tail.proximo = novoNo;
        }
        this.#tail = novoNo;
        this.#qtd++;
        return true;
    }

<<<<<<< HEAD
     addAtIndex(novoDado, posicao){
=======
    //------------------------
    addAtIndex(novoDado, posicao){
>>>>>>> c806256869f41da0e1b50cbe22f3d084a221b7d7
        if(this.isEmpty() || posicao<=0)
            return this.addFirst(novoDado);
        if(posicao >=this.#qtd)
            return this.addLast(novoDado);

        const novoNo = new No(novoDado);
        let aux = this.#head; // aux sai do inicio
        let posAtual = 0;
        while(posAtual < posicao-1){
            aux = aux.proximo;
            posAtual++;
        }
        novoNo.anterior = aux;
        novoNo.proximo = aux.proximo;
        aux.proximo = novoNo;
        novoNo.proximo.anterior = novoNo;
        this.#qtd++;
        return true;
    }
<<<<<<< HEAD
=======

>>>>>>> c806256869f41da0e1b50cbe22f3d084a221b7d7
//--------------------------------  

    removeFirst(){
        if(this.isEmpty())
            return null;

        const dadoRemovido = this.#head.dado;
        this.#head = this.#head.proximo;
        if(this.#head===null)
            this.#tail = null;
        else
            this.#head.anterior = null;
            
        this.#qtd--;
        return dadoRemovido;
    }

//--------------------------------  
    removeLast(){
        if(this.isEmpty())
            return null;

        const dadoRemovido = this.#tail.dado;
        this.#tail = this.#tail.anterior;
        if(this.#tail===null)
            this.#head = null;
        else
            this.#tail.proximo = null;
            
        this.#qtd--;
        return dadoRemovido;
    }
    


    get length(){
        return this.#qtd;
    }


    //-------------------------------------
//Quando um objeto tem um iterator, ele pode ser iterado com construções como [ for(const item of minhaLista)*/


[Symbol.iterator]() {         
    let noAtual = this.#head;
          return {
            next: function() {
              if (noAtual!==null) {
                let valor = noAtual.dado;
                noAtual = noAtual.proximo;
                return { value: valor, done: false };
              } else {
                return { done: true };
              }
            }
          };
        }
  //—----------------
    toString() {
          let noAtual = this.#head;
          let retorno = "";
          while(noAtual!=null){
            retorno+= "| " + noAtual.dado;
            noAtual = noAtual.proximo;
          }
          
      }
   //----------------   
    }

    
    getLast(){
        if(!this.isEmpty())
            return this.#tail.dado;

            else return null;
        }

    getFirst(){
        if(!this.isEmpty())
            return this.#head.dado;
        else 
            return null;
    }

    
