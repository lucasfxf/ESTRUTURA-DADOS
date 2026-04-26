import Fila from "../model/Fila.js";
import Atendimento from "../model/Atendimento.js";

const minhaFila = new Fila(5);

function adicionarElemento() {

  // pega os inputs
  const nomeInput = document.getElementById("txtnovoNome");
  const cpfInput = document.getElementById("txtCpf");

  // cria o objeto
  const atendimento = new Atendimento(nomeInput.value, cpfInput.value);

  // adiciona na fila
  if (minhaFila.enqueue(atendimento)) {

    mostrarFila();

    // limpa os campos
    nomeInput.value = "";
    cpfInput.value = "";

    // foco no nome
    nomeInput.focus();

  } else {
    alert("Fila cheia!");
  }
}

function mostrarFila(){
  const filaElemento = document.getElementById("listFila");
  filaElemento.innerHTML = "";

  for(let item of minhaFila){
    const listItem = document.createElement("li");
    listItem.textContent = `${item.nome} - ${item.cpf} - ${item.data} - ${item.hora}`;
    filaElemento.appendChild(listItem);
  }
}

function removerElemento(){
  let removido = minhaFila.dequeue();

  if(removido === null){
    alert("Fila vazia");
  } else {
    alert(`Atendido: ${removido.nome} - ${removido.cpf}`);
    mostrarFila();
  }
}

function buscarElemento(){
  const busca = document.getElementById("txtnovoNome").value.trim() + document.getElementById("txtCpf").value.trim();;
  let encontrado = false;

  for(let item of minhaFila){
    const nome = item.nome.toLowerCase().trim();
    const cpf = item.cpf.toString().trim();

    const buscaNormalizada = busca.toLowerCase();

    if (buscaNormalizada === nome || busca === cpf){
      alert("Encontrado na fila");
      encontrado = true;
    }
  }

  function limparCpf(cpf){
  return cpf.replace(/\D/g, "");
}

  if(!encontrado){
    alert("Pessoa não está na fila");
  }
}

// 🔥 ESSENCIAL para funcionar com type="module"
window.adicionarElemento = adicionarElemento;
window.removerElemento = removerElemento;
window.buscarElemento = buscarElemento;