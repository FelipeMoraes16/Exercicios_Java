public class Principal {

    public static void main(String[] args) {

        Conta contaFelipe = new Conta();

        contaFelipe.titular = "Felipe Moraes";
        contaFelipe.saldo = 100.00;

        contaFelipe.exibirSaldo();

        contaFelipe.depositar(50);
        contaFelipe.sacar(30);

        contaFelipe.exibirSaldo();
    }
    
}
