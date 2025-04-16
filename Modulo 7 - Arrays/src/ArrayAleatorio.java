import java.util.Random;
public class ArrayAleatorio {
    public static void main(String[] args) {
        /* Crie um programa Java que preencha um array de inteiros com valores aleatórios
        entre 1 e 50 e, em seguida, imprima a média dos valores maiores que 25 */

        Random random = new Random();

        int[] numeros = new int[10];
        double soma = 0;
        int contador = 0;

        for (int i = 0; i < numeros.length ; i++){
            numeros[i] = random.nextInt(50);
            if (numeros[i]>25) {
                soma += numeros[i];
                contador++;
            }
        }
        for (int imprimir : numeros){
            System.out.println(imprimir);
        }
        double media = soma / contador;
        System.out.println("A media dos numeros maiores que 25 é: " +media);

    }
}
