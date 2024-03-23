public class Ex16 {
    public static void executar16() {
        int totalFuncionarios = 584;
        double salarioMinimo = 1100; 
        
        double reajuste50 = 0.5;
        double reajuste20 = 0.2;
        double reajuste15 = 0.15;
        double reajuste10 = 0.1;
        
        int funcionariosReajuste50 = 0;
        int funcionariosReajuste20 = 0;
        int funcionariosReajuste15 = 0;
        int funcionariosReajuste10 = 0;
        
        for (int i = 0; i < totalFuncionarios; i++) {
         
           
            double salario = 1500; 
            if (salario < 3 * salarioMinimo) {
                salario *= (1 + reajuste50);
                funcionariosReajuste50++;
            } else if (salario >= 3 * salarioMinimo && salario < 10 * salarioMinimo) {
                salario *= (1 + reajuste20);
                funcionariosReajuste20++;
            } else if (salario >= 10 * salarioMinimo && salario < 20 * salarioMinimo) {
                salario *= (1 + reajuste15);
                funcionariosReajuste15++;
            } else {
                salario *= (1 + reajuste10);
                funcionariosReajuste10++;
            }
            
        }
        
    }
}
