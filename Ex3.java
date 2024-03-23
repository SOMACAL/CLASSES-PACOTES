import java.util.Scanner;

public class Ex3 {
    public static void executar3() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();
        
        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o total de vendas efetuadas pelo vendedor (em dinheiro): ");
        double totalVendas = scanner.nextDouble();
        
        double comissao = 0.15 * totalVendas;
        
        double salarioFinal = salarioFixo + comissao;
        
        System.out.println("\nNome do vendedor: " + nomeVendedor);
        System.out.println("Salário fixo: R$" + salarioFixo);
        System.out.println("Salário no final do mês: R$" + salarioFinal);
        

    }
    
}
