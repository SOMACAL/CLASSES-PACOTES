import java.util.Scanner;

public class Ex7 {
    public static void executar7() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        
        double impostos = 0.45 * custoFabrica;
        
        double percentualDistribuidor = 0.28;
        double custoConsumidor = custoFabrica + impostos + (percentualDistribuidor * (custoFabrica + impostos));
        
        System.out.println("\nO custo ao consumidor do carro é: R$" + custoConsumidor);
        
    }
}
