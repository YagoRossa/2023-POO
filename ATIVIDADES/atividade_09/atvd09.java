package ATIVIDADES.atividade_09;

public class atvd09 {
    public static void main(String[] args) {
        // Declaração, alocação e inicialização do vetor "vetor"
        int[] vetor = {123, 32, 1, 5, 7, 4, 86, 1, 3, 10};

        // Chamando o método imprimirNumeros para imprimir o array
        imprimirNumeros(vetor);

        // Declaração, alocação e inicialização do vetor "vetor2"
        int[] vetor2 = {32, 23, 12, 54, 2, 3, 1, 2, 3, 0};

        // Chamando o método somaNumeros para somar os dois vetores
        somaNumeros(vetor, vetor2);
    }

    // Método que imprime os números de um array
    public static void imprimirNumeros(int[] array) {
        System.out.println("Saída do Vetor:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    // Método que realiza a soma de dois arrays
    public static void somaNumeros(int[] array, int[] array2) {
        // Declaração e alocação do vetor "arraySoma" com o tamanho do vetor "array"
        int[] arraySoma = new int[array.length];

        // Realiza a soma dos elementos dos arrays e atribui o resultado ao vetor "arraySoma"
        for (int i = 0; i < array.length; i++) {
            arraySoma[i] = array[i] + array2[i];
        }

        System.out.println();
        System.out.println("Saída do vetor somado ↓");
        // Chamando o método imprimirNumeros para imprimir o vetor resultante da soma
        imprimirNumeros(arraySoma);
    }
}