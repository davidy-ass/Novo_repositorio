public class Carro {
    //Atributos (Caracteristicas do carro)
    String modelo;
    String cor;
    int ano;
    double velocidadeAtual;

    // Método para acelerar
    public void acelerar(double quantidade) {
        velocidadeAtual += quantidade;
        System.out.println(modelo + " acelerou! Velocidade atual: " + velocidadeAtual + "Km/h");
    }

    // Método para frear
    public void frear(double quantidade) {
        velocidadeAtual -= quantidade;
        if (velocidadeAtual > 0) velocidadeAtual = 0;
        System.out.println(modelo + " freou! Velocidade atual: " + velocidadeAtual + " Km/h");
    }

    //Método para exibir informações do carro
    public void exibirInfo() {
        System.out.println("=== Informações do Carro ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }
}