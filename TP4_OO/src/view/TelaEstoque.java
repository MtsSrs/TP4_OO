package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleBebida;
import control.ControleDados;
import control.ControlePastel;

/**
 * Contém os métodos e os elementos da interface gráfica de estoque
 * @author Matheus Soares e Mateus Caltabiano
 * @version 1.0 (Out 2021)
 */
public class TelaEstoque implements ActionListener, ListSelectionListener {
	private JFrame janela = new JFrame("Estoque");
	private JLabel titulo = new JLabel("Lista de Produtos no estoque");
	private JList<String> listaDePasteis;
	private JList<String> listaDeBebidas;
	private JButton refresh = new JButton("Refresh");
	private JButton salgado = new JButton("Salgado");
	private JButton doce = new JButton("Doce");
	private String[] listaDeNomesDeProdutosPasteis = new String[50];
	private String[] listaDeNomesDeProdutosBebidas = new String[50];
	private static ControleDados dados;

	/**
	 * Método da interface gráfica ao selecionar Estoque no menu principal
	 * @param d
	 */
	public void TelaMostraEstoque(ControleDados d) {
		dados = d;
		
		listaDeNomesDeProdutosPasteis = new ControlePastel(d).getNomePastel();
		listaDePasteis = new JList<String>(listaDeNomesDeProdutosPasteis);
		listaDeNomesDeProdutosBebidas = new ControleBebida(d).getNomeBebida();
		listaDeBebidas = new JList<String>(listaDeNomesDeProdutosBebidas);
		
		janela = new JFrame("Estoque");
		titulo = new JLabel("Lista de Pasteis");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 200, 30);
		listaDePasteis.setBounds(20, 50, 350, 200);
		listaDePasteis.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDePasteis.setVisibleRowCount(-1);
		listaDePasteis.setLayoutOrientation(JList.VERTICAL_WRAP);
		
		JLabel titulo1 = new JLabel("Lista de Bebidas");
		JLabel filtroTxt = new JLabel("Filtrar pasteis por tipo: ");
		
		filtroTxt.setFont(new Font("Arial", Font.ROMAN_BASELINE, 14));
		filtroTxt.setBounds(20, 260, 200, 30);
		titulo1.setFont(new Font("Arial", Font.BOLD, 20));
		titulo1.setBounds(120, 350, 200, 30);
		listaDeBebidas.setBounds(20, 400, 350, 200);
		listaDeBebidas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDeBebidas.setVisibleRowCount(-1);
		listaDeBebidas.setLayoutOrientation(JList.VERTICAL_WRAP);
		

		salgado.setBounds(250, 300, 100, 30);
		doce.setBounds(30, 300, 100, 30);
		refresh.setBounds(250, 620, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(filtroTxt);
		janela.add(titulo1);
		janela.add(listaDePasteis);
		janela.add(listaDeBebidas);
		janela.add(salgado);
		janela.add(doce);
		janela.add(refresh);

		janela.setSize(400, 700);
		janela.setVisible(true);

		salgado.addActionListener(this);
		doce.addActionListener(this);
		refresh.addActionListener(this);
		listaDePasteis.addListSelectionListener(this);
		listaDeBebidas.addListSelectionListener(this);

	}

	/**
	 * Método para receber a ação do usuário sobre um botão
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		/**
		 * Abre a tela para abrir a janela com a lista de pastéis salgados
		 */
		if (src == salgado) {
		new TelaCadastroEstoque().mostraPastelSalgado(dados);
		}

		/**
		 * Abre a tela para abrir a janela com a lista de pastéis doces
		 */
		if (src == doce) {
		new TelaCadastroEstoque().mostraPastelDoce(dados);
		}

		/**
		 * Atualiza as listas de pastéis
		 */
		if (src == refresh) {
			listaDePasteis.setListData(new ControlePastel(dados).getNomePastel());
			listaDePasteis.updateUI();
			listaDeBebidas.setListData(new ControleBebida(dados).getNomeBebida());
			listaDeBebidas.updateUI();
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

		/**
		 * Ação sobre a lista de bebidas
		 */
		if (e.getValueIsAdjusting() && src == listaDeBebidas) {
			new TelaCadastroEstoque().estoqueMostraBebida(dados, listaDeBebidas.getSelectedIndex());
		}
	}

}
