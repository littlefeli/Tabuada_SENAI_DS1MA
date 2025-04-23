package br.dev.felipe.tabuada.gui;

import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import br.dev.felipe.tabuada.model.Tabuada;

public class TelaTabuada {

	// Comunica��o com o us�rio e Inputs
	private JLabel labelMultiplicando;
	private JLabel labelMinMultiplicador;
	private JLabel labelMaxMultiplicador;
	private JTextField textMultiplicando;
	private JTextField textMinMultiplicador;
	private JTextField textMaxMultiplicador;

	// Bot�es para executar os m�todos
	private JButton buttonCalcular;
	private JButton buttonLimpar;

	// Exibi��o e navega��o dos resultados
	private JList listTabuada;
	private JScrollPane scrollTabuada;
	private String tituloDaTela;

	public void criarTela(String tituloDaTela) {
		this.tituloDaTela = tituloDaTela;

		// Instanciando e configurando o JFrame
		JFrame tela = new JFrame();
		tela.setTitle(this.tituloDaTela);
		tela.setSize(265, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);

		// Criando text labels para a janela
		tela.setLayout(null);
		labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(5, 20, 150, 30);

		labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Multiplicador M�nimo:");
		labelMinMultiplicador.setBounds(5, 60, 150, 30);

		labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Multiplicador M�ximo:");
		labelMaxMultiplicador.setBounds(5, 100, 150, 30);

		// Criando text fields para a janela
		textMultiplicando = new JTextField();
		textMultiplicando.setBounds(195, 20, 50, 30);

		textMinMultiplicador = new JTextField();
		textMinMultiplicador.setBounds(195, 60, 50, 30);

		textMaxMultiplicador = new JTextField();
		textMaxMultiplicador.setBounds(195, 100, 50, 30);

		// Criando bot�es para a janela
		buttonCalcular = new JButton("Calcular");
		buttonCalcular.setBounds(5, 150, 100, 30);
		// setBounds == tamanho da tela

		buttonLimpar = new JButton("Limpar");
		buttonLimpar.setBounds((195 - 50), 150, 100, 30);

		// Obtendo refer�ncia do Container, o painel de conteudo da janela
		Container container = tela.getContentPane();

		// Criar o JList que vai receber a tabuada
		listTabuada = new JList();

		// Criar o Scrollpane que vai receber o JList
		scrollTabuada = new JScrollPane(listTabuada);
		scrollTabuada.setBounds(20, 200, 210, 340);

		// Adicionando elementos na janela
		container.add(labelMultiplicando);
		container.add(labelMinMultiplicador);
		container.add(labelMaxMultiplicador);

		container.add(textMultiplicando);
		container.add(textMinMultiplicador);
		container.add(textMaxMultiplicador);

		container.add(buttonCalcular);
		container.add(buttonLimpar);

		container.add(scrollTabuada);

		// Adicionando escutantes de a��o aos bot�es
		buttonCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Coletando os valores nos campos
				String multiplicando = textMultiplicando.getText();
				String minMultiplicador = textMinMultiplicador.getText();
				String maxMultiplicador = textMaxMultiplicador.getText();

				// Convertendo os valores para double
				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minMultiplicadorDouble = Double.parseDouble(minMultiplicador);
				double maxMultiplicadorDouble = Double.parseDouble(maxMultiplicador);

				// Fornecendo os valores para a tabuada
				Tabuada tabuada = new Tabuada(multiplicandoDouble, minMultiplicadorDouble, maxMultiplicadorDouble);

				// Trazer a tabuada e colocar na tela
				String[] tabuadaVisual = tabuada.mostrarTabuada();
				listTabuada.setListData(tabuadaVisual);

			}
		});

		buttonLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textMultiplicando.setText("");
				textMaxMultiplicador.setText("");
				textMinMultiplicador.setText("");
				listTabuada.setListData(new String[0]);
				textMultiplicando.requestFocus();

			}
		});

		// tornando a tela vis�vel
		tela.setVisible(true);
	}

}