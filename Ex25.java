import java.util.Scanner;

public class Ex25 {
    public static void executar25() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nome = scanner.nextLine();

        System.out.println("Digite o número de matrícula do estudante:");
        int matricula = scanner.nextInt();

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = scanner.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaAvaliacaoSemestral = scanner.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = scanner.nextDouble();

        double notaFinal = (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;

        System.out.println("Nome do estudante: " + nome);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Nota final: " + notaFinal);
        System.out.print("Classificação: ");

        if (notaFinal >= 8 && notaFinal <= 10) {
            System.out.println("A");
        } else if (notaFinal >= 7 && notaFinal < 8) {
            System.out.println("B");
        } else if (notaFinal >= 6 && notaFinal < 7) {
            System.out.println("C");
        } else if (notaFinal >= 5 && notaFinal < 6) {
            System.out.println("D");
        } else {
            System.out.println("R");
        }

    }
}
