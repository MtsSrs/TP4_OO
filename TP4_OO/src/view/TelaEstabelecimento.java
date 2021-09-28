package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleCliente;
import control.ControleDados;
import control.ControleEstabelecimento;

public class TelaEstabelecimento implements ActionListener, ListSelectionListener {
    private JFrame janela = new JFrame("Estabelecimentos");
    private JLabel titulo = new JLabel("Lista de estabelecimentos");
    private JList<String> listaDeEstabelecimentos;
    private JButton cadastrar = new JButton("Cadastrar");
    private JButton refresh = new JButton("Refresh");
    private String[] listaEnderecos = new String [50];
    private static ControleDados dados;

    public void TelaMostraEstabelecimento(ControleDados d) {
        dados = d;
        listaEnderecos = new ControleEstabelecimento(d).getEnderecoEstabelecimento();
        listaDeEstabelecimentos = new JList<String>(listaEnderecos);
        janela = new JFrame("Estabelecimentos");
        titulo = new JLabel("Lista de estabelecimentos");

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(120,10,200,30);
        listaDeEstabelecimentos.setBounds(20, 50, 350, 230);
        listaDeEstabelecimentos.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaDeEstabelecimentos.setVisibleRowCount(10);

        cadastrar.setBounds(50, 300, 100, 30);
        refresh.setBounds(250, 300, 100, 30);

        janela.setLayout(null);

        janela.add(titulo);
        janela.add(listaDeEstabelecimentos);
        janela.add(cadastrar);
        janela.add(refresh);

        janela.setSize(400, 400);
        janela.setVisible(true);

        cadastrar.addActionListener(this);
        refresh.addActionListener(this);
        listaDeEstabelecimentos.addListSelectionListener(this);
    }
public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == cadastrar)
            new TelaCadastroEstabelecimento().cadastrarEstabelecimento(dados);;

        if(src == refresh)
            listaDeEstabelecimentos.setListData(new ControleEstabelecimento(dados).getEnderecoEstabelecimento());
            listaDeEstabelecimentos.updateUI();
    }

    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        if(e.getValueIsAdjusting() && src == listaDeEstabelecimentos) {
            new TelaCadastroEstabelecimento().editarEstabelecimento(dados, listaDeEstabelecimentos.getSelectedIndex());
        }
    }
}