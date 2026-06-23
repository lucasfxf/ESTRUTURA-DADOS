    import { getDataAtual, getHoraAtual } from "../Utils/Utils.js";
    
    class Atendimento {
        //A ordem dos parametros importam
        constructor (nome, cpf){
            this.nome = nome; 
            this.cpf = cpf;
            this.data = getDataAtual();
            this.hora = getHoraAtual();
        }
    }
    export default Atendimento;