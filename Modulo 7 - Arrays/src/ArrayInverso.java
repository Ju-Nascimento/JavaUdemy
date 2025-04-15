public class ArrayInverso {
    public static void main(String[] args) {
        /* Crie um programa Java que declare um array de strings com nomes de pessoas e
        imprima todos os nomes em ordem inversa.*/

        String[] nomes = {"Juan", "Maria", "Pedro", "Zé", "Tassia"};


        for (int i = nomes.length - 1 ; i >= 0; i--){
            System.out.println(nomes[i]);

        }
    }
}
