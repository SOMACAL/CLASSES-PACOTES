import java.util.Scanner;

public class Ex18 {
    public static void executar18() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();
        System.out.print("Digite o sexo do funcionário (M/F): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();
        
        double abono;
        if (sexo == 'M') {
            abono = (idade >= 30) ? 100.00 : 50.00;
        } else {
            abono = (idade >= 30) ? 200.00 : 80.00;
        }
        
        double salarioLiquido = salarioFixo + abono;
        
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Salário líquido: " + salarioLiquido);
        
    }
}
