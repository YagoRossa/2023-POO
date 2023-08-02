package ATIVIDADES.atividade_09;

public class atvd09 {
    public static void main(String[] args) {
        // Declaração, alocação e inicialização do array "vetor"
        int[] vetor = {123, 32, 1, 5, 7, 4, 86, 1, 3, 10};

        // Chamando o método exibirNumeros para exibir o conteúdo do array "vetor"
        exibirNumeros(vetor);

        // Declaração, alocação e inicialização do array "vetor2"
        int[] vetor2 = {32, 23, 12, 54, 2, 3, 1, 2, 3, 0};

        // Chamando o método somarNumeros para somar os elementos dos arrays "vetor" e "vetor2"
        somarNumeros(vetor, vetor2);
    }

    // Método que exibe os números de um array
    public static void exibirNumeros(int[] array) {
        System.out.println("Conteúdo do Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    // Método que realiza a soma de dois arrays
    public static void somarNumeros(int[] array1, int[] array2) {
        // Declaração e alocação do array "somaArray" com o mesmo tamanho do array "array1"
        int[] somaArray = new int[array1.length];

        // Realiza a soma dos elementos dos arrays e atribui o resultado ao array "somaArray"
        for (int i = 0; i < array1.length; i++) {
            somaArray[i] = array1[i] + array2[i];
        }

        System.out.println();
        System.out.println("Resultado da soma dos arrays ↓");
        // Chamando o método exibirNumeros para exibir o array resultante da soma
        exibirNumeros(somaArray);
    }
}