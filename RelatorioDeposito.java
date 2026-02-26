import java.util.ArrayList;
import java.util.Scanner;

public class RelatorioDeposito {
    
    public static void main(String[] args) {
        
        ArrayList<String> clientes = new ArrayList<>();
        Scanner entrada = new Scanner(System.in, "UTF-8");
        double valorDeposito = 0;
        
        for(int i = 0; i < 3; i ++){

            try{
                System.out.print("Digite o valor do deposito: ");
                double valorEntrada = entrada.nextDouble();
                valorDeposito = valorEntrada;
            }

            catch(java.util.InputMismatchException e){
                System.out.println("Erro: Digite apenas números. Por favor tente novamente");
                i--;
                entrada.next();
                continue;
            }
            
            if (valorDeposito <= 0){
                System.out.println("Erro: Digite valores acima de zero. Por favor tente novamente");
                i--;
                continue;
            }

            else{
                System.out.print("Digite seu nome: ");
                String nome = entrada.next();
                clientes.add(String.format("%s depositou R$ %.2f",nome, valorDeposito));
            }
   
        }

        for(String cliente:clientes){
            System.out.println(cliente);
        }

        entrada.close();

    }

}
