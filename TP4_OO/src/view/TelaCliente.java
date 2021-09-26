package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleCliente;
import control.ControleDados;

public class TelaCliente implements ActionListener, ListSelectionListener {
	private JFrame janela = new JFrame("Cliente");
	private JLabel titulo = new JLabel("Lista de clientes");
	private JList<String> listaDeClientes;
	private JButton cadastrar = new JButton("Cadastrar");
	private JButton refresh = new JButton("Refresh");
	private String[] listaNomes = new String[50];
	private static ControleDados dados;

	public void Tela(ControleDados d) {
		dados = d;
		listaNomes = new ControleCliente(d).getNomeCliente();
		listaDeClientes = new JList<String>(listaNomes);
		janela = new JFrame("Clientes");
		titulo = new JLabel("Lista de clientes");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 200, 30);
		listaDeClientes.setBounds(20, 50, 350, 230);
		listaDeClientes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDeClientes.setVisibleRowCount(10);

		cadastrar.setBounds(50, 300, 100, 30);
		refresh.setBounds(250, 300, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaDeClientes);
		janela.add(cadastrar);
		janela.add(refresh);

		janela.setSize(400, 400);
		janela.setVisible(true);

		cadastrar.addActionListener(this);
		refresh.addActionListener(this);
		listaDeClientes.addListSelectionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == cadastrar) {
			new TelaCadastroCliente().cadastrarCliente(dados);
		}

		if (src == refresh) {
			listaDeClientes.setListData(new ControleCliente(dados).getNomeCliente());
			listaDeClientes.updateUI();
		}
	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaDeClientes) {
			new TelaCadastroCliente().editarCliente(dados, listaDeClientes.getSelectedIndex());
		}
	}
}
