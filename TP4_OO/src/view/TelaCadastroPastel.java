package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import control.ControleDados;
import modelo.Pastel;

public class TelaCadastroPastel implements ActionListener {
	private JFrame janela;
	private JLabel labelNomePastel = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelPrecoPastel = new JLabel("Preco(R$): ");
	private JTextField valorPreco;
	private JLabel labelIdPastel = new JLabel("Id: ");
	private JTextField valorId;
	private JLabel labelDescPastel = new JLabel("Descrição: ");
	private JTextField valorDesc;
	private JLabel labelCalPastel = new JLabel("Caloria(kcal): ");
	private JTextField valorCal;
	private JLabel labelCompPastel = new JLabel("Comprimento(cm): ");
	private JTextField valorComp;
	private JLabel labelSaborPastel = new JLabel("Sabor(Salgado/Doce): ");
	private JTextField valorSabor;
	private JLabel labelQtdPastel = new JLabel("Quantidade(Un.): ");
	private JTextField valorQtdPastel;
	private JButton salvar = new JButton("Salvar");
	private JButton editar = new JButton("Editar");
	private JButton deletar = new JButton("Deletar");
	private Pastel novoPastel;
	private static ControleDados dados;
	private int position;

	public void cadastrarPastel(ControleDados d) {
		dados = d;

		janela = new JFrame("Cadastro de novo pastel");

		valorNome = new JTextField(200);
		valorPreco = new JTextField(200);
		valorId = new JTextField(200);
		valorDesc = new JTextField(200);
		valorCal = new JTextField(200);
		valorComp = new JTextField(200);
		valorSabor = new JTextField(200);
		valorQtdPastel = new JTextField(200);

		labelNomePastel.setBounds(10, 60, 100, 25);
		valorNome.setBounds(110, 60, 250, 25);

		labelPrecoPastel.setBounds(10, 110, 100, 25);
		valorPreco.setBounds(110, 110, 250, 25);

		labelIdPastel.setBounds(10, 10, 100, 25);
		valorId.setBounds(110, 10, 250, 25);

		labelDescPastel.setBounds(10, 160, 100, 25);
		valorDesc.setBounds(110, 160, 250, 25);

		labelCalPastel.setBounds(10, 210, 100, 25);
		valorCal.setBounds(110, 210, 250, 25);

		labelCompPastel.setBounds(10, 260, 120, 25);
		valorComp.setBounds(140, 260, 220, 25);

		labelSaborPastel.setBounds(10, 310, 150, 25);
		valorSabor.setBounds(150, 310, 210, 25);

		labelQtdPastel.setBounds(10, 360, 100, 25);
		valorQtdPastel.setBounds(110, 360, 250, 25);

		salvar.setBounds(245, 400, 115, 30);

		this.janela.add(labelNomePastel);
		this.janela.add(valorNome);
		this.janela.add(labelPrecoPastel);
		this.janela.add(valorPreco);
		this.janela.add(labelIdPastel);
		this.janela.add(valorId);
		this.janela.add(labelDescPastel);
		this.janela.add(valorDesc);
		this.janela.add(labelCalPastel);
		this.janela.add(valorCal);
		this.janela.add(labelCompPastel);
		this.janela.add(valorComp);
		this.janela.add(labelSaborPastel);
		this.janela.add(valorSabor);
		this.janela.add(labelQtdPastel);
		this.janela.add(valorQtdPastel);

		this.janela.add(salvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 500);
		this.janela.setVisible(true);

		salvar.addActionListener(this);

	}

	public void editarPastel(ControleDados d, int pos) {
		dados = d;
		position = pos;

		janela = new JFrame("Editar pastel");

		valorNome = new JTextField(d.getPasteis().get(pos).getNomeProduto(), 200);
		valorPreco = new JTextField(String.valueOf(d.getPasteis().get(pos).getPrecoProduto()), 200);
		valorId = new JTextField(String.valueOf(d.getPasteis().get(pos).getIdProduto()), 200);
		valorDesc = new JTextField(d.getPasteis().get(pos).getDescricaoProduto(), 200);
		valorCal = new JTextField(d.getPasteis().get(pos).getCaloriaProduto(), 200);
		valorComp = new JTextField(d.getPasteis().get(pos).getComprimentoPastel(), 200);
		valorSabor = new JTextField(d.getPasteis().get(pos).getSaborPastel(), 200);
		valorQtdPastel = new JTextField(String.valueOf(d.getPasteis().get(pos).getQtdPastel()));

		labelNomePastel.setBounds(10, 60, 100, 25);
		valorNome.setBounds(110, 60, 250, 25);

		labelPrecoPastel.setBounds(10, 110, 100, 25);
		valorPreco.setBounds(110, 110, 250, 25);

		labelIdPastel.setBounds(10, 10, 100, 25);
		valorId.setBounds(110, 10, 250, 25);

		labelDescPastel.setBounds(10, 160, 100, 25);
		valorDesc.setBounds(110, 160, 250, 25);

		labelCalPastel.setBounds(10, 210, 100, 25);
		valorCal.setBounds(110, 210, 250, 25);

		labelCompPastel.setBounds(10, 260, 120, 25);
		valorComp.setBounds(140, 260, 220, 25);

		labelSaborPastel.setBounds(10, 310, 150, 25);
		valorSabor.setBounds(150, 310, 210, 25);

		labelQtdPastel.setBounds(10, 360, 100, 25);
		valorQtdPastel.setBounds(110, 360, 250, 25);

		editar.setBounds(245, 400, 115, 30);
		deletar.setBounds(20, 400, 115, 30);

		this.janela.add(labelNomePastel);
		this.janela.add(valorNome);
		this.janela.add(labelPrecoPastel);
		this.janela.add(valorPreco);
		this.janela.add(labelIdPastel);
		this.janela.add(valorId);
		this.janela.add(labelDescPastel);
		this.janela.add(valorDesc);
		this.janela.add(labelCalPastel);
		this.janela.add(valorCal);
		this.janela.add(labelCompPastel);
		this.janela.add(valorComp);
		this.janela.add(labelSaborPastel);
		this.janela.add(valorSabor);
		this.janela.add(labelQtdPastel);
		this.janela.add(valorQtdPastel);

		this.janela.add(editar);
		this.janela.add(deletar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 500);
		this.janela.setVisible(true);

		editar.addActionListener(this);
		deletar.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == salvar) {
			try {
				novoPastel = new Pastel(this.valorNome.getText(), Float.valueOf(this.valorPreco.getText()),
						Integer.valueOf(this.valorId.getText()), this.valorDesc.getText(), this.valorCal.getText(),
						this.valorSabor.getText(), this.valorComp.getText(),
						Integer.valueOf(this.valorQtdPastel.getText()));
				dados.getPasteis().add(novoPastel);
				janela.dispose();
			} catch (NumberFormatException exc) {
				MensagemErroFormato();
			}
		}

		if (src == deletar) {
			dados.getPasteis().remove(position);
			janela.dispose();
		}

		if (src == editar) {
			try {
				novoPastel = new Pastel(this.valorNome.getText(), Float.valueOf(this.valorPreco.getText()),
						Integer.valueOf(this.valorId.getText()), this.valorDesc.getText(), this.valorCal.getText(),
						this.valorSabor.getText(), this.valorComp.getText(),
						Integer.valueOf(this.valorQtdPastel.getText()));
				dados.getPasteis().set(position, novoPastel);
				janela.dispose();
			} catch (NumberFormatException exc) {
				MensagemErroFormato();

			}
		}
	}

	public void MensagemErroFormato() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao cadastrar o pastel.\n" + "- Verifique se Id foi utilizado numeros inteiros\n"
						+ "- Verifique se em Preço foi usado o sinal '.' (ponto)\nao invés de ',' (virgula)\n "
						+ "Tente novamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

}
