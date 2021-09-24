package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleCliente;
import modelo.Cliente;

//btf de tentar colocar só o botão cadastrar, o visualizar vai aparecer ja, o editar e deletar vai ser clicando no nome

public class TelaCliente implements ActionListener, ListSelectionListener{
	private JFrame janela = new JFrame("Cliente");
	private JLabel titulo = new JLabel("Lista de clientes");
	private JList<String> listaDeClientes;
	private JButton cadastrar = new JButton("Cadastrar novo cliente");
	private JButton refresh = new JButton("Refresh");
	private String[] listaNomes = new String [50];
	
	public TelaCliente() {
		listaNomes = ControleCliente.getNomeCliente();
		listaDeClientes = new JList<String>(listaNomes);
		janela = new JFrame("Clientes");
		titulo = new JLabel("Lista de clientes");
		
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(165,10,150,30);
		listaDeClientes.setBounds(20, 50, 350, 120);
		listaDeClientes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDeClientes.setVisibleRowCount(10);
		
		cadastrar.setBounds(70, 177, 100, 30);
		refresh.setBounds(170, 177, 100, 30);
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(listaDeClientes);
		janela.add(cadastrar);
		
		janela.setSize(400, 250);
		janela.setVisible(true);
		
		cadastrar.addActionListener(this);
		listaDeClientes.addListSelectionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastrar)
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades "
					+ "desse botão", null, JOptionPane.INFORMATION_MESSAGE);
		
		if(src == refresh)
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades "
					+ "desse botão", null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == listaDeClientes) {
			
		}
	}
}






