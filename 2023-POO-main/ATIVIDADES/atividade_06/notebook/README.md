# Atividade Teste

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluno: Yago Kauã Rossa Rocha
Disciplina: Programação orientada a Objetos  
Professor: Nelson Bellincanta
```
import java.util.Scanner;

public class atvd06{ //criando a principal classe
     public static void main(String [] args){ //criando o principal metodo

          Scanner LER = new Scanner(System.in); //criando o objeto para scanner

          double depositoMensal; //criando uma variavel
          double montanteDesejado; //criando uma variavel
          int meses = 1; //criando uma variavel
          double contagem = 0; //criando uma variavel
          
          System.out.print("Digite o valor do deposito fixo mensal: "); //printando ao usuario uma pergunta
          depositoMensal = LER.nextDouble(); //dando o valor digitado da entrada para a variavel depositoMensal
          
          System.out.print("\nDigite o montante desejado: "); //printando ao usuario uma pergunta
          montanteDesejado = LER.nextDouble(); //dando o valor digitado da entrada para a variavel montanteDesejado

          //variavel contagem para colocar a junção dos salarios ao decorrer dos meses;
          contagem = depositoMensal; //a variavel contagem recebe primeiro o valor do deposito;
          
          while (contagem < montanteDesejado){ //um while enquanto a contagem for menor que o montante desejado;
              
              contagem = contagem + (depositoMensal * 1.005); //contagem recebe contagem + o salario mensal;
              meses = meses + 1; //contagem de meses que recebe os meses ao decorrer do tempo;
          
          }
          
          System.out.printf("%nSerá necessario %d meses até chegar no monte desejado!!", meses); //printando a quantidade de meses;

          System.out.printf("Valor adquirido nesses %d meses: R$%.2f \n", meses, contagem); //printando o valor adquirido dos meses;

     }
}
```
