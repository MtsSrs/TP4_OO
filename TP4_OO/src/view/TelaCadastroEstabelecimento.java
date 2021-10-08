package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import control.ControleDados;
import modelo.Estabelecimento;
import modelo.Telefone;
import modelo.Valida;

public class TelaCadastroEstabelecimento implements ActionListener {
	private JFrame janela;
	private JLabel labelEndereco = new JLabel("Endere�o: ");
	private JTextField valorEndereco;
	private JLabel labelCep = new JLabel("CEP: ");
	private JTextField valorCep;
	private JLabel labelTelefone = new JLabel("Telefone: ");
	private JTextField valorDdd;
	private JTextField valorNumero;
	private JButton editar = new JButton("Editar");
	private JButton deletar = new JButton("Deletar");
	private JButton salvar = new JButton("Salvar");
	private Estabelecimento novoEstabelecimento;
	private static ControleDados dados;
	private int position;
	private Valida v = new Valida();

	public void cadastrarEstabelecimento(ControleDados d) {
		dados = d;

		janela = new JFrame("Cadastro de novo estabelecimento");

		valorEndereco = new JTextField(200);
		valorCep = new JTextField(11);
		valorDdd = new JTextField(3);
		valorNumero = new JTextField(9);

		labelEndereco.setBounds(10, 10, 100, 25);
		valorEndereco.setBounds(110, 10, 250, 25);
		labelCep.setBounds(10, 60, 100, 25);
		valorCep.setBounds(110, 60, 250, 25);
		labelTelefone.setBounds(10, 110, 100, 25);
		valorDdd.setBounds(110, 110, 30, 25);
		valorNumero.setBounds(150, 110, 210, 25);

		salvar.setBounds(245, 300, 115, 30);

		this.janela.add(labelEndereco);
		this.janela.add(valorEndereco);
		this.janela.add(labelCep);
		this.janela.add(valorCep);
		this.janela.add(labelTelefone);
		this.janela.add(labelTelefone);
		this.janela.add(valorDdd);
		this.janela.add(valorNumero);

		this.janela.add(salvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 400);
		this.janela.setVisible(true);

		salvar.addActionListener(this);
	}

	public void editarEstabelecimento(ControleDados d, int pos) {
		dados = d;
		position = pos;

		janela = new JFrame("Editar estabelecimento");

		valorEndereco = new JTextField(d.getEstabelecimentos().get(pos).getEnderecoEstbelecimento(), 200);
		valorCep = new JTextField(d.getEstabelecimentos().get(pos).getCepEstabelecimento(), 8);
		valorDdd = new JTextField(d.getEstabelecimentos().get(pos).getTelefoneEstabelecimento().getDdd(), 3);
		valorNumero = new JTextField(d.getEstabelecimentos().get(pos).getTelefoneEstabelecimento().getNumero(), 9);

		labelEndereco.setBounds(10, 10, 100, 25);
		valorEndereco.setBounds(110, 10, 250, 25);
		labelCep.setBounds(10, 60, 100, 25);
		valorCep.setBounds(110, 60, 250, 25);
		labelTelefone.setBounds(10, 110, 100, 25);
		valorDdd.setBounds(110, 110, 30, 25);
		valorNumero.setBounds(150, 110, 210, 25);

		editar.setBounds(245, 300, 115, 30);
		deletar.setBounds(20, 300, 115, 30);

		this.janela.add(labelEndereco);
		this.janela.add(valorEndereco);
		this.janela.add(labelCep);
		this.janela.add(valorCep);
		this.janela.add(labelTelefone);
		this.janela.add(valorDdd);
		this.janela.add(valorNumero);

		this.janela.add(editar);
		this.janela.add(deletar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 400);
		this.janela.setVisible(true);

		editar.addActionListener(this);
		deletar.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		if (src == salvar) {
			if (v.validaCEP(this.valorCep.getText()) && v.validaDDD(this.valorDdd.getText())
					&& v.validaTel(this.valorNumero.getText()) == true) {
				novoEstabelecimento = new Estabelecimento(this.valorEndereco.getText(), this.valorCep.getText(),
						new Telefone(this.valorDdd.getText(), this.valorNumero.getText()));
				dados.getEstabelecimentos().add(novoEstabelecimento);
				janela.dispose();
			} else {
				if (v.validaCEP(this.valorCep.getText()) == false) {
					MensagemErroFormatoCEP();
				}
				if (v.validaDDD(this.valorDdd.getText()) == false) {
					MensagemErroFormatoDDD();
				}
				if (v.validaTel(this.valorNumero.getText()) == false) {
					MensagemErroFormatoTEL();
				}
			}
		}

		if (src == deletar) {
			dados.getEstabelecimentos().remove(position);
			janela.dispose();
		}

		if (src == editar) {
			if (v.validaCEP(this.valorCep.getText()) && v.validaDDD(this.valorDdd.getText())
					&& v.validaTel(this.valorNumero.getText()) == true) {
				novoEstabelecimento = new Estabelecimento(this.valorEndereco.getText(), this.valorCep.getText(),
						new Telefone(this.valorDdd.getText(), this.valorNumero.getText()));
				dados.getEstabelecimentos().set(position, novoEstabelecimento);
				janela.dispose();
			} else {
				if (v.validaCEP(this.valorCep.getText()) == false) {
					MensagemErroFormatoCEP();
				}
				if (v.validaDDD(this.valorDdd.getText()) == false) {
					MensagemErroFormatoDDD();
				}
				if (v.validaTel(this.valorNumero.getText()) == false) {
					MensagemErroFormatoTEL();
				}
			}
		}
	}

	public void MensagemErroFormatoDDD() {
		JOptionPane.showMessageDialog(
				null, "Ocorreu um erro ao cadastrar o DDD do estabelecimento.\n"
						+ "#O DDD deve possuir 3 ou 2 d�gitos\n" 
						+ "#Tente novamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void MensagemErroFormatoTEL() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao cadastrar o Telefone do estabelecimento.\n"
						+ "#O telefone deve possuir apenas 9 d�gitos\n"
						+ "#O Telefone deve possuir 9 d�gitos distintos (n�o h� repeti��o do mesmo n�mero 9 vezes)\n"
						+ "#Tente novamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void MensagemErroFormatoCEP() {
		JOptionPane.showMessageDialog(
				null, "Ocorreu um erro ao cadastrar o CEP do estabelecimento.\n"
						+ "#O CEP deve possuir apenas 8 d�gitos\n"
						+ "#Tente novamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}

}