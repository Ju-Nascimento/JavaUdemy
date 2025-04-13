import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double total = 0;

        do {
            System.out.println("Bem vindo, escolha um pedido: ");
            System.out.println("1 - Hamburger R$ 10");
            System.out.println("2 - Pizza R$ 25");
            System.out.println("3 - Açaí R$ 8");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Você escolheu hamburger");
                    total += 10;
                    break;
                case 2:
                    System.out.println("Você escolheu Pizza");
                    total += 25;
                    break;
                case 3:
                    System.out.println("Você escolheu Açaí");
                    total += 8;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Escolha uma opção valida !!!");
                }


        }
        while (opcao != 0);
        System.out.println("Finalizando pedido");
        System.out.printf("O Total da sua conta é: %.2f", total);
        }
    }

