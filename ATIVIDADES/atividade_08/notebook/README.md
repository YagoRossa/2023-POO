# Atividade Teste

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluno: Yago Kauã Rossa Rocha
Disciplina: Programação orientada a Objetos  
Professor: Nelson Bellincanta
```
//importação da classe Scanner do pacote java.util
import java.util.Scanner; 

public class atvd08
{

    final static Scanner leitor = new Scanner(System.in); //prepara a entrada de dados
    final static String nomesClientes[] = new String[10]; //declaração e alocação do vetor assentos 
    final static boolean assentos[] = new boolean[10]; //declaração e alocação do vetor assentos 
    // 0 a 5 primeira classe
    // 6 a 10 classe economica
    // todos os assentos como false pois estão "vazios"


    public static void CompraAssento(){
        //mensagem de orientação
		System.out.println("Por favor digite 1 para Primeira Classe e digite 2 para Classe Econômica");

        //entrada para a classe de compra
        int entrada = leitor.nextInt();

        if (entrada == 1){ //se entrada == primeira classe
            int i = 0; // variavel para percorrer o vetor dos assentos
            boolean achouAssento = true; //variavel auxiliar para percorrer assentos e achar um assento false

            do{ //para percorrer pelo menos uma vez
                if (i == 5){ //apenas 5 assentos da primeira classe
                    //mensagens de orientação
                    System.out.println("===========================================\n");
                    System.out.println("Todos os assentos da primeira classe estão cheios");
                    System.out.println("===========================================\n");

                    for(int hj = 5; hj<11; hj++){ //percorrendo o vetor na classe economica
                        if (assentos[hj] == false){
                            //mensagens de orientação
                            System.out.println("Possuem assentos disponiveis na classe economica");
                            System.out.println("deseja comprar assentos ? (1 (sim) 2 (não)0)");

                            int a = leitor.nextInt(); //entrada para a resposta 

                            if (a == 1){
                                CompraAssento(); //chama a função para a compra novamente
                            } else{
                                //mensagens de orientação
                                System.out.println("===========================================\n");
                                System.out.println("Pena que não sera possivel realizar a compra :(");
                                System.out.println("===========================================\n");
                            }

                            break; //fim do for

                        }
                    }

                    break;
                }

                if (assentos[i] == false){ //se achou um assento vazio (false)
                    System.out.println("digite seu nome para a compra"); //mensagen de orientação
                    String nomeCliente = leitor.next(); //entrada do nome do cliente em String
                    nomesClientes[i] = nomeCliente; //adicionando no vetor o nome do cliente
                    assentos[i] = true; //colocando que o assento foi vendido
                    achouAssento = false; //achou um assento para de percorrer 
                } else{
                    i += 1; //vai para a proxima posição (proximo assento)
                }

            }while(achouAssento); //repete se nao achou um assento

        }
        if (entrada == 2){ //se entrada == classe economica
            int i = 5; //variavel que começa em 5 (assentos de 5 a 10)
            boolean achouAssento = true; //axiliando para achar um assentos

            do{ //repete pelo menos uma vez
                if (i == 10){ //apenas 5 assentos da classe economica
                    System.out.println("===========================================\n");
                    System.out.println("Todos os assentos da economica estão cheios");
                    System.out.println("===========================================\n");

                    for(int hj = 0; hj<6; hj++){ //for de 0 até 5 (primeira classe)
                        if (assentos[hj] == false){
                            System.out.println("Possuem assentos disponiveis na primeira classe");
                            System.out.println("deseja comprar assentos ? (1 (sim) 2 (não))");

                            int a = leitor.nextInt();

                            if (a == 1){
                                CompraAssento();
                            } else{
                                System.out.println("===========================================\n");
                                System.out.println("Pena que não sera possivel realizar a compra :(");
                                System.out.println("===========================================\n");
                            }

                            break;

                        }

                    }

                    System.out.println("===========================================\n");
                    System.out.println("infelizmente não há assentos disponiveis");
                    System.out.println("===========================================\n");

                    break;
                }

                if (assentos[i] == false){
                    System.out.println("digite seu nome para a compra");
                    String nomeCliente = leitor.next();
                    nomesClientes[i] = nomeCliente;
                    assentos[i] = true;
                    achouAssento = false;
                } else{
                    i += 1;
                }

            }while(achouAssento);

        }

        
    }

    
    
	public static void main(String[] args) { //primeira classe a ser executada no código

        //mensagens de orientação
        System.out.println("\n");
        System.out.println("bem vindo a novo sistema automatizado de reservas. \n");
        
        for (int i = 0; i<10; i++){ //repete 10x (10 assentos)

            System.out.println("\n A seguir os assentos disponiveis ou não");
            System.out.println("primeira classe a seguir: ");
            for(int a = 0; a<10; a++){ //repete 10x (10 assentos)
                //listando os assentos disponiveis
                System.out.println(assentos[a]+ "\t"+ nomesClientes[a]); 
                if (a == 4){
                System.out.println("classe economica a seguir: ");
                }
        }

            CompraAssento();
        }

        System.out.println("Todas os assentos lotados");
        System.out.println("Programa finalizado :)");
        System.out.println("©Copyright 2023 by Gabriel. All rights reversed.");

	}


    
}



```
