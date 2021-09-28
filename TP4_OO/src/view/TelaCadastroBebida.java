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

public class TelaCadastroBebida implements ActionListener {
	private JFrame janela;
	private JLabel labelNomeBebida = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelPrecoBebida = new JLabel("Preco(R$): ");
	private JTextField valorPreco;
	private JLabel labelIdBebida = new JLabel("Id: ");
	private JTextField valorId;
	private JLabel labelDescBebida = new JLabel("Descrição: ");
	private JTextField valorDesc;
	private JLabel labelCalBebida = new JLabel("Caloria(kcal): ");
	private JTextField valorCal;
	private JLabel labelVolBebida = new JLabel("Volume(ml): ");
	private JTextField valorVol;
	private JLabel labelTipoBebida = new JLabel("Tipo: ");
	private JTextField valorTipoBebida;
	private JButton salvar = new JButton("Salvar");
	private JButton editar = new JButton("Editar");
	private JButton deletar = new JButton("Deletar");
	private Bebida novaBebida;
	private static ControleDados dados;
	private int position;

	public void cadastrarBebida(ControleDados d) {
		dados = d;

		janela = new JFrame("Cadastro de nova bebida");

		valorNome = new JTextField(200);
		valorPreco = new JTextField(200);
		valorId = new JTextField(200);
		valorDesc = new JTextField(200);
		valorCal = new JTextField(200);
		valorVol = new JTextField(200);
		valorTipoBebida = new JTextField(200);

		labelNomeBebida.setBounds(10, 60, 100, 25);
		valorNome.setBounds(110, 60, 250, 25);

		labelPrecoBebida.setBounds(10, 110, 100, 25);
		valorPreco.setBounds(110, 110, 250, 25);

		labelIdBebida.setBounds(10, 10, 100, 25);
		valorId.setBounds(110, 10, 250, 25);

		labelDescBebida.setBounds(10, 160, 100, 25);
		valorDesc.setBounds(110, 160, 250, 25);

		labelCalBebida.setBounds(10, 210, 100, 25);
		valorCal.setBounds(110, 210, 250, 25);

		labelVolBebida.setBounds(10, 260, 120, 25);
		valorVol.setBounds(140, 260, 220, 25);

		labelTipoBebida.setBounds(10, 310, 150, 25);
		valorTipoBebida.setBounds(150, 310, 210, 25);

		salvar.setBounds(245, 350, 115, 30);

		this.janela.add(labelNomeBebida);
		this.janela.add(valorNome);
		this.janela.add(labelPrecoBebida);
		this.janela.add(valorPreco);
		this.janela.add(labelIdBebida);
		this.janela.add(valorId);
		this.janela.add(labelDescBebida);
		this.janela.add(valorDesc);
		this.janela.add(labelCalBebida);
		this.janela.add(valorCal);
		this.janela.add(labelVolBebida);
		this.janela.add(valorVol);
		this.janela.add(labelTipoBebida);
		this.janela.add(valorTipoBebida);

		this.janela.add(salvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 450);
		this.janela.setVisible(true);

		salvar.addActionListener(this);

	}

	public void editarBebida(ControleDados d, int pos) {
		dados = d;
		position = pos;

		janela = new JFrame("Editar bebida");

		valorNome = new JTextField(d.getBebidas().get(pos).getNomeProduto(), 200);
		valorPreco = new JTextField(String.valueOf(d.getBebidas().get(pos).getPrecoProduto()), 200);
		valorId = new JTextField(String.valueOf(d.getBebidas().get(pos).getIdProduto()), 200);
		valorDesc = new JTextField(d.getBebidas().get(pos).getDescricaoProduto(), 200);
		valorCal = new JTextField(d.getBebidas().get(pos).getCaloriaProduto(), 200);
		valorVol = new JTextField(d.getBebidas().get(pos).getVolumeBebida(), 200);
		valorTipoBebida = new JTextField(d.getBebidas().get(pos).getTipoBebida(), 200);

		labelNomeBebida.setBounds(10, 60, 100, 25);
		valorNome.setBounds(110, 60, 250, 25);

		labelPrecoBebida.setBounds(10, 110, 100, 25);
		valorPreco.setBounds(110, 110, 250, 25);

		labelIdBebida.setBounds(10, 10, 100, 25);
		valorId.setBounds(110, 10, 250, 25);

		labelDescBebida.setBounds(10, 160, 100, 25);
		valorDesc.setBounds(110, 160, 250, 25);

		labelCalBebida.setBounds(10, 210, 100, 25);
		valorCal.setBounds(110, 210, 250, 25);

		labelVolBebida.setBounds(10, 260, 120, 25);
		valorVol.setBounds(140, 260, 220, 25);

		labelTipoBebida.setBounds(10, 310, 150, 25);
		valorTipoBebida.setBounds(150, 310, 210, 25);

		editar.setBounds(245, 350, 115, 30);
		deletar.setBounds(20, 350, 115, 30);

		this.janela.add(labelNomeBebida);
		this.janela.add(valorNome);
		this.janela.add(labelPrecoBebida);
		this.janela.add(valorPreco);
		this.janela.add(labelIdBebida);
		this.janela.add(valorId);
		this.janela.add(labelDescBebida);
		this.janela.add(valorDesc);
		this.janela.add(labelCalBebida);
		this.janela.add(valorCal);
		this.janela.add(labelVolBebida);
		this.janela.add(valorVol);
		this.janela.add(labelTipoBebida);
		this.janela.add(valorTipoBebida);

		this.janela.add(editar);
		this.janela.add(deletar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 450);
		this.janela.setVisible(true);

		editar.addActionListener(this);
		deletar.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == salvar) {
			try {
				novaBebida = new Bebida(this.valorNome.getText(), Float.valueOf(this.valorPreco.getText()),
						Integer.valueOf(this.valorId.getText()), this.valorDesc.getText(), this.valorCal.getText(),
						this.valorTipoBebida.getText(), this.valorVol.getText());
				dados.getBebidas().add(novaBebida);
				janela.dispose();
			} catch (NumberFormatException exc) {
				MensagemErroFormato();

			}
		}

		if (src == deletar) {
			dados.getBebidas().remove(position);
			janela.dispose();
		}

		if (src == editar) {
			try {
				novaBebida = new Bebida(this.valorNome.getText(), Float.valueOf(this.valorPreco.getText()),
						Integer.valueOf(this.valorId.getText()), this.valorDesc.getText(), this.valorCal.getText(),
						this.valorTipoBebida.getText(), this.valorVol.getText());
				dados.getBebidas().set(position, novaBebida);
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
