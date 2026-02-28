public class Conta {
    
    private String titular;
    private double saldo;

    // Construtor
    public Conta(String titularIncial, double saldoInicial){
        if (saldoInicial < 0){
            saldoInicial = 0;
        }
        this.titular = titularIncial;
        this.saldo = saldoInicial;
    }

    // Método para depositar
    void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado.%n", valor);
        }
        else{
            System.out.printf("Erro: Valor de depósito inválido.%n");
        }
    }

    // Método para sacar
    void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado.%n", valor);
        }
        else{
            System.out.printf("Erro: Saldo insuficiente ou valor inválido.%n");
        }
    }

    //Método para ver o saldo
    void exibirSaldo(){
        System.out.printf("Titular: %s | Saldo Atual: R$ %.2f%n", titular, saldo);
    }

    //Métodos Setters e Getters
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }
}
