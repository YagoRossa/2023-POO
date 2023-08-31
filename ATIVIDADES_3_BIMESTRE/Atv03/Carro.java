// Classe Carro, que herda da classe Veículo
public class Carro extends Veiculo {
private int numeroDePortas;

// Construtor da classe Carro
public Carro(String marca, String modelo, int ano, int numeroDePortas) {
    super(marca, modelo, ano); // Chama o construtor da classe base (Veículo)
    this.numeroDePortas = numeroDePortas;
}

// Método para obter o número de portas do carro
public int getNumeroDePortas() {
    return numeroDePortas;
}

// Método para definir o número de portas do carro
public void setNumeroDePortas(int numeroDePortas) {
    this.numeroDePortas = numeroDePortas;
}

// Sobrescreve o método exibirDetalhes da classe base Veículo
@Override
public void exibirDetalhes() {
    super.exibirDetalhes(); // Chama o método da classe base
    System.out.println("Número de Portas: " + numeroDePortas);
}
} // Fim da definição da classe Carro