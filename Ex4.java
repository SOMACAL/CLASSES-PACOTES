import java.util.Scanner;

public class Ex4 {
    public static void executar4() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a cotação do dólar (US$ para R$): ");
        double cotacaoDolar = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de dólares disponíveis: ");
        double quantidadeDolares = scanner.nextDouble();
        
        double valorEmReais = cotacaoDolar * quantidadeDolares;
        
        System.out.println("\nO valor em reais é: R$" + valorEmReais);
        
       
    }
}
  
