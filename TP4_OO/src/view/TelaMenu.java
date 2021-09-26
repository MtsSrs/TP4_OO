package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import control.ControleDados;

public class TelaMenu implements ActionListener{
	
	private static JFrame janela = new JFrame("Pastelaria M&M");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton clientes = new JButton("Clientes");
	private static JButton pasteis = new JButton("Pastéis");
	private static JButton bebidas = new JButton("Bebidas");
	private static JButton estabelecimentos = new JButton("Estabelecimentos");
	private static JButton vendas = new JButton("Vendas");
	private static JButton estoque = new JButton("Estoque");
	public static ControleDados dados = new ControleDados();
	
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(165,10,150,30);
		clientes.setBounds(115, 50, 150, 30);
		pasteis.setBounds(115, 100, 150, 30);
		bebidas.setBounds(115, 150, 150, 30);
		estabelecimentos.setBounds(115, 200, 150, 30);
		vendas.setBounds(115, 250, 150, 30);
		estoque.setBounds(115, 300, 150, 30);		
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(clientes);
		janela.add(pasteis);
		janela.add(bebidas);
		janela.add(estabelecimentos);
		janela.add(vendas);
		janela.add(estoque);
		
		janela.setSize(400,400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		clientes.addActionListener(menu);
		pasteis.addActionListener(menu);
		bebidas.addActionListener(menu);
		estabelecimentos.addActionListener(menu);
		vendas.addActionListener(menu);
		estoque.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == clientes) {
			new TelaCliente().Tela(dados);

		}
		
		if(src == pasteis) {
			new TelaPastel().TelaMostraPastel(dados);
		}
			
		
		if(src == bebidas) {
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades "
					+ "desse botão", null, JOptionPane.INFORMATION_MESSAGE);
		}
			
		
		if(src == estabelecimentos) {
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades "
					+ "desse botão", null, JOptionPane.INFORMATION_MESSAGE);
		}
			
		
		if(src == vendas) {
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades "
					+ "desse botão", null, JOptionPane.INFORMATION_MESSAGE);
		}
			
		
		if(src == estoque) {
			JOptionPane.showMessageDialog(null, "Ainda precisam ser implementadas as funcionalidades "
					+ "desse botão", null, JOptionPane.INFORMATION_MESSAGE);
		}
			
	}
	
}
