public class Maior {
    public static void main(String[] args) {
        /* Crie um programa Java que declare um array contendo 5 números double (ex: 10.5,
            20.7, 15.3, 40.2, 8.9) e encontre o maior elemento no array (resposta: 40.2) */

        double[] numeros = {10.5, 20.7, 15.3, 40.2, 8.9};

        double maiorNumero = numeros[0];

        for (int i =1; i < numeros.length; i++){
            if (maiorNumero < numeros[i]){
                maiorNumero = numeros[i];
            }

    }
        System.out.printf("O maior numero é: %.2f ", maiorNumero);
    }
}
