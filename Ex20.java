import java.util.Scanner;

public class Ex20 {
    public static void executar20() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int nivel = scanner.nextInt();

        double valorHoraAula;

        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível inválido. Digite 1, 2 ou 3.");
                scanner.close();
                return;
        }

        System.out.println("Digite o número de horas/aulas dadas:");
        int horasAulas = scanner.nextInt();

        double salario = valorHoraAula * horasAulas;

        System.out.println("O salário do professor é: R$" + salario);

    }
}
