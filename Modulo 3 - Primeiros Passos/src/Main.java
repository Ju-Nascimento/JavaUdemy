import javax.swing.*;

public class Main   {
    public static void main(String[] args) {

        JFrame janela = new JFrame();
        janela.setSize(500, 500);

        janela.setLayout(null);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel campoNome = new JLabel("Digite seu nome");
        campoNome.setBounds(20,20,200,20);
        JTextArea caixaNome = new JTextArea();
        caixaNome.setBounds(20,40,100,20);
        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(20,60,100,20);

        botaoEnviar.addActionListener(event ->{
            String mensagem = caixaNome.getText();
            JOptionPane.showMessageDialog(janela, "Bem vindo: " +mensagem);
        });

        janela.getContentPane().add(campoNome);
        janela.getContentPane().add(caixaNome);
        janela.getContentPane().add(botaoEnviar);

        janela.setVisible(true);


    }
}
