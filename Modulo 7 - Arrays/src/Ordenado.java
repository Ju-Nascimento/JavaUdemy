import java.util.Random;

public class Ordenado {
    public static void main(String[] args) {
        /* Crie um programa Java que declare um array de inteiros e verifique se ele está
        ordenado de forma crescente */
        Random random = new Random();

        int [] numeros = new int[5];
        boolean ordem = true;

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(10);
        }
        for (int i = 0; i < numeros.length -1; i++){
            if (numeros[i] > numeros[i + 1] ){
                ordem = false;
                break;
            }
            }
        for (int imprimir : numeros){
            System.out.println(imprimir);
        }
        if (ordem){
            System.out.println("Ordenado");
        }else {
            System.out.println("Não ordenado");

        }
    }
}
