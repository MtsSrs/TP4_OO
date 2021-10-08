package view;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleBebida;
import control.ControleCliente;
import control.ControleDados;
import control.ControlePastel;
import modelo.Venda;

/**
 * Contém os métodos e os elementos da interface gráfica de cadastro, visualização e edição de venda
 * @author Matheus Soares e Mateus Caltabiano
 * @version 1.0 (Out 2021)
 */
public class TelaCadastroVenda implements ActionListener, ListSelectionListener {
	private JFrame janela;
	private JList<String> listaDeClientes;
	private JList<String> listaDePasteis;
	private JList<String> listaDeBebidas;
	private String[] listaNomes = new String[50];
	private String[] listaPasteis = new String[50];
	private String[] listaBebidas = new String[50];
	private Venda novaVenda;
	private JLabel selecaoCliente;
	private JLabel selecaoPastel;
	private JLabel selecaoBebida;
	private JLabel nomeCliente;
	private JLabel nomePastel;
	private JLabel nomeBebida;
	private JLabel labelQtdPastel = new JLabel("Digite a quantidade de pastéis comprados:");
	private JLabel labelQtdBebida = new JLabel("Digite a quantidade de bebidas compradas:");
	private JButton cadastrar = new JButton("Cadastrar");
	private JButton editar = new JButton("Editar");
	private JButton deletar = new JButton("Deletar");
	private JButton confirmar = new JButton("Confirmar");
	private JTextField valorQtdPastel;
	private JTextField valorQtdBebida;
	private static ControleDados dados;
	private JComboBox<String> boxCliente;
	private JComboBox<String> boxPastel;
	private JComboBox<String> boxBebida;
	private int position;
	private int clienteSelecionado;
	private int pastelSelecionado;
	private int bebidaSelecionada;
	private int qtdPasteis;
	private int qtdBebidas;
	private boolean checkPastel = false;
	private boolean checkBebida = false;

	/**
	 * Método para cadastro de uma nova venda
	 * @param d
	 */
	public void cadastrarVenda(ControleDados d) {
		dados = d;
		listaNomes = new ControleCliente(d).getNomeCliente();
		boxCliente = new JComboBox<String>(listaNomes);
		listaPasteis = new ControlePastel(d).getNomePastel();
		boxPastel = new JComboBox<String>(listaPasteis);
		listaBebidas = new ControleBebida(d).getNomeBebida();
		boxBebida = new JComboBox<String>(listaBebidas);

		janela = new JFrame("Cadastro de nova venda");
		selecaoCliente = new JLabel("Selecione o cliente:");
		selecaoPastel = new JLabel("Selecione o pastel:");
		selecaoBebida = new JLabel("Selecione a bebida:");

		selecaoCliente.setBounds(20, 0, 180, 30);
		selecaoPastel.setBounds(20, 90, 180, 30);
		labelQtdPastel.setBounds(20, 180, 300, 30);
		selecaoBebida.setBounds(20, 235, 180, 30);
		labelQtdBebida.setBounds(20, 325, 300, 30);
		
		boxCliente.setBounds(20, 30, 180, 30);
		boxPastel.setBounds(20, 120, 180, 30);
		boxBebida.setBounds(20, 265, 180, 30);

		valorQtdPastel = new JTextField(200);
		valorQtdBebida = new JTextField(200);
		valorQtdPastel.setBounds(20, 210, 200, 25);
		valorQtdBebida.setBounds(20, 355, 200, 25);

		cadastrar.setBounds(245, 410, 115, 30);

		this.janela.add(cadastrar);
		this.janela.add(selecaoCliente);
		this.janela.add(selecaoPastel);
		this.janela.add(selecaoBebida);
		this.janela.add(labelQtdPastel);
		this.janela.add(valorQtdPastel);
		this.janela.add(labelQtdBebida);
		this.janela.add(valorQtdBebida);
		this.janela.add(boxCliente);
		this.janela.add(boxPastel);
		this.janela.add(boxBebida);
		
		this.janela.setLayout(null);

		this.janela.setSize(400, 500);
		this.janela.setVisible(true);

		cadastrar.addActionListener(this);
		boxCliente.addActionListener(this);
		boxPastel.addActionListener(this);
		boxBebida.addActionListener(this);
	}

	/**
	 * Método para visualizar os dados de uma venda já existente
	 * @param d
	 * @param pos
	 */
	public void mostrarDadosVenda(ControleDados d, int pos) {
		dados = d;
		position = pos;
		JLabel labelId;
		JLabel valorId;
		JLabel precoTotal;
		JLabel valorPreco;

		janela = new JFrame("Dados da venda");
		selecaoCliente = new JLabel("Cliente:");
		selecaoPastel = new JLabel("Pastel:");
		selecaoBebida = new JLabel("Bebida:");
		labelId = new JLabel("ID:");
		precoTotal = new JLabel("Preço total:");

		labelId.setBounds(20, 20, 180, 30);
		selecaoCliente.setBounds(20, 60, 180, 30);
		selecaoPastel.setBounds(20, 100, 180, 30);
		selecaoBebida.setBounds(20, 140, 180, 30);
		precoTotal.setBounds(20, 180, 180, 30);

		valorId = new JLabel("" + dados.getVendas().get(pos).getIdVenda());
		valorPreco = new JLabel("" + dados.getVendas().get(pos).getPrecoVenda());
		nomeCliente = new JLabel(dados.getVendas().get(pos).getClienteVenda().getNomeCliente());
		nomePastel = new JLabel(dados.getVendas().get(pos).getPastelVenda().getNomeProduto() + " / R$ "
				+ dados.getVendas().get(pos).getPastelVenda().getPrecoProduto());
		nomeBebida = new JLabel(dados.getVendas().get(pos).getBebidaVenda().getNomeProduto() + " / R$ "
				+ dados.getVendas().get(pos).getBebidaVenda().getPrecoProduto());

		valorId.setBounds(70, 23, 250, 25);
		nomeCliente.setBounds(70, 63, 250, 25);
		nomePastel.setBounds(70, 103, 250, 25);
		nomeBebida.setBounds(70, 143, 250, 25);
		valorPreco.setBounds(90, 183, 250, 25);

		editar.setBounds(245, 300, 115, 30);

		this.janela.add(selecaoCliente);
		this.janela.add(selecaoPastel);
		this.janela.add(selecaoBebida);
		this.janela.add(labelId);
		this.janela.add(valorId);
		this.janela.add(nomeCliente);
		this.janela.add(nomePastel);
		this.janela.add(nomeBebida);
		this.janela.add(editar);
		this.janela.add(precoTotal);
		this.janela.add(valorPreco);
		
		this.janela.setLayout(null);

		this.janela.setSize(400, 400);
		this.janela.setVisible(true);

		editar.addActionListener(this);
		
	}

	/**
	 * Método para editar uma venda já existente no ArrayList de vendas
	 * @param d
	 */
	public void editarVenda(ControleDados d) {
		dados = d;

		listaNomes = new ControleCliente(d).getNomeCliente();
		boxCliente = new JComboBox<String>(listaNomes);
		listaPasteis = new ControlePastel(d).getNomePastel();
		boxPastel = new JComboBox<String>(listaPasteis);
		listaBebidas = new ControleBebida(d).getNomeBebida();
		boxBebida = new JComboBox<String>(listaBebidas);

		janela = new JFrame("Editar venda");

		selecaoCliente.setBounds(20, 0, 180, 30);
		selecaoPastel.setBounds(20, 90, 180, 30);
		labelQtdPastel.setBounds(20, 180, 300, 30);
		selecaoBebida.setBounds(20, 235, 180, 30);
		labelQtdBebida.setBounds(20, 325, 300, 30);
		
		boxCliente.setBounds(20, 30, 180, 30);
		boxPastel.setBounds(20, 120, 180, 30);
		boxBebida.setBounds(20, 265, 180, 30);

		valorQtdPastel = new JTextField(200);
		valorQtdBebida = new JTextField(200);
		valorQtdPastel.setBounds(20, 210, 200, 25);
		valorQtdBebida.setBounds(20, 355, 200, 25);

		confirmar.setBounds(245, 410, 115, 30);
		deletar.setBounds(20, 410, 115, 30);

		this.janela.add(confirmar);
		this.janela.add(deletar);
		this.janela.add(selecaoCliente);
		this.janela.add(selecaoPastel);
		this.janela.add(selecaoBebida);
		this.janela.add(labelQtdPastel);
		this.janela.add(valorQtdPastel);
		this.janela.add(labelQtdBebida);
		this.janela.add(valorQtdBebida);
		this.janela.add(boxCliente);
		this.janela.add(boxPastel);
		this.janela.add(boxBebida);

		this.janela.setLayout(null);

		this.janela.setSize(400, 500);
		this.janela.setVisible(true);

		deletar.addActionListener(this);
		confirmar.addActionListener(this);
		boxCliente.addActionListener(this);
		boxPastel.addActionListener(this);
		boxBebida.addActionListener(this);
	}

	/**
	 * Método para receber a ação do usuário sobre um botão
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		/**
		 * Cria uma nova venda e adiciona ao ArrayList de vendas com os dados inseridos pelo usuário na função cadastrarVenda
		 */
		if (src == cadastrar) {
			qtdPasteis = Integer.parseInt(valorQtdPastel.getText());
			qtdBebidas = Integer.parseInt(valorQtdBebida.getText());
			
			if ((dados.getPasteis().get(pastelSelecionado).getQtdPastel() - qtdPasteis) >= 0) {
				dados.getPasteis().get(pastelSelecionado)
						.setQtdPastel(dados.getPasteis().get(pastelSelecionado).getQtdPastel() - qtdPasteis);
				novaVenda = new Venda(dados.getVendas().get(position).getIdVenda(),
						dados.getClientes().get(clienteSelecionado),
						(qtdPasteis * dados.getPasteis().get(pastelSelecionado).getPrecoProduto()
								+ qtdBebidas * dados.getBebidas().get(bebidaSelecionada).getPrecoProduto()),
						dados.getPasteis().get(pastelSelecionado), dados.getBebidas().get(bebidaSelecionada));
				checkPastel = true;
				janela.dispose();
			} else {
				MensagemErroPastel();
			}

			if ((dados.getBebidas().get(bebidaSelecionada).getQtdBebida() - qtdBebidas) >= 0) {
				dados.getBebidas().get(bebidaSelecionada)
						.setQtdBebida(dados.getBebidas().get(bebidaSelecionada).getQtdBebida() - qtdBebidas);
				novaVenda = new Venda(dados.getVendas().get(position).getIdVenda(),
						dados.getClientes().get(clienteSelecionado),
						(qtdPasteis * dados.getPasteis().get(pastelSelecionado).getPrecoProduto()
								+ qtdBebidas * dados.getBebidas().get(bebidaSelecionada).getPrecoProduto()),
						dados.getPasteis().get(pastelSelecionado), dados.getBebidas().get(bebidaSelecionada));
				checkBebida = true;
				janela.dispose();
			} else {
				MensagemErroBebida();
			}
			if(checkPastel && checkBebida == true) {
				dados.getVendas().add(novaVenda);
			}

		}

		/**
		 * Sobrepõe a venda selecionada por um novo objeto venda com os dados editados pelo usuário no método editarVenda
		 */
		if (src == confirmar) {
			qtdPasteis = Integer.parseInt(valorQtdPastel.getText());
			qtdBebidas = Integer.parseInt(valorQtdBebida.getText());
			
			if ((dados.getPasteis().get(pastelSelecionado).getQtdPastel() - qtdPasteis) >= 0) {
				dados.getPasteis().get(pastelSelecionado)
						.setQtdPastel(dados.getPasteis().get(pastelSelecionado).getQtdPastel() - qtdPasteis);
				novaVenda = new Venda(dados.getVendas().get(position).getIdVenda(),
						dados.getClientes().get(clienteSelecionado),
						(qtdPasteis * dados.getPasteis().get(pastelSelecionado).getPrecoProduto()
								+ qtdBebidas * dados.getBebidas().get(bebidaSelecionada).getPrecoProduto()),
						dados.getPasteis().get(pastelSelecionado), dados.getBebidas().get(bebidaSelecionada));
				checkPastel = true;
				janela.dispose();
			} else {
				MensagemErroPastel();
			}

			if ((dados.getBebidas().get(bebidaSelecionada).getQtdBebida() - qtdBebidas) >= 0) {
				dados.getBebidas().get(bebidaSelecionada)
						.setQtdBebida(dados.getBebidas().get(bebidaSelecionada).getQtdBebida() - qtdBebidas);
				novaVenda = new Venda(dados.getVendas().get(position).getIdVenda(),
						dados.getClientes().get(clienteSelecionado),
						(qtdPasteis * dados.getPasteis().get(pastelSelecionado).getPrecoProduto()
								+ qtdBebidas * dados.getBebidas().get(bebidaSelecionada).getPrecoProduto()),
						dados.getPasteis().get(pastelSelecionado), dados.getBebidas().get(bebidaSelecionada));
				checkBebida = true;
				janela.dispose();
			} else {
				MensagemErroBebida();
			}
			if(checkPastel && checkBebida == true) {
				dados.getVendas().set(position, novaVenda);
			}
		}

		/**
		 * Deleta a venda selecionada pelo usuário do ArrayList de vendas
		 */
		if (src == deletar) {
			dados.getVendas().remove(position);
			janela.dispose();
		}

		/**
		 * Abre a janela para editar uma venda
		 */
		if (src == editar) {
			janela.dispose();
			editarVenda(dados);
		}

		/**
		 * Armazena o índice do ComboBox Cliente selecionado pelo usuário
		 */
		if (src == boxCliente) {
			clienteSelecionado = boxCliente.getSelectedIndex();
		}

		/**
		 * Armazena o índice do ComboBox Pastel selecionado pelo usuário
		 */
		if (src == boxPastel) {
			pastelSelecionado = boxPastel.getSelectedIndex();
		}

		/**
		 * Armazena o índice do ComboBox Bebida selecionado pelo usuário
		 */
		if(src == boxBebida) {
			bebidaSelecionada = boxBebida.getSelectedIndex();
		}
	}

	/**
	 * Método para receber a ação do usuário em uma lista
	 */
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		/**
		 * Ação sobre a lista de clientes
		 */
		if (e.getValueIsAdjusting() && src == listaDeClientes) {
			clienteSelecionado = listaDeClientes.getSelectedIndex();
		}

		/**
		 * Ação sobre a lista de pastéis
		 */
		if (e.getValueIsAdjusting() && src == listaDePasteis) {
			pastelSelecionado = listaDePasteis.getSelectedIndex();
		}

		/**
		 * Ação sobre a lista de bebidas
		 */
		if (e.getValueIsAdjusting() && src == listaDeBebidas) {
			bebidaSelecionada = listaDeBebidas.getSelectedIndex();
		}
	}

	/**
	 * Método para exibir uma mensagem de erro caso não tenha estoque suficiente de pastéis para concluir a venda
	 */
	public void MensagemErroPastel() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao cadastrar a venda.\n" + "- Não há estoque suficiente do pastel selecionado!\n",
				null, JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Método para exibir uma mensagem de erro caso não tenha estoque suficiente de bebidas para concluir a venda
	 */
	public void MensagemErroBebida() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao cadastrar a venda.\n" + "- Não há estoque suficiente da bebida selecionada!\n",
				null, JOptionPane.ERROR_MESSAGE);
	}
}