import java.util.Random;

public class Aleatorios {
    public static void main(String[] args) {
        /* Escreva um programa Java que preencha um array de inteiros com valores
aleatórios entre 1 e 100 e, em seguida, imprima o índice do primeiro elemento par
encontrado no array. */
    Random random = new Random();

    int [] numeros = new int[10];

    for (int i = 0; i < numeros.length; i++){
        numeros[i] = random.nextInt(100) ;
        }

    for (int teste : numeros ){
            System.out.println(teste);
        }

    int par = 0;
    int numeroPar = 0;

    for (int i = 0; i < numeros.length; i++){
        if (numeros[i] % 2 == 0){
            par = i;
            numeroPar = numeros[i];
            break;
        }
        }

    if (par != -1){
        System.out.printf("O numero %d no indice %d é o primeiro numero par", numeroPar, par);
    }else {
        System.out.println("Não tem nenhum numero par no array");
    }
    }
}
