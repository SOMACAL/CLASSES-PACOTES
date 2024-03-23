import java.util.Scanner;

public class Ex13 {
    public static void executar13() {
        Scanner scanner = new Scanner(System.in);
        
        int aptos = 0;
        int naoAptos = 0;
        
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String nome = scanner.next();
            String sexo = scanner.next();
            int idade = scanner.nextInt();
            String saude = scanner.next();
            
            if (sexo.equalsIgnoreCase("masculino") && idade >= 18 && saude.equalsIgnoreCase("apta")) {
                aptos++;
            } else if (sexo.equalsIgnoreCase("feminino") && idade >= 18 && saude.equalsIgnoreCase("apta")) {
                aptos++;
            } else {
                naoAptos++;
            }
        }
        
        System.out.println("Total aptos: " + aptos);
        System.out.println("Total não aptos: " + naoAptos);
        
    }
}
