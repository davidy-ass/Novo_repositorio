public class loops {
    public static void main(String[] args) {
        // Exemplo 1: Tabuada do 7
        System.out.println("== Tabuada do 7 ==");

        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }

        // Exemplo 2: Contagem regressiva
        System.out.println("\n=== Contagem regressiva ===");
        for (int p = 10; p >= 1; p--) {
            System.out.println(p);
        }
        System.out.println("Lançar!");
    }
}
