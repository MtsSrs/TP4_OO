package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import control.ControleDados;
import modelo.Cliente;
import modelo.Telefone;
import modelo.Valida;

/**
 * Cont�m os m�todos e os elementos da interface gr�fica de cadastro, visualiza��o e edi��o de cliente
 * @author Matheus Soares e Mateus Caltabiano
 * @version 1.0 (Out 2021)
 */
public class TelaCadastroCliente implements ActionListener {
	private Valida v = new Valida();
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelEndereco = new JLabel("Endere�o: ");
	private JTextField valorEndereco;
	private JLabel labelCpf = new JLabel("CPF: ");
	private JTextField valorCpf;
	private JLabel labelTelefone = new JLabel("Telefone: ");
	private JTextField valorDdd;
	private JTextField valorNumero;
	private JButton salvar = new JButton("Salvar");
	private static ControleDados dados;
	private Cliente novoCliente;
	private JButton editar = new JButton("Editar");
	private JButton deletar = new JButton("Deletar");
	private int position;

	/**
	 * M�todo para cadastro de um novo cliente
	 * @param d dados do banco de dados
	 */
	public void cadastrarCliente(ControleDados d) {
		dados = d;

		janela = new JFrame("Cadastro de novo cliente");

		valorNome = new JTextField(200);
		valorEndereco = new JTextField(200);
		valorCpf = new JTextField(11);
		valorDdd = new JTextField(3);
		valorNumero = new JTextField(9);

		labelNome.setBounds(10, 10, 100, 25);
		valorNome.setBounds(110, 10, 250, 25);
		labelEndereco.setBounds(10, 60, 100, 25);
		valorEndereco.setBounds(110, 60, 250, 25);
		labelCpf.setBounds(10, 110, 100, 25);
		valorCpf.setBounds(110, 110, 250, 25);
		labelTelefone.setBounds(10, 160, 100, 25);
		valorDdd.setBounds(110, 160, 30, 25);
		valorNumero.setBounds(150, 160, 210, 25);

		salvar.setBounds(245, 300, 115, 30);

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEndereco);
		this.janela.add(valorEndereco);
		this.janela.add(labelCpf);
		this.janela.add(valorCpf);
		this.janela.add(labelTelefone);
		this.janela.add(valorDdd);
		this.janela.add(valorNumero);

		this.janela.add(salvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 400);
		this.janela.setVisible(true);

		salvar.addActionListener(this);
	}

	/**
	 * M�todo para editar um cliente j� existente no ArrayList de clientes
	 * @param d dados do banco de dados
	 * @param pos int da posi��o selecionada
	 */
	public void editarCliente(ControleDados d, int pos) {
		dados = d;
		position = pos;

		janela = new JFrame("Editar cliente");

		valorNome = new JTextField(d.getClientes().get(pos).getNomeCliente(), 200);
		valorEndereco = new JTextField(d.getClientes().get(pos).getEnderecoCliente(), 200);
		valorCpf = new JTextField(d.getClientes().get(pos).getCpfCliente(), 11);
		valorDdd = new JTextField(d.getClientes().get(pos).getTelefoneCliente().getDdd(), 3);
		valorNumero = new JTextField(d.getClientes().get(pos).getTelefoneCliente().getNumero(), 9);

		labelNome.setBounds(10, 10, 100, 25);
		valorNome.setBounds(110, 10, 250, 25);
		labelEndereco.setBounds(10, 60, 100, 25);
		valorEndereco.setBounds(110, 60, 250, 25);
		labelCpf.setBounds(10, 110, 100, 25);
		valorCpf.setBounds(110, 110, 250, 25);
		labelTelefone.setBounds(10, 160, 100, 25);
		valorDdd.setBounds(110, 160, 30, 25);
		valorNumero.setBounds(150, 160, 210, 25);

		editar.setBounds(245, 300, 115, 30);
		deletar.setBounds(20, 300, 115, 30);

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelEndereco);
		this.janela.add(valorEndereco);
		this.janela.add(labelCpf);
		this.janela.add(valorCpf);
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

	/**
	 * M�todo para receber a a��o do usu�rio sobre um bot�o
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		/**
		 * Cria um novo cliente e adiciona ao ArrayList de clientes com os dados inseridos pelo usu�rio na fun��o cadastrarCliente
		 */
		if (src == salvar) {
			if (v.validaCPF(this.valorCpf.getText()) && v.validaDDD(this.valorDdd.getText())
					&& v.validaTel(this.valorNumero.getText()) == true) {
				novoCliente = new Cliente(this.valorNome.getText(), this.valorEndereco.getText(),
						this.valorCpf.getText(), new Telefone(this.valorDdd.getText(), this.valorNumero.getText()));
				dados.getClientes().add(novoCliente);
				janela.dispose();
			} else {
				if (v.validaCPF(this.valorCpf.getText()) == false) {
					MensagemErroFormatoCPF();
				}
				if (v.validaDDD(this.valorDdd.getText()) == false) {
					MensagemErroFormatoDDD();
				}
				if (v.validaTel(this.valorNumero.getText()) == false) {
					MensagemErroFormatoTEL();
				}
			}
		}
		
		/**
		 * Deleta o cliente selecionado pelo usu�rio do ArrayList de clientes
		 */
		if (src == deletar) {
			dados.getClientes().remove(position);
			janela.dispose();
		}

		/**
		 * Sobrep�e o cliente selecionado por um novo objeto cliente com os dados editados pelo usu�rio no m�todo editarCliente
		 */
		if (src == editar) {
			if (v.validaCPF(this.valorCpf.getText()) && v.validaDDD(this.valorDdd.getText())
					&& v.validaTel(this.valorNumero.getText()) == true) {
				novoCliente = new Cliente(this.valorNome.getText(), this.valorEndereco.getText(),
						this.valorCpf.getText(), new Telefone(this.valorDdd.getText(), this.valorNumero.getText()));
				dados.getClientes().set(position, novoCliente);
				janela.dispose();
			} else {
				if (v.validaCPF(this.valorCpf.getText()) == false) {
					MensagemErroFormatoCPF();
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

	/**
	 * M�todo para exibir uma mensagem de erro caso algum dado n�o tenha passado na valida��o
	 */
	public void MensagemErroFormatoCPF() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar o CPF do cliente.\n"
				+ "#Verifique se o CPF possui 11 d�gitos\n"
				+ "#Verifique se o CPF possui 11 d�gitos distintos (n�o h� repeti��o do mesmo n�mero 11 vezes)\n"
				+ "#Tente novamente.", null, JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * M�todo para exibir uma mensagem de erro caso algum dado n�o tenha passado na valida��o
	 */
	public void MensagemErroFormatoDDD() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao cadastrar o DDD do cliente.\n"
				+ "#O DDD deve possuir 3 ou 2 d�gitos\n" + "#Tente novamente.", null, JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * M�todo para exibir uma mensagem de erro caso algum dado n�o tenha passado na valida��o
	 */
	public void MensagemErroFormatoTEL() {
		JOptionPane.showMessageDialog(null,
				"Ocorreu um erro ao cadastrar o Telefone do cliente.\n" + "#O telefone deve possuir apenas 9 d�gitos\n"
						+ "#O Telefone deve possuir 9 d�gitos distintos (n�o h� repeti��o do mesmo n�mero 9 vezes)\n"
						+ "#Tente novamente.",
				null, JOptionPane.ERROR_MESSAGE);
	}
}