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

/**
 * Cont�m os m�todos e os elementos da interface gr�fica de cadastro, visualiza��o e edi��o de bebida
 * @author Mateus Caltabiano e Matheus Soares
 * @version 1.0 (out 2021)
 */
public class TelaCadastroBebida implements ActionListener {
	private JFrame janela;
	private JLabel labelNomeBebida = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelPrecoBebida = new JLabel("Preco(R$): ");
	private JTextField valorPreco;
	private JLabel labelIdBebida = new JLabel("Id: ");
	private JTextField valorId;
	private JLabel labelDescBebida = new JLabel("Descri��o: ");
	private JTextField valorDesc;
	private JLabel labelCalBebida = new JLabel("Caloria(kcal): ");
	private JTextField valorCal;
	private JLabel labelVolBebida = new JLabel("Volume(ml): ");
	private JTextField valorVol;
	private JLabel labelTipoBebida = new JLabel("Tipo: ");
	private JTextField valorTipoBebida;
	private JLabel labelQtdBebida = new JLabel("Quantidade(Un.): ");
	private JTextField valorQtdBebida;
	private JButton salvar = new JButton("Salvar");
	private JButton editar = new JButton("Editar");
	private JButton deletar = new JButton("Deletar");
	private Bebida novaBebida;
	private static ControleDados dados;
	private int position;

	/**
	 * M�todo para cadastro de uma nova bebida
	 * @param d dados do banco de dados
	 */
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
		valorQtdBebida = new JTextField(200);

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
		valorVol.setBounds(110, 260, 250, 25);

		labelTipoBebida.setBounds(10, 310, 150, 25);
		valorTipoBebida.setBounds(110, 310, 250, 25);

		labelQtdBebida.setBounds(10, 360, 100, 25);
		valorQtdBebida.setBounds(110, 360, 250, 25);
		
		salvar.setBounds(245, 400, 115, 30);

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
		this.janela.add(labelQtdBebida);
		this.janela.add(valorQtdBebida);
		
		this.janela.add(salvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 500);
		this.janela.setVisible(true);

		salvar.addActionListener(this);

	}

	/**
	 * M�todo para editar uma bebida j� existente no ArrayList de bebidas
	 * @param d dados do banco de dados
	 * @param pos int da posi��o selecionada
	 */
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
		valorQtdBebida = new JTextField(String.valueOf(d.getBebidas().get(pos).getQtdBebida()));

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
		valorVol.setBounds(110, 260, 250, 25);

		labelTipoBebida.setBounds(10, 310, 150, 25);
		valorTipoBebida.setBounds(110, 310, 250, 25);

		labelQtdBebida.setBounds(10,360,150,25);
		valorQtdBebida.setBounds(110,360, 250, 25);
		
		editar.setBounds(245, 400, 115, 30);
		deletar.setBounds(20, 400, 115, 30);

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
		this.janela.add(labelQtdBebida);
		this.janela.add(valorQtdBebida);

		this.janela.add(editar);
		this.janela.add(deletar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 500);
		this.janela.setVisible(true);

		editar.addActionListener(this);
		deletar.addActionListener(this);

	}

	/**
	 * M�todo para receber a a��o do usu�rio sobre um bot�o
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		/**
		 * Cria uma nova bebida e adiciona ao ArrayList de clientes com os dados inseridos pelo usu�rio no m�todo cadastrarBebida
		 */
		if (src == salvar) {
			try {
				novaBebida = new Bebida(this.valorNome.getText(), Float.valueOf(this.valorPreco.getText()),
						Integer.valueOf(this.valorId.getText()), this.valorDesc.getText(), this.valorCal.getText(),
						this.valorTipoBebida.getText(), this.valorVol.getText(), Integer.valueOf(this.valorQtdBebida.getText()));
				dados.getBebidas().add(novaBebida);
				janela.dispose();
			} catch (NumberFormatException exc) {
				MensagemErroFormato();

			}
		}

		/**
		 * Deleta a bebida selecionada pelo usu�rio do ArrayList de bebidas
		 */
		if (src == deletar) {
			dados.getBebidas().remove(position);
			janela.dispose();
		}

		/**
		 * Sobrep�e a bebida selecionada por um novo objeto bebida com os dados editados pelo usu�rio no m�todo editarBebida
		 */
		if (src == editar) {
			try {
				novaBebida = new Bebida(this.valorNome.getText(), Float.valueOf(this.valorPreco.getText()),
						Integer.valueOf(this.valorId.getText()), this.valorDesc.getText(), this.valorCal.getText(),
						this.valorTipoBebida.getText(), this.valorVol.getText(), Integer.valueOf(this.valorQtdBebida.getText()));
				dados.getBebidas().set(position, novaBebida);
				janela.dispose();
			} catch (NumberFormatException exc) {
				MensagemErroFormato();
			}
		}
	}

	/**
	 * M�todo para exibir uma mensagem de erro caso algum dado tenha sido digitado errado
	 */
	public void MensagemErroFormato() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao cadastrar o pastel.\n" + "- Verifique se Id foi utilizado numeros inteiros\n"
						+ "- Verifique se em Pre�o foi usado o sinal '.' (ponto)\nao inv�s de ',' (virgula)\n "
						+ "Tente novamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}
}
