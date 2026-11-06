
public class condicionais {
    public static void main(String[] args) {
        
        double _saldo = 100.00;
        double _saque = 500.00;

        if (_saldo >= _saque) {
            System.out.println("Saque autorizado! Novo saldo: R$ " + (_saldo - _saque));

        } else {
                System.out.println("Saldo insuficiente. Saque negado!!");
        }
    }
    
}
