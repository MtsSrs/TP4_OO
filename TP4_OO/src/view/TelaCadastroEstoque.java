package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import control.ControleDados;
import modelo.Bebida;
import modelo.Pastel;

public class TelaCadastroEstoque implements ActionListener  {
private JFrame janela;
private JLabel labelNomeProduto = new JLabel("Nome: ");
private JTextField valorNomeProduto;
private JLabel labelPrecoProduto = new JLabel("Preco(R$): ");
private JTextField valorPreco;
private JLabel labelQtdProduto = new JLabel("Quantidade(Un.): ");
private JTextField valorQtdProduto;
private JButton adicionarPastel = new JButton("Adicionar");
private JButton zerarPastel = new JButton("Zerar");
private JButton confirmarPastel = new JButton("Confirmar");
private JButton adicionarBebida = new JButton("Adicionar");
private JButton confirmarBebida = new JButton("Confirmar");
private JButton zerarBebida = new JButton("Zerar");
private static ControleDados dados;
private int position;
private int setQtd;
private int selecao;
private Pastel pastel;
private Bebida bebida;

public void estoqueMostraPastel(ControleDados d, int pos) {
	dados = d;
	position = pos;
	
	janela = new JFrame("Dados de estoque");
	
	JLabel labelNomeProdutoPastel = new JLabel("" + dados.getPasteis().get(pos).getNomeProduto()); 
	JLabel labelPrecoProdutoPastel = new JLabel("" + dados.getPasteis().get(pos).getPrecoProduto());
	JLabel labelQtdProdutoPastel = new JLabel("" + dados.getPasteis().get(pos).getQtdPastel());
	
	labelNomeProduto.setBounds(10, 10, 100, 25);
	labelNomeProdutoPastel.setBounds(50, 10, 250, 25);
	
	labelPrecoProduto.setBounds(10, 60, 100, 25);
	labelPrecoProdutoPastel.setBounds(75, 60, 250, 25);
	
	labelQtdProduto.setBounds(10, 110, 100, 25);
	labelQtdProdutoPastel.setBounds(110, 110, 250, 25);
	
	adicionarPastel.setBounds(20, 170, 115, 30);
	zerarPastel.setBounds(245, 170, 115, 30);
	
	this.janela.add(labelNomeProduto);
	this.janela.add(labelNomeProdutoPastel);
	this.janela.add(labelPrecoProduto);
	this.janela.add(labelPrecoProdutoPastel);
	this.janela.add(labelQtdProduto);
	this.janela.add(labelQtdProdutoPastel);
	this.janela.add(adicionarPastel);
	this.janela.add(zerarPastel);
	
	this.janela.setLayout(null);
	
	this.janela.setSize(400, 250);
	this.janela.setVisible(true);
	
	zerarPastel.addActionListener(this);
	adicionarPastel.addActionListener(this);
	
}

public void estoqueMostraBebida(ControleDados d, int pos){
	dados = d;
	position = pos;
	
	janela = new JFrame("Dados de estoque");
	
	JLabel labelNomeProdutoBebida = new JLabel("" + dados.getBebidas().get(pos).getNomeProduto()); 
	JLabel labelPrecoProdutoBebida = new JLabel("" + dados.getBebidas().get(pos).getPrecoProduto());
	JLabel labelQtdProdutoBebida = new JLabel("" + dados.getBebidas().get(pos).getQtdBebida());
	
	labelNomeProduto.setBounds(10, 10, 100, 25);
	labelNomeProdutoBebida.setBounds(50, 10, 250, 25);
	
	labelPrecoProduto.setBounds(10, 60, 100, 25);
	labelPrecoProdutoBebida.setBounds(75, 60, 250, 25);
	
	labelQtdProduto.setBounds(10, 110, 100, 25);
	labelQtdProdutoBebida.setBounds(110, 110, 250, 25);
	
	adicionarBebida.setBounds(20, 170, 115, 30);
	zerarBebida.setBounds(245, 170, 115, 30);
	
	this.janela.add(labelNomeProduto);
	this.janela.add(labelNomeProdutoBebida);
	this.janela.add(labelPrecoProduto);
	this.janela.add(labelPrecoProdutoBebida);
	this.janela.add(labelQtdProduto);
	this.janela.add(labelQtdProdutoBebida);
	this.janela.add(adicionarBebida);
	this.janela.add(zerarBebida);
	
	this.janela.setLayout(null);
	
	this.janela.setSize(400, 250);
	this.janela.setVisible(true);
	
	zerarBebida.addActionListener(this);
	adicionarBebida.addActionListener(this);
}

public void adicionaEstoque(ControleDados d, int pos, int selecaoProduto) {
	dados = d;
	position = pos;
	selecao = selecaoProduto;
	
	if(selecao == 1) {
	janela = new JFrame("Adicionar novo Estoque");
	
	valorQtdProduto = new JTextField(200);
	
	labelQtdProduto.setBounds(10, 10, 100, 25);
	valorQtdProduto.setBounds(110, 10, 250, 25);
	
	
			
	confirmarPastel.setBounds(245, 50, 115, 30);
	
	this.janela.setLayout(null);
	
	this.janela.setSize(400,130);
	this.janela.setVisible(true);
	
	this.janela.add(labelQtdProduto);
	this.janela.add(valorQtdProduto);
	this.janela.add(confirmarPastel);
	
	confirmarPastel.addActionListener(this);
	}
	
	if (selecao == 2) {
		janela = new JFrame("Adicionar novo Estoque");
		
		valorQtdProduto = new JTextField(200);
		
		labelQtdProduto.setBounds(10, 10, 100, 25);
		valorQtdProduto.setBounds(110, 10, 250, 25);
		
		
				
		confirmarBebida.setBounds(245, 50, 115, 30);
		
		this.janela.setLayout(null);
		
		this.janela.setSize(400,130);
		this.janela.setVisible(true);
		
		this.janela.add(labelQtdProduto);
		this.janela.add(valorQtdProduto);
		this.janela.add(confirmarBebida);
		
		confirmarBebida.addActionListener(this);
	}
}

public void actionPerformed(ActionEvent e) {
	Object src = e.getSource();
	if(src == adicionarPastel) {
		new TelaCadastroEstoque().adicionaEstoque(dados, position, 1);
		janela.dispose();
	}
	if(src == zerarPastel) {
		dados.getPasteis().get(position).setQtdPastel(0);
		janela.dispose();
	}
	if(src == confirmarPastel) {
		setQtd = Integer.parseInt(valorQtdProduto.getText());
		dados.getPasteis().get(position).setQtdPastel(setQtd + dados.getPasteis().get(position).getQtdPastel());
		janela.dispose();
	}
	
	if(src == adicionarBebida) {
		new TelaCadastroEstoque().adicionaEstoque(dados, position, 2);
		janela.dispose();
	}
	
	if(src == zerarBebida) {
		dados.getBebidas().get(position).setQtdBebida(0);
		janela.dispose();
	}
	
	if(src == confirmarBebida) {
		setQtd = Integer.parseInt(valorQtdProduto.getText());
		dados.getBebidas().get(position).setQtdBebida(setQtd + dados.getBebidas().get(position).getQtdBebida());
		janela.dispose();
	}
}

}
