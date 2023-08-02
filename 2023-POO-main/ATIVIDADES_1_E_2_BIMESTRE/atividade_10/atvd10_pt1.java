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