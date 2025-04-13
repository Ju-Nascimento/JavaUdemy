import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        /* Escreva um programa Java que simule um sistema de autenticação. Solicite ao
        usuário que digite um nome de usuário e uma senha. Utilize uma expressão
        booleana para verificar se o nome de usuário é "admin" e a senha é "1234". Em caso
        afirmativo, exiba uma mensagem de sucesso; caso contrário, exiba uma mensagem
        de erro*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu usuario: ");
        String login = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        if (login.equals("admin") || senha.equals("1234")){
            System.out.println("Login feito com sucesso!!!");
            System.out.println("Considere mudar seu login e senha que são muito fáceis");
        }
        else {
            System.out.println("Erro");
        }


    }
}
