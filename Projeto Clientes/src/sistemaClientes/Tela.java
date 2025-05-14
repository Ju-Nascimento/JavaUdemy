package sistemaClientes;

import javax.swing.*;

public class Tela extends JFrame {

    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelGenero;

    private JTextField textNome;
    private JTextField textCpf;
    private JComboBox<Genero> textGenero;

    private JButton buttonSalvar;
    private JButton buttonCancelar;

    public void exibir() {
        setSize(600, 600);
        setTitle("Cadastro de Clientes");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        campos();
        botoes();
        setVisible(true);
    }

    public void campos() {


        labelNome = new JLabel("Nome:");
        labelNome.setBounds(20, 20, 100, 20);
        getContentPane().add(labelNome);

        textNome = new JTextField();
        textNome.setBounds(130, 20, 200, 20);
        getContentPane().add(textNome);

        labelCpf = new JLabel("CPF:");
        labelCpf.setBounds(20, 60, 100, 20);
        getContentPane().add(labelCpf);

        textCpf = new JTextField();
        textCpf.setBounds(130, 60, 200, 20);
        getContentPane().add(textCpf);

        labelGenero = new JLabel("Gênero:");
        labelGenero.setBounds(20, 100, 100, 20);
        getContentPane().add(labelGenero);

        textGenero = new JComboBox<>(Genero.values());
        textGenero.setBounds(130, 100, 200, 20);
        getContentPane().add(textGenero);

    }
    public void botoes(){
        buttonSalvar = new JButton("SALVAR");
        buttonSalvar.setBounds(130, 150, 100, 20);
        getContentPane().add(buttonSalvar);

        buttonCancelar = new JButton("CANCELAR");
        buttonCancelar.setBounds(230,150,100,20);
        getContentPane().add(buttonCancelar);
    }
}
