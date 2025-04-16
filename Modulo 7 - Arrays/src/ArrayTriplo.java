import java.util.Random;

public class ArrayTriplo {
    public static void main(String[] args) {
        /* Escreva um programa Java que declare dois arrays de inteiros com o mesmo
tamanho e calcule a soma dos elementos correspondentes em ambos os arrays,
armazenando o resultado em um terceiro array. Em seguida, imprima o array
resultante. */
        Random random = new Random();

        int [] array1 = new int[5];
        int [] array2 = new int[5];
        int [] soma = new int[array1.length];

        for (int i = 0; i < array1.length; i++){
            array1[i] = random.nextInt(100);
            array2[i] = random.nextInt(100);
        }

        for (int i =0; i < array1.length; i++){
            soma[i] = array1[i] + array2[i];
        }
        for (int i = 0; i <array1.length; i++){
            System.out.println(array1[i] + " + " + array2[i] + " = " + soma[i]);
        }

    }
}
