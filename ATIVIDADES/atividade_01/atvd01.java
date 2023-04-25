import java.util.Scanner; //importando o metodo Scanner

/**
 * atvd01
 */
public class atvd01 { // criando a classe principal 
    
    static Scanner LER = new Scanner(System.in); // criando metodo e baixando Scanner
    public static void main(String[] args) { //criando o metodo principal
        
        float num1 = 0f; // criando variavel para o primeiro numero
        float num2 = 0f; // criando variavel para o segundo numero
        float calcular = 0f; // criando variavel para o calculo 
        num1 = lerNum1(num1); // chamando o metodo "lerNum1" e retornando o valor para a variavel "num1"
        num2 = lerNum2(num2); // chamando o metodo "lerNum2" e retornando o valor para a variavel "num2"
        calcular = fazerCalculo(num1, num2, calcular); // chamando o metodo "fazerCalculo" e retornando o valor para a variavel "calcular"
        imprimir(num1, num2, calcular); // chamando o metodo para imprimir resultado
    }
        public static float lerNum1(float num1){ // criando primeiro metodo
            System.out.println("Digite o primeiro numero: "); // pedindo ao usuario o primeiro numero
            num1 = LER.nextInt(); // dando o valor de entrada ao usuario
            
        return num1; //retornando ao main o numero1
        }
    
        public static float lerNum2(float num2){ // criando segundo metodo
            System.out.println("Digite o segundo numero: "); //pedindo ao usuario o segundo numero
            num2 = LER.nextInt(); // dando o valor de entrada ao usuario
            
        return num2; //retornando ao main o numero2
        }
    
        public static float fazerCalculo(float num1, float num2, float calcular){ // criando terceiro metodo
            calcular = num1 + num2; // fazendo calculo num1 + num2
        return calcular; //retornando ao main o resultado do calculo
        }
        
        public static void imprimir(float num1, float num2, float calcular){ // criando quarto metodo
            System.out.printf("O resultado da soma é: %n%.2f + %.2f = %.2f", num1, num2, calcular); //printando para o usuario a conta e o resultado usando printf



        }

}
