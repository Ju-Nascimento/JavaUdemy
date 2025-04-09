import java.sql.SQLOutput;
import java.util.Scanner;

public class Numeros {

    // Teste de uso dos laços de repetição
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Até que numero contar ?");
        int contar = sc.nextInt();
        int i = 0;
        int y = 0;

       System.out.printf("Numeros pares de %d até %d são: ", i,contar);
        while(i <= contar){
            System.out.println(i);
            i = i + 2;
            }
        System.out.printf("Numeros impares de %d até %d são: \n", y,contar);
        while (y <= contar){
            if(y % 2 == 1){
                System.out.println(y);
            }
            y++;
        }
        for (int x = 0; x <= contar; x++){
            System.out.println(x);

        }
        }
    }

