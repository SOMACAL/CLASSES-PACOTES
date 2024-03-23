import java.util.Scanner;

public class Ex5 {
    public static void executar5() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        
        double valorPrestacao = valorCompra / 5;
        
        System.out.println("\nO valor de cada prestação é: R$" + valorPrestacao);
        
        
    }
    
}
