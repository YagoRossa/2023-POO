
// Importação da classe Scanner do pacote java.util
import java.util.Scanner;

public class atvd08 {
    final static Scanner leitor = new Scanner(System.in); // Prepara a entrada de dados
    final static String nomesClientes[] = new String[10]; // Declaração e alocação do vetor de nomes dos clientes
    final static boolean assentos[] = new boolean[10]; // Declaração e alocação do vetor de assentos
    // Assentos de 0 a 5 pertencem à primeira classe
    // Assentos de 6 a 10 pertencem à classe econômica
    // Todos os assentos são inicializados como false, indicando que estão "vazios"

    public static void CompraAssento() {
        // Mensagem de orientação
        System.out.println("Por favor, digite 1 para Primeira Classe e 2 para Classe Econômica");

        // Entrada para a classe de compra
        int entrada = leitor.nextInt();

        if (entrada == 1) { // Se a entrada for igual a 1 (primeira classe)
            int i = 0; // Variável para percorrer o vetor de assentos
            boolean achouAssento = true; // Variável auxiliar para percorrer os assentos e encontrar um assento vazio

            do { // Executa pelo menos uma vez
                if (i == 5) { // Apenas 5 assentos na primeira classe
                    // Mensagem de orientação
                    System.out.println("Todos os assentos da primeira classe estão ocupados");
                    for (int hj = 5; hj < 11; hj++) { // Percorrendo o vetor na classe econômica
                        if (assentos[hj] == false) {
                            // Mensagem de orientação
                            System.out.println("Existem assentos disponíveis na classe econômica");
                            System.out.println("Deseja comprar assentos? (1 - Sim, 2 - Não)");

                            int a = leitor.nextInt(); // Entrada para a resposta

                            if (a == 1) {
                                CompraAssento(); // Chama a função para a compra novamente
                            } else {
                                // Mensagem de orientação
                                System.out.println("Pena que não será possível realizar a compra :(");
                            }

                            break; // Fim do loop

                        }
                    }

                    break;
                }

                if (assentos[i] == false) { // Se encontrou um assento vazio (false)
                    System.out.println("Digite seu nome para a compra"); // Mensagem de orientação
                    String nomeCliente = leitor.next(); // Entrada do nome do cliente como String
                    nomesClientes[i] = nomeCliente; // Adicionando o nome do cliente ao vetor
                    assentos[i] = true; // Marcando o assento como ocupado
                    achouAssento = false; // Encontrou um assento, encerra o loop
                } else {
                    i += 1; // Vai para a próxima posição (próximo assento)
                }

            } while (achouAssento); // Repete enquanto não encontrar um assento

        }
        if (entrada == 2) { // Se a entrada for igual a 2 (classe econômica)
            int i = 5; // Variável que começa em 5 (assentos de 5 a 10)
            boolean achouAssento = true; // Auxiliar para encontrar assentos

            do { // Repete pelo menos uma vez
                if (i == 10) { // Apenas 5 assentos na classe econômica
                    System.out.println("Todos os assentos da classe econômica estão ocupados");

                    for (int hj = 0; hj < 6; hj++) { // Loop de 0 a 5 (primeira classe)
                        if (assentos[hj] == false) {
                            System.out.println("Existem assentos disponíveis na primeira classe");
                            System.out.println("Deseja comprar assentos? (1 - Sim, 2 - Não)");

                            int a = leitor.nextInt();

                            if (a == 1) {
                                CompraAssento();
                            } else {
                                System.out.println("Pena que não será possível realizar a compra :(");
                            }

                            break;
                        }
                    }

                    System.out.println("Infelizmente, não há assentos disponíveis");
                    break;
                }

                if (assentos[i] == false) {
                    System.out.println("Digite seu nome para a compra");
                    String nomeCliente = leitor.next();
                    nomesClientes[i] = nomeCliente;
                    assentos[i] = true;
                    achouAssento = false;
                } else {
                    i += 1;
                }

            } while (achouAssento);

        }

    }

    public static void main(String[] args) { // Primeira função a ser executada no código

        System.out.println("\nBem-vindo ao novo sistema automatizado de reservas.\n");
    
        for (int i = 0; i < 10; i++) { // Repete 10 vezes (10 assentos)
    
            System.out.println("\nA seguir, os assentos disponíveis ou ocupados:");
            System.out.println("Primeira classe a seguir:");
            for (int a = 0; a < 10; a++) { // Repete 10 vezes (10 assentos)
                System.out.println(assentos[a] + "\t" + nomesClientes[a]); // Lista os assentos disponíveis
                if (a == 4) {
                    System.out.println("Classe econômica a seguir:");
                }
            }
    
            CompraAssento();
        }
    
        System.out.println("Todos os assentos estão ocupados.");
        System.out.println("Programa finalizado");
    }

}
