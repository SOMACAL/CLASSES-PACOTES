import java.util.Scanner;

public class Ex10 {
    public static void executar10() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int idade = scanner.nextInt();
            if (idade == 0) {
                break;
            }
            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }
        

    }
}
