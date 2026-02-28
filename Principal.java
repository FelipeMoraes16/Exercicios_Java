public class Principal {

    public static void main(String[] args) {

        Conta contaFelipe = new Conta("Não Informado", -100);
        Conta contaMaria = new Conta("Maria", 0);

        System.out.println();
        contaFelipe.exibirSaldo();

        contaFelipe.setTitular("Felipe Moraes");
        contaFelipe.depositar(-100);
        contaFelipe.depositar(100);
        contaFelipe.sacar(30);

        contaFelipe.exibirSaldo();
        System.out.println();

        contaMaria.exibirSaldo();
        contaMaria.sacar(100);

        contaMaria.exibirSaldo();
        System.out.println();

        System.out.println("Teste Poupança");

        ContaPoupanca poupancaMaria = new ContaPoupanca("Maria Silva", 0);

        System.out.println();
        poupancaMaria.exibirSaldo();
        poupancaMaria.aplicarRendimento(10);
        poupancaMaria.exibirSaldo(); 
        System.out.println();  
    }
    
}
