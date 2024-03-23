import java.util.Scanner;

public class Ex19 {
    public static void executar19() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os três valores inteiros representando os lados do triângulo:");
        int lado1 = scanner.nextInt();
        int lado2 = scanner.nextInt();
        int lado3 = scanner.nextInt();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isóscele");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Esses valores não formam um triângulo.");
        }

    }
}
