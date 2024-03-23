//Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve 
// no semestre. No final informar o nome do aluno e a sua média (aritmética).

import java.util.Scanner;

public class Ex1 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        // Solicitar e ler as notas das três provas
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("\nNome do aluno: " + nomeAluno);
        System.out.println("Média: " + media);
        
    }
}
