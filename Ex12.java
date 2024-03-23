import java.util.Scanner;

public class Ex12 {
    public static void executar12() {
        Scanner scanner = new Scanner(System.in);
        
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;
        
        while (true) {
            int ano = scanner.nextInt();
            if (ano == 0) {
                break;
            }
            double desconto;
            if (ano <= 2000) {
                desconto = 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = 0.07;
            }
            double preco = scanner.nextDouble();
            double valorDesconto = preco * desconto;
            double precoFinal = preco - valorDesconto;
            System.out.println("Valor do desconto: " + valorDesconto);
            System.out.println("Valor a ser pago: " + precoFinal);
            totalGeral++;
        }
        
        System.out.println("Total de carros até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral: " + totalGeral);
 
    }
}
