import java.util.Scanner;

public class Ex22 {
    public static void executar22() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de cliente (1 para Residência, 2 para Comércio, 3 para Indústria):");
        int tipoCliente = scanner.nextInt();

        System.out.println("Digite a quantidade de kW/h consumidos:");
        double consumo = scanner.nextDouble();

        double valorKWh;

        switch (tipoCliente) {
            case 1:
                valorKWh = 0.60;
                break;
            case 2:
                valorKWh = 0.48;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
                scanner.close();
                return;
        }

        double valorConta = valorKWh * consumo;

        System.out.println("O valor da conta de luz é: R$" + valorConta);

    }
}
