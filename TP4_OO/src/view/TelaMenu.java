package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import control.ControleDados;

/**
 * Contém os métodos e os elementos da interface gráfica da tela do menu principal
 * @author Mateus Caltabiano e Matheus Soares
 * @version 1.0 (Out 2021)
 */
public class TelaMenu implements ActionListener{
	
	private static JFrame janela = new JFrame("Pastelaria M&M");
	private static JLabel titulo = new JLabel("Menu");
	private static JButton clientes = new JButton("Clientes");
	private static JButton pasteis = new JButton("Pastéis");
	private static JButton bebidas = new JButton("Bebidas");
	private static JButton estabelecimentos = new JButton("Estabelecimentos");
	private static JButton vendas = new JButton("Vendas");
	private static JButton estoque = new JButton("Estoque");
	public static ControleDados dados = new ControleDados();

	/**
	 * Método da interface gráfica do menu principal
	 */
	public TelaMenu() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(165,10,150,30);
		clientes.setBounds(115, 50, 150, 30);
		pasteis.setBounds(115, 100, 150, 30);
		bebidas.setBounds(115, 150, 150, 30);
		estabelecimentos.setBounds(115, 200, 150, 30);
		vendas.setBounds(115, 250, 150, 30);
		estoque.setBounds(115, 300, 150, 30);		
		
		janela.setLayout(null);
		
		janela.add(titulo);
		janela.add(clientes);
		janela.add(pasteis);
		janela.add(bebidas);
		janela.add(estabelecimentos);
		janela.add(vendas);
		janela.add(estoque);
		
		janela.setSize(400,400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}

	/**
	 * Função main
	 * @param args
	 */
	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		
		clientes.addActionListener(menu);
		pasteis.addActionListener(menu);
		bebidas.addActionListener(menu);
		estabelecimentos.addActionListener(menu);
		vendas.addActionListener(menu);
		estoque.addActionListener(menu);
	}

	/**
	 * Método para receber a ação do usuário sobre um botão
	 */
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		/**
		 * Abre a tela cliente
		 */
		if(src == clientes) {
			new TelaCliente().Tela(dados);

		}

		/**
		 * Abre a tela pastéis
		 */
		if(src == pasteis) {
			new TelaPastel().TelaMostraPastel(dados);
		}
		
		/**
		 * Abre a tela bebidas
		 */
		if(src == bebidas) {
			new TelaBebida().TelaMostraBebida(dados);
		}
		
		/**
		 * Abre a tela estabelecimentos
		 */
		if(src == estabelecimentos) {
            new TelaEstabelecimento().TelaMostraEstabelecimento(dados);
        }
		
		/**
		 * Abre a tela vendas
		 */		
		if(src == vendas) {

			new TelaVenda().TelaMostraVenda(dados);
		}
					
		/**
		 * Abre a tela estoque
		 */
		if(src == estoque) {
			new TelaEstoque().TelaMostraEstoque(dados);
		}
			
	}
	
}
