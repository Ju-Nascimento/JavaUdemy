
public class Arrays {
    public static void main(String[] args) {

        String[] nomes = {"Juan ", "Yan ", "Thawan "};

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        String[] filhos = new String[3];
        int[] idades = {10, 12, 16};

        filhos[0] = "Joãzinho";
        filhos[1] = "Maria";
        filhos[2] = "Pedro";

        System.out.printf("%s tem %d anos",filhos[0], idades[0]);

        int[] numeros = {1, 2, 3, 4, 5};

        for (int numero : numeros) {
            System.out.println(numero);
        }
        String[] emails = {"juan@gmail.com", "teste@gmail.com", "fulano@gmail.com" };

        for (int i = 0; i < emails.length; i++) {
            System.out.println(emails[i]);
        }

        for (String email : emails){
            System.out.println(email);

        }
    }
}
