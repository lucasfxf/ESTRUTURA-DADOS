const minhaLista = new LinkedList();

//---------------------------------------------------------------------------------------------
function limpaInputs() {
    document.getElementById("txtnovaTarefa").value = "";
    document.getElementById("txtnovaPrioridade").value = "";
    document.getElementById("txtIndice").value = "";
    document.getElementById("txtnovaTarefa").focus();
}

//--------------------------------------------------------------------------------------------
function leiaDadosTarefa() {
    const descricao = document.getElementById("txtnovaTarefa").value.trim();
    const prioridade = parseInt(document.getElementById("txtnovaPrioridade").value);

    if (descricao === "" || isNaN(prioridade)) {
        alert("Preencha os campos corretamente!");
        return null;
    }

    return new Tarefa(descricao, prioridade, obterDataAtual(), obterHoraAtual());
}

//--------------------------------------------------------------------------------------------
function adicionarElementoInicio() {
    const novaTarefa = leiaDadosTarefa();
    if (novaTarefa) {
        minhaLista.addFirst(novaTarefa);
        alert("Inserido!");
        atualizarLista();
        limpaInputs();
    }
}

//------------------------------------------------------------------------------------------------------
function adicionarElementoFinal() {
    const novaTarefa = leiaDadosTarefa();
    if (novaTarefa) {
        minhaLista.addLast(novaTarefa);
        alert("Inserido!");
        atualizarLista();
        limpaInputs();
    }
}

//--------------------------------------------------------------------------------------------
function adicionarIndice() {
    const novaTarefa = leiaDadosTarefa();
    const index = parseInt(document.getElementById("txtIndice").value);

    if (novaTarefa && !isNaN(index)) {
        minhaLista.addAtIndex(novaTarefa, index);
        alert("Inserido no índice!");
        atualizarLista();
        limpaInputs();
    } else {
        alert("Índice inválido!");
    }
}

//--------------------------------------------------------------------------------------------
// função pra adicionar tarefa ordenada por prioridade
function adicionarTarefa() {
    const novaTarefa = leiaDadosTarefa();

    if (novaTarefa) {
        minhaLista.addOrdenado(novaTarefa);
        alert("Tarefa adicionada!");
        atualizarLista();
        limpaInputs();
    }
}

//--------------------------------------------------------------------------------------------
// Função para remover a primeira tarefa da lista (com tempo)
function removerPrimeira() {
    if (!minhaLista.isEmpty()) {
        const tarefa = minhaLista.removeFirstComTempo();
        mostrarMensagemRemocao(tarefa);
        atualizarLista();
    } else {
        alert("Lista de Tarefas Vazia");
    }
}

//--------------------------------------------------------------------------------------------
function mostrarMensagemRemocao(tarefaRealizada) {
    const mensagem = document.getElementById("mensagem-remocao");
    mensagem.innerHTML = "Tarefa realizada: " + tarefaRealizada.descricao;
    mensagem.style.display = "block";
}

//-------------------------------------------------------------------------------------------- 
// função pra mostrar a primeira tarefa da lista
function mostrarPrimeira() {
    const tarefa = minhaLista.getFirst();

    if (!tarefa) {
        alert("Lista vazia");
        return;
    }

    alert("Primeira tarefa: " + tarefa.descricao);
}

//----------------------------------------------------------------------------------------------
// função pra mostrar a tarefa mais antiga da lista
function mostrarMaisAntiga() {
    minhaLista.tarefaMaisAntiga();
}

//--------------------------------------------------------------------------------------------------
// função pra remover tarefa por índice
function removerPorIndice() {
    const index = parseInt(prompt("Digite o índice da tarefa"));

    const tarefa = minhaLista.removeAtIndex(index);

    if (!tarefa) {
        alert("Índice inválido");
        return;
    }

    alert("Tarefa removida: " + tarefa.descricao);
    atualizarLista();
}

//--------------------------------------------------------------------------------------------------
// Função para atualizar a exibição da lista
function atualizarLista() {
    const listaTarefas = document.getElementById("list_listadeTarefas");
    const lblTarefas = document.getElementById("lblmostraTarefas");

    listaTarefas.innerHTML = "";

    if (!minhaLista.isEmpty()) {
        lblTarefas.innerHTML = "Lista de Tarefas";

        for (const tarefa of minhaLista) {
            const novaLinha = document.createElement("li");
            novaLinha.innerHTML = tarefa.toString();
            listaTarefas.appendChild(novaLinha);
        }
    } else {
        lblTarefas.innerHTML = "Lista de Tarefas Vazia";
    }
}