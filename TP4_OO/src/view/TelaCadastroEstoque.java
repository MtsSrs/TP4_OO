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
private JButton adicionar = new JButton("Adicionar");
private JButton zerar = new JButton("Zerar");
private JButton confirmar = new JButton("Confirmar");
private static ControleDados dados;
private int position;
private int setQtd;
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
	
	adicionar.setBounds(20, 170, 115, 30);
	zerar.setBounds(245, 170, 115, 30);
	
	this.janela.add(labelNomeProduto);
	this.janela.add(labelNomeProdutoPastel);
	this.janela.add(labelPrecoProduto);
	this.janela.add(labelPrecoProdutoPastel);
	this.janela.add(labelQtdProduto);
	this.janela.add(labelQtdProdutoPastel);
	this.janela.add(adicionar);
	this.janela.add(zerar);
	
	this.janela.setLayout(null);
	
	this.janela.setSize(400, 250);
	this.janela.setVisible(true);
	
	zerar.addActionListener(this);
	adicionar.addActionListener(this);
	
}

public void adicionaEstoque(ControleDados d, int pos) {
	dados = d;
	position = pos;
	
	janela = new JFrame("Adicionar novo Estoque");
	
	valorQtdProduto = new JTextField(200);
	
	labelQtdProduto.setBounds(10, 10, 100, 25);
	valorQtdProduto.setBounds(110, 10, 250, 25);
	
	
			
	confirmar.setBounds(245, 50, 115, 30);
	
	this.janela.setLayout(null);
	
	this.janela.setSize(400,130);
	this.janela.setVisible(true);
	
	this.janela.add(labelQtdProduto);
	this.janela.add(valorQtdProduto);
	this.janela.add(confirmar);
	
	confirmar.addActionListener(this);
}
	
public void estoqueMostraBebida(ControleDados d) {
	
	
}

public void actionPerformed(ActionEvent e) {
	Object src = e.getSource();
	if(src == adicionar) {
		new TelaCadastroEstoque().adicionaEstoque(dados, position);
		janela.dispose();
	}
	if(src == zerar) {
		dados.getPasteis().get(position).setQtdPastel(0);
		janela.dispose();
	}
	if(src == confirmar) {
		setQtd = Integer.parseInt(valorQtdProduto.getText());
		dados.getPasteis().get(position).setQtdPastel(setQtd + dados.getPasteis().get(position).getQtdPastel());
		janela.dispose();
	}
}

	
}
