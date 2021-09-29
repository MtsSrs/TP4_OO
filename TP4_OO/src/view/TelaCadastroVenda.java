package view;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.ControleBebida;
import control.ControleCliente;
import control.ControleDados;
import control.ControlePastel;
import modelo.Venda;

public class TelaCadastroVenda implements ActionListener, ListSelectionListener {
    private JFrame janela;
	private JList<String> listaDeClientes;
	private JList<String> listaDePasteis;
	private JList<String> listaDeBebidas;
	private String[] listaNomes = new String[50];
	private String[] listaPasteis = new String[50];
	private String[] listaBebidas = new String[50];
    private Venda novaVenda;
    private JLabel selecaoCliente;
    private JLabel selecaoPastel;
    private JLabel selecaoBebida;
    private JLabel nomeCliente;
    private JLabel nomePastel;
    private JLabel nomeBebida;
    private JLabel labelQtdPastel = new JLabel("Digite a quantidade de past�is comprados:");
    private JLabel labelQtdBebida = new JLabel("Digite a quantidade de bebidas compradas:");
    private JButton cadastrar = new JButton("Cadastrar");
    private JButton editar = new JButton("Editar");
    private JButton deletar = new JButton("Deletar");
    private JButton confirmar = new JButton("Confirmar");
    private JTextField valorQtdPastel;
    private JTextField valorQtdBebida;
    private static ControleDados dados;
    private int position;
    private int clienteSelecionado;
    private int pastelSelecionado;
    private int bebidaSelecionada;
    private int qtdPasteis;
    private int qtdBebidas;
    
    public void cadastrarVenda(ControleDados d) {
        dados = d;
        listaNomes = new ControleCliente(d).getNomeCliente();
		listaDeClientes = new JList<String>(listaNomes);
		listaPasteis = new ControlePastel(d).getNomePastel();
		listaDePasteis = new JList<String>(listaPasteis);
		listaBebidas = new ControleBebida(d).getNomeBebida();
		listaDeBebidas = new JList<String>(listaBebidas);
		
        janela = new JFrame("Cadastro de nova venda");
        selecaoCliente = new JLabel("Selecione o cliente:");
        selecaoPastel = new JLabel("Selecione o pastel:");
        selecaoBebida = new JLabel("Selecione a bebida:");
        
        selecaoCliente.setBounds(20, 0, 180, 30);
        selecaoPastel.setBounds(20, 90, 180, 30);
        labelQtdPastel.setBounds(20, 180, 300, 30);
        selecaoBebida.setBounds(20, 235, 180, 30);
        labelQtdBebida.setBounds(20, 325, 300, 30);
        
        
        listaDeClientes.setBounds(20, 30, 350, 60);
		listaDeClientes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDeClientes.setVisibleRowCount(-1);
		listaDeClientes.setLayoutOrientation(JList.VERTICAL_WRAP);
		
		listaDePasteis.setBounds(20, 120, 350, 60);
		listaDePasteis.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDePasteis.setVisibleRowCount(-1);
		listaDePasteis.setLayoutOrientation(JList.VERTICAL_WRAP);
		
		listaDeBebidas.setBounds(20, 265, 350, 60);
		listaDeBebidas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDeBebidas.setVisibleRowCount(-1);
		listaDeBebidas.setLayoutOrientation(JList.VERTICAL_WRAP);

		valorQtdPastel = new JTextField(200);
		valorQtdBebida = new JTextField(200);
		valorQtdPastel.setBounds(20, 210, 200, 25);
		valorQtdBebida.setBounds(20, 355, 200, 25);

        cadastrar.setBounds(245,410,115,30);

        this.janela.add(cadastrar);
        this.janela.add(listaDeClientes);
        this.janela.add(listaDePasteis);
        this.janela.add(listaDeBebidas);
        this.janela.add(selecaoCliente);
        this.janela.add(selecaoPastel);
        this.janela.add(selecaoBebida);
        this.janela.add(labelQtdPastel);
        this.janela.add(valorQtdPastel);
        this.janela.add(labelQtdBebida);
        this.janela.add(valorQtdBebida);
        
        this.janela.setLayout(null);

        this.janela.setSize(400, 500);
        this.janela.setVisible(true);

        cadastrar.addActionListener(this);
		listaDeClientes.addListSelectionListener(this);
		listaDePasteis.addListSelectionListener(this);
		listaDeBebidas.addListSelectionListener(this);
    }
    
    public void mostrarDadosVenda(ControleDados d, int pos) {
    	dados = d;
    	position = pos;
    	JLabel labelId;
    	JLabel valorId;
    	JLabel precoTotal;
    	JLabel valorPreco;
    	
    	janela = new JFrame("Dados da venda");
    	selecaoCliente = new JLabel("Cliente:");
    	selecaoPastel = new JLabel("Pastel:");
    	selecaoBebida = new JLabel("Bebida:");
    	labelId = new JLabel("ID:");
    	precoTotal = new JLabel("Pre�o total:");    	
    	
    	labelId.setBounds(20, 20, 180, 30);
		selecaoCliente.setBounds(20, 60, 180, 30);
		selecaoPastel.setBounds(20, 100, 180, 30);
		selecaoBebida.setBounds(20, 140, 180, 30);
		precoTotal.setBounds(20, 180, 180, 30);
		
		
    	
    	valorId = new JLabel("" + dados.getVendas().get(pos).getIdVenda());
    	valorPreco = new JLabel("" + dados.getVendas().get(pos).getPrecoVenda());
		nomeCliente = new JLabel(dados.getVendas().get(pos).getClienteVenda().getNomeCliente());
    	nomePastel = new JLabel(dados.getVendas().get(pos).getPastelVenda().getNomeProduto() + " / R$ " + dados.getVendas().get(pos).getPastelVenda().getPrecoProduto());
    	nomeBebida = new JLabel(dados.getVendas().get(pos).getBebidaVenda().getNomeProduto() + " / R$ " + dados.getVendas().get(pos).getBebidaVenda().getPrecoProduto());
    	
    	valorId.setBounds(70, 23, 250, 25);
    	nomeCliente.setBounds(70, 63, 250, 25);
    	nomePastel.setBounds(70, 103, 250, 25);
    	nomeBebida.setBounds(70, 143, 250, 25);
    	valorPreco.setBounds(90, 183, 250, 25);
    	
    	editar.setBounds(245,300,115,30);
    	
    	this.janela.add(selecaoCliente);
    	this.janela.add(selecaoPastel);
    	this.janela.add(selecaoBebida);
    	this.janela.add(labelId);
    	this.janela.add(valorId);
    	this.janela.add(nomeCliente);
    	this.janela.add(nomePastel);
    	this.janela.add(nomeBebida);
    	this.janela.add(editar);
    	this.janela.add(precoTotal);
    	this.janela.add(valorPreco);
    	
    	this.janela.setLayout(null);
    	
    	this.janela.setSize(400, 400);
    	this.janela.setVisible(true);
    	
    	editar.addActionListener(this);
    }
    
	public void editarVenda(ControleDados d) {
		dados = d;
		
		listaNomes = new ControleCliente(d).getNomeCliente();
		listaDeClientes = new JList<String>(listaNomes);
		listaPasteis = new ControlePastel(d).getNomePastel();
		listaDePasteis = new JList<String>(listaPasteis);
		listaBebidas = new ControleBebida(d).getNomeBebida();
		listaDeBebidas = new JList<String>(listaBebidas);
		
		janela = new JFrame("Editar venda");

		selecaoCliente.setBounds(20, 0, 180, 30);
		selecaoPastel.setBounds(20, 90, 180, 30);
		labelQtdPastel.setBounds(20, 180, 300, 30);
        selecaoBebida.setBounds(20, 235, 180, 30);
        labelQtdBebida.setBounds(20, 325, 300, 30);

        listaDeClientes.setBounds(20, 30, 350, 60);
		listaDeClientes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDeClientes.setVisibleRowCount(-1);
		listaDeClientes.setLayoutOrientation(JList.VERTICAL_WRAP);

		listaDePasteis.setBounds(20, 120, 350, 60);
		listaDePasteis.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDePasteis.setVisibleRowCount(-1);
		listaDePasteis.setLayoutOrientation(JList.VERTICAL_WRAP);

		listaDeBebidas.setBounds(20, 265, 350, 60);
		listaDeBebidas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaDeBebidas.setVisibleRowCount(-1);
		listaDeBebidas.setLayoutOrientation(JList.VERTICAL_WRAP);

		valorQtdPastel = new JTextField(200);
		valorQtdBebida = new JTextField(200);
		valorQtdPastel.setBounds(20, 210, 200, 25);
		valorQtdBebida.setBounds(20, 355, 200, 25);
		
		confirmar.setBounds(245, 410, 115, 30);
		deletar.setBounds(20, 410, 115, 30);
		
        this.janela.add(confirmar);
        this.janela.add(deletar);
        this.janela.add(listaDeClientes);
        this.janela.add(listaDePasteis);
        this.janela.add(listaDeBebidas);
        this.janela.add(selecaoCliente);
        this.janela.add(selecaoPastel);
        this.janela.add(selecaoBebida);
        this.janela.add(labelQtdPastel);
        this.janela.add(valorQtdPastel);
        this.janela.add(labelQtdBebida);
        this.janela.add(valorQtdBebida);

        this.janela.setLayout(null);

        this.janela.setSize(400, 500);
        this.janela.setVisible(true);

        confirmar.addActionListener(this);
        deletar.addActionListener(this);
		listaDeClientes.addListSelectionListener(this);
		listaDePasteis.addListSelectionListener(this);
		listaDeBebidas.addListSelectionListener(this);
	}
	
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if(src == cadastrar) {
        	qtdPasteis = Integer.parseInt(valorQtdPastel.getText());
    		qtdBebidas = Integer.parseInt(valorQtdBebida.getText());
        	novaVenda = new Venda(dados.getVendas().size(), dados.getClientes().get(clienteSelecionado), 
        			(qtdPasteis*dados.getPasteis().get(pastelSelecionado).getPrecoProduto()+
        			 qtdBebidas*dados.getBebidas().get(bebidaSelecionada).getPrecoProduto()), dados.getPasteis().get(pastelSelecionado),
        			 dados.getBebidas().get(bebidaSelecionada));
            dados.getVendas().add(novaVenda);
            janela.dispose();
        }
        
        if(src == confirmar) {
        	qtdPasteis = Integer.parseInt(valorQtdPastel.getText());
    		qtdBebidas = Integer.parseInt(valorQtdBebida.getText());
        	novaVenda = new Venda(dados.getVendas().get(position).getIdVenda(), dados.getClientes().get(clienteSelecionado), 
        			(qtdPasteis*dados.getPasteis().get(pastelSelecionado).getPrecoProduto()+
        			 qtdBebidas*dados.getBebidas().get(bebidaSelecionada).getPrecoProduto()), dados.getPasteis().get(pastelSelecionado),
        			 dados.getBebidas().get(bebidaSelecionada));
        	dados.getVendas().set(position, novaVenda);
        	janela.dispose();
        }
        
        if(src == deletar) {
        	dados.getVendas().remove(position);
        	janela.dispose();
        }
        
        if(src == editar) {
        	janela.dispose();
        	editarVenda(dados);
        }
    }
    
    public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == listaDeClientes) {
			clienteSelecionado = listaDeClientes.getSelectedIndex();
		}
		
		if (e.getValueIsAdjusting() && src == listaDePasteis) {
			pastelSelecionado = listaDePasteis.getSelectedIndex();
		}
		
		if (e.getValueIsAdjusting() && src == listaDeBebidas) {
			bebidaSelecionada = listaDeBebidas.getSelectedIndex();
		}
	}
}