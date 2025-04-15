public class Numeros {
    public static void main(String[] args) {
        /* Escreva um programa Java que declare e inicialize um array de inteiros com valores
        de 1 a 10 e, em seguida, imprima cada elemento do array.*/

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        // foreach
        System.out.println("Imprimindo com foreach");
        for (int i : numeros){
            System.out.println(i);
        }
    }
}
