package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleDados;
import control.ControleVenda;

public class TelaVenda implements ActionListener, ListSelectionListener {
	private JFrame janela = new JFrame("Janela");
	private JLabel titulo = new JLabel("Lista de vendas");
	private JList<String> listaDeVendas;
	private JButton cadastrar = new JButton("Cadastrar");
	private JButton refresh = new JButton("Refresh");
	private String[] listaVendas = new String[50];
	private static ControleDados dados;
	
	public void TelaMostraVenda(ControleDados d) {
		dados = d;
		listaVendas = new ControleVenda(d).getClienteVenda();
		listaDeVendas = new JList<String> (listaVendas);
		janela = new JFrame("Vendas");
		titulo = new JLabel("Lista de vendas");
		
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 200, 30);
		listaDeVendas.setBounds(20, 50, 350, 230);
		listaDeVendas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDeVendas.setVisibleRowCount(10);
		
		cadastrar.setBounds(50, 300, 100, 30);
		refresh.setBounds(250, 300, 100, 30);
		
		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaDeVendas);
		janela.add(cadastrar);
		janela.add(refresh);
		
		janela.setSize(400, 400);
		janela.setVisible(true);

		cadastrar.addActionListener(this);
		refresh.addActionListener(this);
		listaDeVendas.addListSelectionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == cadastrar) {
			new TelaCadastroVenda().cadastrarVenda(dados);
		}

		if (src == refresh) {
			listaDeVendas.setListData(new ControleVenda(dados).getClienteVenda());
			listaDeVendas.updateUI();
		}
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaDeVendas) {
			new TelaCadastroVenda().mostrarDadosVenda(dados, listaDeVendas.getSelectedIndex());
		}
	}
}
