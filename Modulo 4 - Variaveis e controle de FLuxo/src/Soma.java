// import javax.swing.*;
import java.util.Scanner;
public class Soma {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.println(soma);


        /* Tentativa de usar as janelas

        JFrame janela = new JFrame();
        janela.setTitle("Calculadora de soma ");
        janela.setLayout(null);
        janela.setSize(500,500);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setVisible(true);

        JLabel campoNumero1 = new JLabel("Digite um numero");
        campoNumero1.setBounds(20,20,100,30);

        JTextField lerNumero1 = new JTextField();
        lerNumero1.setBounds(20,40,100,30);

        JLabel campoNumero2 = new JLabel("Digite outro numero: ");
        campoNumero2.setBounds(20,60,100,30);

        JTextField lerNumero2 = new JTextField();
        lerNumero2.setBounds(20,80,100,30);

        JButton botao = new JButton("Somar");
        botao.setBounds(20,100,50,30);
        botao.addActionListener(event ->{

        });

        janela.getContentPane().add(campoNumero1);
        janela.getContentPane().add(lerNumero1);
        janela.getContentPane().add(campoNumero2);
        janela.getContentPane().add(lerNumero2);
        janela.getContentPane().add(botao);

        */
    }
}