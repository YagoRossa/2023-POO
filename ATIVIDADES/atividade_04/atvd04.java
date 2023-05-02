public class atvd04{ //criando a principal classe
    public static void main(String [] args){ //criando o principal metodo

        int gastosJaneiro = 50000; // Criando e dando valor a primeira variavel
        int gastosFevereiro = 50000; // Criando e dando valor a segunda variavel
        int gastosMarco = 50000; // Criando e dando valor a terceira variavel

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; //calculo para gastos do trimestre

        System.out.println("Total de gastos no Trimestre: " + gastosTrimestre); //printando resultado
    }
}