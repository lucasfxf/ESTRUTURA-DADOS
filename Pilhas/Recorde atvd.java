import java.util.Scanner;
import java.time.LocalDate;

public class App {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho da pilha:");
        int tamanho = sc.nextInt();

        Pilha<Recorde> pilha = new Pilha<>(tamanho);

        int opcao = -1;

        while(opcao != 0){

            System.out.println("\n1 Inserir recorde");
            System.out.println("2 Ver topo");
            System.out.println("3 Remover topo");
            System.out.println("4 Listar recordes");
            System.out.println("0 Sair");

            opcao = sc.nextInt();

            if(opcao == 1){

                System.out.println("Nome:");
                String nome = sc.next();

                System.out.println("Tempo:");
                double tempo = sc.nextDouble();

                System.out.println("Ano:");
                int ano = sc.nextInt();

                System.out.println("Mes:");
                int mes = sc.nextInt();

                System.out.println("Dia:");
                int dia = sc.nextInt();

                LocalDate data = LocalDate.of(ano, mes, dia);

                Recorde novo = new Recorde(data, tempo, nome);

                Recorde topo = pilha.peek();

                if(topo == null || tempo < topo.getTempo()){
                    if(pilha.push(novo))
                        System.out.println("Recorde adicionado!");
                    else
                        System.out.println("Pilha cheia!");
                }
                else{
                    System.out.println("Tempo pior que o recorde atual!");
                }
            }

            if(opcao == 2){
                System.out.println("Topo: " + pilha.peek());
            }

            if(opcao == 3){
                System.out.println("Removido: " + pilha.pop());
            }

            if(opcao == 4){
                System.out.println(pilha);
            }
        }

        sc.close();
    }
}