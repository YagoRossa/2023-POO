# Atividade Teste

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluno: Yago Kauã Rossa Rocha
Disciplina: Programação orientada a Objetos  
Professor: Nelson Bellincanta
```
import javax.swing.JOptionPane; //importando o JOptionPane

public class atvd07{ //criando a principal classe


	public static void main(String[] args) {  //criando o principal metodo

		String auxiliar; // string axuliar 
        double vetor[] = new double[5]; //declaração, alocação do vetor

        
        for (int i = 0; i < 5; i++){ //for para repetir 5 vezes a entrada da nota

            auxiliar = JOptionPane.showInputDialog("Entre com a nota da primeira prova"); //pedindo ao usuario dados com a classe JOptionPane
            vetor[i] = Float.parseFloat(auxiliar);  //conversao dos dados para float e armazenando os dados no vetor

        } 

        // organizando o vetor de maneira decrescente

        boolean repetir; //boolean para se repetir o while
        do {
            repetir = false; //atribuindo false para a variavel repetir
             
            for (int i = 1; i < vetor.length; i++) { 
                if (vetor[i - 1] > vetor[i]) {  //se vetor(anterior) for maior que vetor(na posição i)
                    double temp = vetor[i - 1];   //se verdadeiro troca a ordem dos dois valores com ajuda da variavel temp
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    repetir = true; //repetir recebe true pois deve se comparar novamente 
                }
            }
        } while (repetir);

        double media_aritimetica; //colocando a variavel para ser a media das notas
        //colocando e inicializando a variavel soma_notas
        double soma_notas = 0; // antes de criar a media, somar todas as notas do vetor

        String notas_ordenadas = ""; // string para adicionar as notas ja ordenadas

        for (int i = 0; i < vetor.length; i++){  //for para somar todas as notas do vetor e colocar na variavel em string as notas ja ordenadas 

            notas_ordenadas +=  vetor[i] + ", "; // adicionando a nota na variavel notas_ordenadas
            soma_notas += vetor[i]; // adicionando a nota da posinçao i do vetor

        } 

        media_aritimetica = soma_notas / vetor.length; //divisao pelo numero de notas 

        JOptionPane.showMessageDialog(null, "Notas organizadas = " + notas_ordenadas + " \n " + " Media das notas = " + media_aritimetica);  //printando resultado
        
	}
}


```
