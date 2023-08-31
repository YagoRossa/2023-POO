// Classe Moto, que herda da classe Veículo
public class Moto extends Veiculo {
private int cilindradas;

// Construtor da classe Moto
public Moto(String marca, String modelo, int ano, int cilindradas) {
    super(marca, modelo, ano); // Chama o construtor da classe base (Veículo)
    this.cilindradas = cilindradas;
}

// Método para obter as cilindradas da moto
public int getCilindradas() {
    return cilindradas;
}

// Método para definir as cilindradas da moto
public void setCilindradas(int cilindradas) {
    this.cilindradas = cilindradas;
}

// Sobrescreve o método exibirDetalhes da classe base Veículo
@Override
public void exibirDetalhes() {
    super.exibirDetalhes(); // Chama o método da classe base
    System.out.println("Cilindradas: " + cilindradas);
}
} // Fim da definição da classe Moto