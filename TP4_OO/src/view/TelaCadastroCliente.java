package view;

import java.awt.event.*;
import javax.swing.*;

import control.ControleDados;
import modelo.Cliente;
import modelo.Telefone;

public class TelaCadastroCliente implements ActionListener{
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelEndereco = new JLabel("Endereço: ");
	private JTextField valorEndereco;
	private JLabel labelCpf = new JLabel("CPF: ");
	private JTextField valorCpf;
	private JLabel labelTelefone = new JLabel("Telefone: ");
	private JTextField valorDdd;
	private JTextField valorNumero;
	private JButton salvar = new JButton("Salvar");
	private static ControleDados dados;
	private Cliente novoCliente;
	private JButton editar = new JButton("Editar");
	private JButton deletar = new JButton("Deletar");
	private int position;
	
	public void cadastrarCliente(ControleDados d) {
		dados = d;
		
		janela = new JFrame("Cadastro de novo cliente");
		
		valorNome = new JTextField(200);
		valorEndereco = new JTextField(200);
		valorCpf = new JTextField(11);
		valorDdd = new JTextField(3);
		valorNumero = new JTextField(9);
		
		labelNome.setBounds(10, 10, 100, 25);
		valorNome.setBounds(110, 10, 250, 25);
		labelEndereco.setBounds(10, 60, 100, 25);
		valorEndereco.setBounds(110, 60, 250, 25);
		labelCpf.setBounds(10, 110, 100, 25);
		valorCpf.setBounds(110, 110, 250, 25);
		labelTelefone.setBounds(10, 160, 100, 25);
		valorDdd.setBounds(110, 160, 30, 25);
		valorNumero.setBounds(150, 160, 210, 25);
		
		salvar.setBounds(245,300,115,30);
		
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEndereco);
		this.janela.add(valorEndereco);
		this.janela.add(labelCpf);
		this.janela.add(valorCpf);
		this.janela.add(labelTelefone);
		this.janela.add(valorDdd);
		this.janela.add(valorNumero);
		
		this.janela.add(salvar);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(400, 400);
		this.janela.setVisible(true);
		
		salvar.addActionListener(this);
		
		novoCliente = new Cliente(this.valorNome.getText(), this.valorEndereco.getText(), 
				this.valorCpf.getText(), new Telefone(this.valorDdd.getText(), this.valorNumero.getText()));
	}
	
	public void editarCliente(ControleDados d, int pos) {
		dados = d;
		position = pos;
		
		janela = new JFrame("Editar cliente");
		
		valorNome = new JTextField(d.getClientes().get(pos).getNomeCliente(), 200);
		valorEndereco = new JTextField(d.getClientes().get(pos).getEnderecoCliente(), 200);
		valorCpf = new JTextField(d.getClientes().get(pos).getCpfCliente(), 11);
		valorDdd = new JTextField(d.getClientes().get(pos).getTelefoneCliente().getDdd(), 3);
		valorNumero = new JTextField(d.getClientes().get(pos).getTelefoneCliente().getNumero(), 9);
		
		labelNome.setBounds(10, 10, 100, 25);
		valorNome.setBounds(110, 10, 250, 25);
		labelEndereco.setBounds(10, 60, 100, 25);
		valorEndereco.setBounds(110, 60, 250, 25);
		labelCpf.setBounds(10, 110, 100, 25);
		valorCpf.setBounds(110, 110, 250, 25);
		labelTelefone.setBounds(10, 160, 100, 25);
		valorDdd.setBounds(110, 160, 30, 25);
		valorNumero.setBounds(150, 160, 210, 25);
		
		editar.setBounds(245,300,115,30);
		deletar.setBounds(20, 300, 115, 30);
				
		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEndereco);
		this.janela.add(valorEndereco);
		this.janela.add(labelCpf);
		this.janela.add(valorCpf);
		this.janela.add(labelTelefone);
		this.janela.add(valorDdd);
		this.janela.add(valorNumero);
		
		this.janela.add(editar);
		this.janela.add(deletar);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(400, 400);
		this.janela.setVisible(true);
		
		editar.addActionListener(this);
		deletar.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == salvar) {
			novoCliente = new Cliente(this.valorNome.getText(), this.valorEndereco.getText(), 
					this.valorCpf.getText(), new Telefone(this.valorDdd.getText(), this.valorNumero.getText()));
			dados.getClientes().add(novoCliente);
			janela.dispose();
		}
			
		if(src == deletar) {
			dados.getClientes().remove(position);
			janela.dispose();
		}
		
		if(src == editar) {
			novoCliente = new Cliente(this.valorNome.getText(), this.valorEndereco.getText(), 
					this.valorCpf.getText(), new Telefone(this.valorDdd.getText(), this.valorNumero.getText()));
			dados.getClientes().set(position, novoCliente);
			janela.dispose();
		}
	}
}
