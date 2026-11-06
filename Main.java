public class Main {
    public static void main(String[] args) {
        
        // Criando o primeiro objeto Carro
        Carro carro1 = new Carro();
        carro1.modelo = "Civic";
        carro1.cor = "Preto";
        carro1.ano = 2025;

        //Criando o segundo objeto Carro
        Carro carro2 = new Carro();
        carro2.modelo = "Gol";
        carro2.cor = "Branco";
        carro2.ano = 2011;

        // Usando os Métodos
        carro1.exibirInfo();
        carro1.acelerar(60);
        carro1.acelerar(40);
        carro1.frear(30);

        System.out.println();
        carro2.acelerar(80);
    }
}
