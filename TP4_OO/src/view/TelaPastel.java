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

import control.ControleDados;
import control.ControlePastel;

/**
 * Cont�m os m�todos e os elementos da interface gr�fica de pastel
 * @author Mateus Caltabiano e Matheus Soares
 * @version 1.0 (Out 2021)
 */
public class TelaPastel implements ActionListener, ListSelectionListener {
	private JFrame janela = new JFrame("Pasteis");
	private JLabel titulo = new JLabel("Lista de pasteis");
	private JList<String> listaDePasteis;
	private JButton cadastrar = new JButton("Cadastrar");
	private JButton refresh = new JButton("Refresh");
	private String[] listaNomesPasteis = new String[50];
	private static ControleDados dados;

	/**
	 * M�todo da interface gr�fica ao selecionar Pastel no menu principal
	 * @param d
	 */
	public void TelaMostraPastel(ControleDados d) {
		dados = d;
		listaNomesPasteis = new ControlePastel(d).getNomePastel();
		listaDePasteis = new JList<String>(listaNomesPasteis);
		janela = new JFrame("Pasteis");
		titulo = new JLabel("Lista de Pasteis");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 200, 30);
		listaDePasteis.setBounds(20, 50, 350, 230);
		listaDePasteis.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDePasteis.setVisibleRowCount(10);

		cadastrar.setBounds(50, 300, 100, 30);
		refresh.setBounds(250, 300, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaDePasteis);
		janela.add(cadastrar);
		janela.add(refresh);

		janela.setSize(400, 400);
		janela.setVisible(true);

		cadastrar.addActionListener(this);
		refresh.addActionListener(this);
		listaDePasteis.addListSelectionListener(this);

	}

	/**
	 * M�todo para receber a a��o do usu�rio sobre um bot�o
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		/**
		 * Abre a tela para cadastro de pastel
		 */
		if (src == cadastrar) {
			new TelaCadastroPastel().cadastrarPastel(dados);
		}

		/**
		 * Atualiza a lista de past�is
		 */
		if (src == refresh) {
			listaDePasteis.setListData(new ControlePastel(dados).getNomePastel());
			listaDePasteis.updateUI();
		}
	}

	/**
	 * A��o sobre a lista de past�is
	 */
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		/**
		 * A��o sobre a lista de past�is
		 */
		if (e.getValueIsAdjusting() && src == listaDePasteis) {
			new TelaCadastroPastel().editarPastel(dados, listaDePasteis.getSelectedIndex());
		}
	}

}
