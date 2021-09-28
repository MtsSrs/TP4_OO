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

public class TelaBebida implements ActionListener, ListSelectionListener {
	private JFrame janela = new JFrame("Bebidas");
	private JLabel titulo = new JLabel("Lista de bebidas");
	private JList<String> listaDeBebidas;
	private JButton cadastrar = new JButton("Cadastrar");
	private JButton refresh = new JButton("Refresh");
	private String[] listaNomesBebidas = new String[50];
	private static ControleDados dados;

	public void TelaMostraBebida(ControleDados d) {
		dados = d;
		listaNomesBebidas = new ControleBebida(d).getNomeBebida();
		listaDeBebidas = new JList<String>(listaNomesBebidas);
		janela = new JFrame("Bebidas");
		titulo = new JLabel("Lista de Bebidas");

		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(120, 10, 200, 30);
		listaDeBebidas.setBounds(20, 50, 350, 230);
		listaDeBebidas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDeBebidas.setVisibleRowCount(10);

		cadastrar.setBounds(50, 300, 100, 30);
		refresh.setBounds(250, 300, 100, 30);

		janela.setLayout(null);

		janela.add(titulo);
		janela.add(listaDeBebidas);
		janela.add(cadastrar);
		janela.add(refresh);

		janela.setSize(400, 400);
		janela.setVisible(true);

		cadastrar.addActionListener(this);
		refresh.addActionListener(this);
		listaDeBebidas.addListSelectionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == cadastrar) {
			new TelaCadastroBebida().cadastrarBebida(dados);
		}
		if (src == refresh) {
			listaDeBebidas.setListData(new ControleBebida(dados).getNomeBebida());
			listaDeBebidas.updateUI();
		}
	}

	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaDeBebidas) {
		new TelaCadastroBebida().editarBebida(dados, listaDeBebidas.getSelectedIndex());
		}
	}
}
