import javax.swing.JOptionPane; //Importando o metodo JOptionPane da classe javax.swing

public class atvd03 { //criando a classe principal
    public static void main(String[] args){ //criando o metodo principal

        String x; //Criando uma variavel do tipo String que recebe a entrada dentro da caixa

		float prova1, prova2, notatrabalho, media; //criando as variaveis tipo float
		
			x = JOptionPane.showInputDialog("Insira a nota da prova 1: "); //Iniciando a caixa e dando o valor para a variavel x
			prova1 = Float.parseFloat(x); // transformando o valor da variavel x String para a prova1 Float
			
			x = JOptionPane.showInputDialog("Insira a nota da prova 2: ");//Perguntando novamente na caixa pedindo um segundo numero
			prova2 = Float.parseFloat(x);// transformando o valor da variavel x String para a prova2 Flaot
			
            x = JOptionPane.showInputDialog("Insira a nota do trabalho: ");//Perguntando novamente na caixa pedindo um terceiro numero
		    notatrabalho = Float.parseFloat(x);// transformando o valor da variavel x String para a notatrabalho Float
			
            media= (prova1 + prova2 + notatrabalho) /3; //fazendo um calculo para a media
        
			JOptionPane.showMessageDialog(null, "Á media do aluno foi " + media); //printando na caixa a media
	
		System.exit(0); //sair da tela

    }
}