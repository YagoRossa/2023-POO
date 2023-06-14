public class atvd05{ //criando a principal classe
    public static void main(String [] args){ //criando o principal metodo

           int gastosJaneiro = 50000; // inciando e dando valor a variavel
           int gastosFevereiro = 50000; // inciando e dando valor a variavel
           int gastosMarco = 50000; // inciando e dando valor a variavel

           int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; //calculo do gasto do trimestre 

           System.out.println("Total de gastos no Trimestre: " + gastosTrimestre);//print do gasto do trimestre

           calculoMensal(gastosTrimestre); //chamando o metodo calculomensal
    }
    public static void calculoMensal(int gastosTrimestre){ //criando um metodo para gasto mensal

           int mediaMensal = (gastosTrimestre/3); //calculo da media

           System.out.println("Valor da média mensal = " + mediaMensal); //print da media mensal
    }
}