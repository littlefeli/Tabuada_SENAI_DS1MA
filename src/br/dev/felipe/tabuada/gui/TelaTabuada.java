package br.dev.felipe.tabuada.gui;

import java.awt.Container;

import javax.swing.*;

public class TelaTabuada {
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicador;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private JScrollPane scrollTabuada;
	private String tituloDaTela;

	
	
	
	public void criarTela(String tituloDaTela) {
		this.tituloDaTela = tituloDaTela;
		JFrame tela = new JFrame();
		tela.setTitle(this.tituloDaTela);
		tela.setSize(265, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		
		
		//obtendo a referencia do painel de conteudo da tela
		Container container = tela.getContentPane();
		
		//Criar o label multiplicando
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(20, 20, 150, 30);
		
		//Criar o label MinMultiplicador
		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Minimo multiplicador: ");
		labelMinMultiplicador.setBounds(20, 60, 150, 30);
		
		//Criar o label MaxMultiplicador
		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo multiplicador: ");
		labelMaxMultiplicador.setBounds(20, 100, 150, 30);
		
		//Criar o text Multiplicador
		textMultiplicador = new JTextField();
		textMultiplicador.setBounds(250, 20, 80, 30);
		
		//Criar o text MinMultiplicador
		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(250, 60, 80, 30);
		
		//Criar o text MaxMultiplicador
		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(250, 100, 80, 30);
		
		
		//Criar o button Calcular
		buttonCalcular = new JButton("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);
		
		//Criar o button Limpar
		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);
		
		
		//Adicionando os componentes no painel de conteúdo do JFrame
		container.add(labelMultiplicando);
		container.add(labelMinMultiplicador);
		container.add(labelMaxMultiplicador);
		container.add(textMultiplicador);
		container.add(textMinMultiplicador);
		container.add(textMaxMultiplicador);
		container.add(buttonCalcular);
		container.add(buttonLimpar);
		
		
		//Tornar a tela visível DEVE ser a ultima instrução
		tela.setVisible(true);
	}
	
	private void exibirTabuada() {
		
	}
	
	private void limparTabuada() {
		
	}
	
	
}
