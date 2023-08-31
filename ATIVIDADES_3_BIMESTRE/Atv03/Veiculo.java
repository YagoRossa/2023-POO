/*
Classe impressão de texto: "Veiculo.java"
IFPR - Campus Cascavel
Aluno: Yago Rossa
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
*/

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    
    // Construtor da classe Veiculo
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    // Obtém a marca do veículo
    public String getMarca() {
        return marca;
    }
    
    // Define a marca do veículo
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    // Obtém o modelo do veículo
    public String getModelo() {
        return modelo;
    }
    
    // Define o modelo do veículo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // Obtém o ano do veículo
    public int getAno() {
        return ano;
    }
    
    // Define o ano do veículo
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Exibe os detalhes do veículo (marca, modelo e ano)
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}