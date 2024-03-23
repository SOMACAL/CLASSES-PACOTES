// Escrever um programa para determinar o consumo médio de um automóvel 
// sendo fornecida adistância total percorrida pelo automóvel e o total de combustível gasto.
import java.util.Scanner;

public class Ex2 {
    public static void executar2() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a distância total percorrida (em km): ");
        double distanciaTotal = scanner.nextDouble();
        
        System.out.print("Digite o total de combustível gasto (em litros): ");
        double combustivelGasto = scanner.nextDouble();
        
        double consumoMedio = distanciaTotal / combustivelGasto;
        
        System.out.println("\nO consumo médio do automóvel é: " + consumoMedio + " km/l");
        
     
    }
    
    
    
}
