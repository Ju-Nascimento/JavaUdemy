package cadastroClientes.apresentação;

import cadastroClientes.dominio.Cliente;
import cadastroClientes.dominio.enums.tipoSexo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {
    private JLabel labelNome;
    private JLabel labelCPF;
    private JLabel labelSexo;

    private JTextArea campoNome;
    private JTextArea campoCpf;
    private JComboBox <tipoSexo> campoSexo;
    private JButton botaoSalvar;



    public TelaCadastro (){
        mostrarTela();
    }
    private void mostrarTela(){
        setSize(600, 500);
        setTitle("Cadastro de Clientes");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        this.adicionarCampos();
        this.adicionarBotoes();
        this.cadastrarFoto();

    }
    private void adicionarCampos(){
        labelNome = new JLabel("Nome: ");
        labelNome.setBounds(20,20,200,20);
        getContentPane().add(labelNome);

        campoNome = new JTextArea();
        campoNome.setBounds(70,20,200,20);
        getContentPane().add(campoNome);

        labelCPF = new JLabel("CPF: ");
        labelCPF.setBounds(20,60,200,20);
        getContentPane().add(labelCPF);

        campoCpf = new JTextArea();
        campoCpf.setBounds(70,60,200,20);
        getContentPane().add(campoCpf);

        labelSexo = new JLabel("Genero: ");
        labelSexo.setBounds(20,100,200,20);
        getContentPane().add(labelSexo);

        tipoSexo [] tipoSexo = {null, cadastroClientes.dominio.enums.tipoSexo.MASCULINO,
                cadastroClientes.dominio.enums.tipoSexo.OUTROS,
                cadastroClientes.dominio.enums.tipoSexo.FEMININO,
                cadastroClientes.dominio.enums.tipoSexo.NÃO_BINARIO};
        campoSexo = new JComboBox<>(tipoSexo);
        campoSexo.setBounds(70,100,200,20);
        getContentPane().add(campoSexo);



    }
    private void adicionarBotoes(){
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(20, 140, 100,20);
        getContentPane().add(botaoSalvar);

        botaoSalvar.addActionListener(functionSalvar());

    }
    private void cadastrarFoto(){

    }
    private ActionListener functionSalvar (){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNome(campoNome.getText());
                cliente.setCpf(campoCpf.getText());
                cliente.setSexo((tipoSexo) campoSexo.getSelectedItem());

                JOptionPane.showMessageDialog(null, cliente);
            }
        };

    }
}
