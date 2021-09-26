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

public class TelaPastel implements ActionListener, ListSelectionListener {
	private JFrame janela = new JFrame("Pasteis");
	private JLabel titulo = new JLabel("Lista de pasteis");
	private JList<String> listaDePasteis;
	private JButton cadastrar = new JButton("Cadastrar");
	private JButton refresh = new JButton("Refresh");
	private String[] listaNomesPasteis = new String[50];
	private static ControleDados dados;

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

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == cadastrar) {
			new TelaCadastroPastel().cadastrarPastel(dados);
		}
		if (src == refresh) {
			listaDePasteis.setListData(new ControlePastel(dados).getNomePastel());
			listaDePasteis.updateUI();

		}
	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaDePasteis) {
			new TelaCadastroPastel().editarPastel(dados, listaDePasteis.getSelectedIndex());
		}
	}

}
