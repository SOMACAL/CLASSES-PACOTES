import java.util.Scanner;

public class Ex15 {
    public static void executar15() {
        Scanner scanner = new Scanner(System.in);
        
        double totalDesconto = 0;
        double totalPago = 0;
        
        while (true) {
            System.out.print("Digite o valor do veículo (0 para encerrar): ");
            double valorVeiculo = scanner.nextDouble();
            if (valorVeiculo == 0) {
                break;
            }
            
            System.out.print("Digite o tipo de combustível (álcool, gasolina ou diesel): ");
            String tipoCombustivel = scanner.next();
            
            double desconto;
            switch (tipoCombustivel.toLowerCase()) {
                case "álcool":
                    desconto = valorVeiculo * 0.25;
                    break;
                case "gasolina":
                    desconto = valorVeiculo * 0.21;
                    break;
                case "diesel":
                    desconto = valorVeiculo * 0.14;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido.");
                    continue;
            }
            
            totalDesconto += desconto;
            totalPago += valorVeiculo - desconto;
            
            System.out.println("Desconto: " + desconto);
            System.out.println("Valor a ser pago: " + (valorVeiculo - desconto));
        }
        
        System.out.println("Total de desconto: " + totalDesconto);
        System.out.println("Total pago pelos clientes: " + totalPago);
        

    }
}
