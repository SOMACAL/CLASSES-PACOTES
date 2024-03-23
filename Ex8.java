import java.util.Scanner;

public class Ex8 {
    public static void executar8() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("\nNome do aluno: " + nomeAluno);
        if (media >= 7) {
            System.out.println("Menção: Aprovado");
        } else if (media <= 5) {
            System.out.println("Menção: Reprovado");
        } else {
            System.out.println("Menção: Recuperação");
        }
        
    }
}
