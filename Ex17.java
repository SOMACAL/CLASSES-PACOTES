import java.util.Scanner;

public class Ex17 {
    public static void executar17() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();
        
        double novoSalario;
        if (salarioFuncionario < 3 * salarioMinimo) {
            novoSalario = salarioFuncionario * 1.5;
        } else if (salarioFuncionario >= 3 * salarioMinimo && salarioFuncionario < 10 * salarioMinimo) {
            novoSalario = salarioFuncionario * 1.2;
        } else if (salarioFuncionario >= 10 * salarioMinimo && salarioFuncionario < 20 * salarioMinimo) {
            novoSalario = salarioFuncionario * 1.15;
        } else {
            novoSalario = salarioFuncionario * 1.1;
        }
        
        double aumento = novoSalario - salarioFuncionario;
        
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Reajuste: " + aumento);
        System.out.println("Novo salário: " + novoSalario);
        
    }
}
