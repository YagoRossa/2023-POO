public class Teste {
    public static void main(String[] args) {
        // Cria um objeto da classe Carro, passando valores para o construtor
        Carro carroObj = new Carro("Toyota", "Corolla", 2022, 4);
        
        // Chama o método exibirDetalhes do objeto Carro para mostrar informações
        carroObj.exibirDetalhes();
        System.out.println();

        // Cria um objeto da classe Moto, passando valores para o construtor
        Moto motoObj = new Moto("Honda", "CBR500R", 2021, 500);
        
        // Chama o método exibirDetalhes do objeto Moto para mostrar informações
        motoObj.exibirDetalhes();
    }
}