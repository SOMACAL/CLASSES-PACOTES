import java.util.Scanner;

public class Ex26 {
    public static void executar26() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do pretendente:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = scanner.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println("Desculpe, o pretendente não se enquadra em nenhuma das categorias ofertadas.");
        } else {
            System.out.println("Digite o grupo de risco do pretendente (Baixo, Médio ou Alto):");
            String grupoRisco = scanner.next().toLowerCase();

            int categoria = 0;

            if (idade >= 17 && idade <= 20) {
                switch (grupoRisco) {
                    case "baixo":
                        categoria = 1;
                        break;
                    case "médio":
                        categoria = 2;
                        break;
                    case "alto":
                        categoria = 3;
                        break;
                    default:
                        System.out.println("Grupo de risco inválido.");
                        return;
                }
            } else if (idade >= 21 && idade <= 24) {
                switch (grupoRisco) {
                    case "baixo":
                        categoria = 2;
                        break;
                    case "médio":
                        categoria = 3;
                        break;
                    case "alto":
                        categoria = 4;
                        break;
                    default:
                        System.out.println("Grupo de risco inválido.");
                        return;
                }
            } else if (idade >= 25 && idade <= 34) {
                switch (grupoRisco) {
                    case "baixo":
                        categoria = 3;
                        break;
                    case "médio":
                        categoria = 4;
                        break;
                    case "alto":
                        categoria = 5;
                        break;
                    default:
                        System.out.println("Grupo de risco inválido.");
                        return;
                }
            } else if (idade >= 35 && idade <= 64) {
                switch (grupoRisco) {
                    case "baixo":
                        categoria = 4;
                        break;
                    case "médio":
                        categoria = 5;
                        break;
                    case "alto":
                        categoria = 6;
                        break;
                    default:
                        System.out.println("Grupo de risco inválido.");
                        return;
                }
            } else if (idade >= 65 && idade <= 70) {
                switch (grupoRisco) {
                    case "baixo":
                        categoria = 7;
                        break;
                    case "médio":
                        categoria = 8;
                        break;
                    case "alto":
                        categoria = 9;
                        break;
                    default:
                        System.out.println("Grupo de risco inválido.");
                        return;
                }
            }

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Categoria de seguro: " + categoria);
        }

        scanner.close();
    }
}
