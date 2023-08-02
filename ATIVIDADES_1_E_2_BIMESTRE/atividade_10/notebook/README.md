# Atividade Teste

Classe impressão de texto: "Main"  
IFPR - Campus Cascavel  
Aluno: Yago Kauã Rossa Rocha
Disciplina: Programação orientada a Objetos  
Professor: Nelson Bellincanta
```
=====================================PT1=============================================================

package ATIVIDADES.atividade_10;

public class atvd10_pt1 {
    // Atributos privados: nome, idade e altura
    private String nome;
    private int idade;
    private double altura;

    // Método get para retornar o nome do objeto como uma String
    public String getNome() {
        return nome;
    }

    // Método get para retornar a idade do objeto como um inteiro
    public int getIdade() {
        return idade;
    }

    // Método get para retornar a altura do objeto como um double
    public double getAltura() {
        return altura;
    }

    // Método set para definir o nome do objeto, recebendo um parâmetro do tipo String
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método set para definir a idade do objeto, recebendo um parâmetro do tipo int
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método set para definir a altura do objeto, recebendo um parâmetro do tipo double
    public void setAltura(double altura) {
        this.altura = altura;
    }
}

=====================================PT2=============================================================

package ATIVIDADES.atividade_10;

public class atvd10_pt2 { // Classe TestarPessoa

    public static void main(String[] args) {
        // Criando e instanciando os objetos pessoa1 e pessoa2
        atvd10_pt1 pessoa1 = new atvd10_pt1();
        atvd10_pt1 pessoa2 = new atvd10_pt1();

        // Utilizando os métodos set no objeto pessoa1
        pessoa1.setNome("Yago"); // Definindo o nome
        pessoa1.setIdade(16); // Definindo a idade
        pessoa1.setAltura(1.73); // Definindo a altura

        // Utilizando os métodos get no objeto pessoa1
        System.out.println("Métodos get do objeto pessoa1: \n"); // Mensagem de orientação
        System.out.println(pessoa1.getNome()); // Obtendo o nome
        int idadePessoa1 = pessoa1.getIdade(); // Variável idadePessoa1 recebe o retorno do método getIdade de pessoa1
        System.out.println(idadePessoa1); // Saída da variável idadePessoa1
        System.out.println(pessoa1.getAltura()); // Obtendo a altura do objeto pessoa1

        pessoa2.setNome("Maick");
        pessoa2.setIdade(15);
        pessoa2.setAltura(1.70);
        
        System.out.println("\nMétodos get do objeto pessoa2: \n");
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getAltura());
    }
}

```
