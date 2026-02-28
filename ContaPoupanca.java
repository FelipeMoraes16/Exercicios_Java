public class ContaPoupanca extends Conta {
    
    // Construr filha
    public ContaPoupanca(String titular, double saldoInincial){
        super(titular, saldoInincial);
    }

    public void aplicarRendimento(double percentual){
        if (percentual <= 0){
            System.out.println("Erro: Percentual menor ou igual 0.");
            return;
        }

        if(getSaldo() <= 0){
            System.out.println("Erro: Saldo insuficiente.");
            return;
        }

        double juros = getSaldo() * (percentual / 100);
        depositar(juros);
        System.out.printf("Rendimento de %.2f%% aplicado. Novo saldo atualizado.%n", percentual);
    }
    
}
