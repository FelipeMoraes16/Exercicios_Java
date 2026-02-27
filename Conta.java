public class Conta {
    
    String titular;
    double saldo;

    // Método para depositar
    void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado.%n", valor);
        }
        else{
            System.out.println("Erro: Valor de depósito inválido.%n");
        }
    }

    // Método para sacar
    void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado.%n", valor);
        }
        else{
            System.out.println("Erro: Saldo insuficiente ou valor inválido.%n");
        }
    }

    //Método para ver o saldo
    void exibirSaldo(){
        System.out.printf("Titular: %s | Saldo Atual: R$ %.2f%n", titular, saldo);
    }
}
