import java.util.Scanner; //importando o metodo Scanner

public class atvd02{ //criando a classe principal 

    public static void main(String [] args){ //criando o metodo principal

        int num1 =0; //criando a variavel "a"

        Scanner ent = new Scanner(System.in); //declarando o scanner como objeto

        System.out.print("Informe dois Inteiro: "); //Imprimindo uma mensagem pedindo dois inteiros
        int num2 = ent.nextInt(); int num3 = ent.nextInt(); // recebendo os dois valores na mesma linha

        num1 = calc(num1, num2, num3); //chamando o metodo para calcular e dando o retorno como valor para a variavel "a"

        System.out.printf("%n %d * %d = %d %n", num2, num3, num1); //Imprimindo os valores
    }
    public static int calc(int num1, int num2, int num3){ //criando um metodo secundario para calcular
        num1 = (num2*num3); //calculo sinples
        return num1; //retorna a
    }
}