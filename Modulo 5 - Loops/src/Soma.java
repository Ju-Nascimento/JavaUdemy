public class Soma {
    public static void main(String[] args) {
        // Escreva um programa Java que calcule a soma dos números de 1 a 100 usando um
        //loop while.

        int numero = 0;
        int soma = 0;

        while (numero <= 100){
            soma += numero;
            numero++;
        }
        System.out.println(soma);
    }
}
