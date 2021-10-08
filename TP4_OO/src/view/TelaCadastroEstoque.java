package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleDados;
import control.ControlePastel;

/**
 * Contém os métodos e os elementos da interface gráfica para adicionar e filtrar Estoque
 * @author Matheus Soares e Mateus Caltabiano
 * @version 1.0 (Out 2021)
 */
public class TelaCadastroEstoque implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JLabel labelNomeProduto = new JLabel("Nome: ");
	private JLabel labelPrecoProduto = new JLabel("Preco(R$): ");
	private JLabel labelQtdProduto = new JLabel("Quantidade(Un.): ");
	private JTextField valorQtdProduto;
	private JButton adicionarPastel = new JButton("Adicionar");
	private JButton zerarPastel = new JButton("Zerar");
	private JButton confirmarPastel = new JButton("Confirmar");
	private JButton adicionarBebida = new JButton("Adicionar");
	private JButton confirmarBebida = new JButton("Confirmar");
	private JButton zerarBebida = new JButton("Zerar");
	private String[] listaDeNomesDeSaborPasteis = new String[50];
	private JList<String> listaDePasteis;
	private static ControleDados dados;
	private int position;
	private int setQtd;
	private int selecao;

	/**
	 * Método para exibir a lista de pasteis no estoque
	 * @param d dados do banco de dados
	 * @param pos int da posição selecionada
	 */
	public void estoqueMostraPastel(ControleDados d, int pos) {
		dados = d;
		position = pos;

		janela = new JFrame("Dados do pastel");

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

	/**
	 * Método para exibir a lista de bebidas no estoque
	 * @param d dados do banco de dados
	 * @param pos int da posição selecionada
	 */
	public void estoqueMostraBebida(ControleDados d, int pos) {
		dados = d;
		position = pos;

		janela = new JFrame("Dados da bebida");

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

	/**
	 * Abre uma nova janela para alterar o estoque do produto selecionado
	 * @param d dados do banco de dados
	 * @param pos int da posição selecionada
	 * @param selecaoProduto int do índice do produto
	 */
	public void adicionaEstoque(ControleDados d, int pos, int selecaoProduto) {
		dados = d;
		position = pos;
		selecao = selecaoProduto;

		if (selecao == 1) {
			janela = new JFrame("Adicionar ao estoque");

			valorQtdProduto = new JTextField(200);

			labelQtdProduto.setBounds(10, 10, 100, 25);
			valorQtdProduto.setBounds(110, 10, 250, 25);

			confirmarPastel.setBounds(245, 50, 115, 30);

			this.janela.setLayout(null);

			this.janela.setSize(400, 130);
			this.janela.setVisible(true);

			this.janela.add(labelQtdProduto);
			this.janela.add(valorQtdProduto);
			this.janela.add(confirmarPastel);

			confirmarPastel.addActionListener(this);
		}

		if (selecao == 2) {
			janela = new JFrame("Adicionar ao estoque");

			valorQtdProduto = new JTextField(200);

			labelQtdProduto.setBounds(10, 10, 100, 25);
			valorQtdProduto.setBounds(110, 10, 250, 25);

			confirmarBebida.setBounds(245, 50, 115, 30);

			this.janela.setLayout(null);

			this.janela.setSize(400, 130);
			this.janela.setVisible(true);

			this.janela.add(labelQtdProduto);
			this.janela.add(valorQtdProduto);
			this.janela.add(confirmarBebida);

			confirmarBebida.addActionListener(this);
		}
	}

	/**
	 * Abre uma nova janela mostrando apenas os pastéis de sabor Salgado
	 * @param d dados do banco de dados
	 */
	public void mostraPastelSalgado(ControleDados d) {
		dados = d;
		listaDeNomesDeSaborPasteis = new ControlePastel(d).getSaborPastelSalgado();
		listaDePasteis = new JList<String>(listaDeNomesDeSaborPasteis);
		
		janela = new JFrame("Pasteis salgados");
		JLabel titulo = new JLabel("Lista de pasteis salgados");
		
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(70, 10, 300, 30);
		listaDePasteis.setBounds(15, 50, 350, 200);
		listaDePasteis.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDePasteis.setVisibleRowCount(-1);
		listaDePasteis.setLayoutOrientation(JList.VERTICAL_WRAP);
		
		janela.setLayout(null);
		
		this.janela.add(titulo);
		this.janela.add(listaDePasteis);
		
		janela.setSize(400,305);
		janela.setVisible(true);
				
	}

	/**
	 * Abre uma nova janela mostrando apenas os pastéis de sabor Doce
	 * @param d dados do banco de dados
	 */
	public void mostraPastelDoce(ControleDados d) {
		dados = d;
		listaDeNomesDeSaborPasteis = new ControlePastel(d).getSaborPastelDoce();
		listaDePasteis = new JList<String>(listaDeNomesDeSaborPasteis);
		
		janela = new JFrame("Pasteis doces");
		JLabel titulo = new JLabel("Lista de pasteis doces");
		
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(70, 10, 300, 30);
		listaDePasteis.setBounds(15, 50, 350, 200);
		listaDePasteis.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDePasteis.setVisibleRowCount(-1);
		listaDePasteis.setLayoutOrientation(JList.VERTICAL_WRAP);
		
		janela.setLayout(null);
		
		this.janela.add(titulo);
		this.janela.add(listaDePasteis);
		
		janela.setSize(400,305);
		janela.setVisible(true);
		
		
	}

	/**
	 * Método para receber a ação do usuário sobre um botão
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		/**
		 * Abre a tela para adicionar estoque do pastel selecionado
		 */
		if (src == adicionarPastel) {
			new TelaCadastroEstoque().adicionaEstoque(dados, position, 1);
			janela.dispose();
		}

		/**
		 * Zera a quantidade de estoque do pastel selecionado
		 */
		if (src == zerarPastel) {
			dados.getPasteis().get(position).setQtdPastel(0);
			janela.dispose();
		}

		/**
		 * Adiciona a quantidade digitada pelo usuário ao estoque do pastel selecionado
		 */
		if (src == confirmarPastel) {
			setQtd = Integer.parseInt(valorQtdProduto.getText());
			dados.getPasteis().get(position).setQtdPastel(setQtd + dados.getPasteis().get(position).getQtdPastel());
			janela.dispose();
		}

		/**
		 * Abre a tela para adicionar estoque da bebida selecionada
		 */
		if (src == adicionarBebida) {
			new TelaCadastroEstoque().adicionaEstoque(dados, position, 2);
			janela.dispose();
		}

		/**
		 * Zera a quantidade de estoque da bebida selecionada
		 */
		if (src == zerarBebida) {
			dados.getBebidas().get(position).setQtdBebida(0);
			janela.dispose();
		}

		/**
		 * Adiciona a quantidade digitada pelo usuário ao estoque da bebida selecionada
		 */
		if (src == confirmarBebida) {
			setQtd = Integer.parseInt(valorQtdProduto.getText());
			dados.getBebidas().get(position).setQtdBebida(setQtd + dados.getBebidas().get(position).getQtdBebida());
			janela.dispose();
		}
	}

	/**
	 * Método para receber a ação do usuário em uma lista
	 */
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		/**
		 * Ação sobre a lista de pastéis
		 */
		if (e.getValueIsAdjusting() && src == listaDePasteis) {
			new TelaCadastroEstoque().estoqueMostraPastel(dados, listaDePasteis.getSelectedIndex());
		}
		
	}

}
