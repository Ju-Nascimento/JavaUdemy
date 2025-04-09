import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Criando uma janela java
        JFrame janela = new JFrame();
        janela.setTitle("Ola mundo");

        //Define o tamanho
        janela.setSize(500, 500);

        // Quando clicar no "X" para a execução do programa
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Criando um texto na tela, um "label" e definindo a posição dele na tela
        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(20,20,50,20);

        //Manager null = Não usar o layout padrão
        janela.setLayout(null);

        JTextField campoTextNome = new JTextField();
        campoTextNome.setBounds(20,40,200,20);

        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(20,60,100,20);
        botaoEnviar.addActionListener(event ->{
            String nome = campoTextNome.getText();
            JOptionPane.showMessageDialog(janela,"Ola " + nome );


        });
        //Pega o label e exibe
        janela.getContentPane().add(campoTextNome);
        janela.getContentPane().add(labelNome);
        janela.getContentPane().add(botaoEnviar);
        janela.setVisible(true);
    }
}