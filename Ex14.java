import java.util.Scanner;

public class Ex14 {
    public static void executar14() {
        Scanner scanner = new Scanner(System.in);

        final int totalProdutos = 40;
        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;
        int lucro = 0;
        int prejuizo = 0;
        int empate = 0;

        for (int i = 0; i < totalProdutos; i++) {
            System.out.print("Digite o preço de custo do produto " + (i + 1) + ": ");
            double precoCusto = scanner.nextDouble();
            System.out.print("Digite o preço de venda do produto " + (i + 1) + ": ");
            double precoVenda = scanner.nextDouble();

            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;

            if (precoVenda > precoCusto) {
                lucro++;
                System.out.println("Produto " + (i + 1) + ": Lucro");
            } else if (precoVenda < precoCusto) {
                prejuizo++;
                System.out.println("Produto " + (i + 1) + ": Prejuízo");
            } else {
                empate++;
                System.out.println("Produto " + (i + 1) + ": Empate");
            }
        }

        System.out.println("\nTotal de produtos com lucro: " + lucro);
        System.out.println("Total de produtos com prejuízo: " + prejuizo);
        System.out.println("Total de produtos com empate: " + empate);
        System.out.println("Média de preço de custo: " + (somaPrecoCusto / totalProdutos));
        System.out.println("Média de preço de venda: " + (somaPrecoVenda / totalProdutos));

    }
}
