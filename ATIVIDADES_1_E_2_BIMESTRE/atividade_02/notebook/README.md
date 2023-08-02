# Atividade Teste

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluno: Yago Kauã Rossa Rocha
Disciplina: Programação orientada a Objetos  
Professor: Nelson Bellincanta
```
import java.util.Scanner; //importando o metodo Scanner

public class atvd02{ //criando a classe principal 

    public static void main(String [] args){ //criando o metodo principal

        int num1 =0; //criando a variavel num1

        Scanner ent = new Scanner(System.in); // criando metodo e baixando Scanner

        System.out.print("Informe dois numeros inteiro: "); // pedindo ao usuario que informe 2 numeros inteiros
        int num2 = ent.nextInt(); // recebendo num2
        int num3 = ent.nextInt(); // recebendo num3

        num1 = calc(num1, num2, num3); //chamando o metodo para calcular e retornando como valor para a variavel num1

        System.out.printf("%n %d * %d = %d %n", num2, num3, num1); //printando os valores
    }
    public static int calc(int num1, int num2, int num3){ //criando um metodo para calcular
        num1 = (num2*num3); //calculando
        return num1; //retornando o num1
    }
    
}
```
