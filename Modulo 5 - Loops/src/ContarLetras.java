import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        int qtdLetras = 0;

        for (int i = 0; i < frase.length(); i++){
            char letra = frase.charAt(i);
            boolean isLetra = Character.isLetter(letra);
            if (isLetra){
                qtdLetras++;
            }
        }
        System.out.printf("A quantidade de letras na frase %s é %d",frase,qtdLetras);
    }
}
