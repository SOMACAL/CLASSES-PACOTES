import java.util.Scanner;

public class Ex11 {
    public static void executar11() {
        Scanner scanner = new Scanner(System.in);
        
        int totalHomens = 0;
        int totalMulheres = 0;
        
        for (int i = 0; i < 56; i++) {
            String nome = scanner.nextLine();
            String sexo = scanner.nextLine();
            
            if (sexo.equalsIgnoreCase("masculino")) {
                totalHomens++;
            } else if (sexo.equalsIgnoreCase("feminino")) {
                totalMulheres++;
            }
        }
        
        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
        
    }
}
