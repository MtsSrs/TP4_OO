package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleDados;
import control.ControleEstabelecimento;

/**
 * Contém os métodos e os elementos da interface gráfica de estabelecimento
 * @author Mateus Caltabiano e Matheus Soares
 * @version 1.0 (Out 2021)
 */
public class TelaEstabelecimento implements ActionListener, ListSelectionListener {
    private JFrame janela = new JFrame("Estabelecimentos");
    private JLabel titulo = new JLabel("Lista de estabelecimentos");
    private JList<String> listaDeEstabelecimentos;
    private JButton cadastrar = new JButton("Cadastrar");
    private JButton refresh = new JButton("Refresh");
    private String[] listaEnderecos = new String [50];
    private static ControleDados dados;

    /**
	 * Método da interface gráfica ao selecionar Estabelecimento no menu principal
     * @param d
     */
    public void TelaMostraEstabelecimento(ControleDados d) {
        dados = d;
        listaEnderecos = new ControleEstabelecimento(d).getEnderecoEstabelecimento();
        listaDeEstabelecimentos = new JList<String>(listaEnderecos);
        janela = new JFrame("Estabelecimentos");
        titulo = new JLabel("Lista de estabelecimentos");

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(80,10,300,30);
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
    
    /**
	 * Método para receber a ação do usuário sobre um botão
     */
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        /**
		 * Abre a tela para cadastro de estabelecimento
         */
        if(src == cadastrar) {
			new TelaCadastroEstabelecimento().cadastrarEstabelecimento(dados);
        }

        /**
		 * Atualiza a lista de estabelecimentos
         */
        if(src == refresh) {
        	listaDeEstabelecimentos.setListData(new ControleEstabelecimento(dados).getEnderecoEstabelecimento());
            listaDeEstabelecimentos.updateUI();
        }
    }

	/**
	 * Método para receber a ação do usuário em uma lista
	 */
    public void valueChanged(ListSelectionEvent e) {
        Object src = e.getSource();

        /**
		 * Ação sobre a lista de estabelecimentos
         */
        if(e.getValueIsAdjusting() && src == listaDeEstabelecimentos) {
            new TelaCadastroEstabelecimento().editarEstabelecimento(dados, listaDeEstabelecimentos.getSelectedIndex());
        }
    }
}