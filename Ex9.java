import java.util.Scanner;

public class Ex9 {
    public static void executar9() {
        Scanner scanner = new Scanner(System.in);
        
        int numerosNoIntervalo = 0;
        
        for (int i = 0; i < 80; i++) {
            int numero = scanner.nextInt();
            if (numero >= 10 && numero <= 150) {
                numerosNoIntervalo++;
            }
        }
        
        System.out.println("Total de números no intervalo entre 10 e 150: " + numerosNoIntervalo);
  
    }
}
