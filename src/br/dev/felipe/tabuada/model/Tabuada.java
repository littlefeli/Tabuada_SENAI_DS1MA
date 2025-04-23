package br.dev.felipe.tabuada.model;

public class Tabuada {

	private double multiplicando;
	private double multiplicadorMinimo;
	private double multiplicadorMaximo;

	// Construtor
	public Tabuada(double multiplicando, double multiplicadorMinimo, double multiplicadorMaximo) {
		setMultiplicando(multiplicando);
		setMultiplicadorMinimo(multiplicadorMinimo);
		setMultiplicadorMaximo(multiplicadorMaximo);
	}

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMultiplicadorMinimo(double multiplicadorMinimo) {
		this.multiplicadorMinimo = multiplicadorMinimo;
	}

	public double getMultiplicadorMinimo() {
		return multiplicadorMinimo;
	}

	public void setMultiplicadorMaximo(double multiplicadorMaximo) {
		this.multiplicadorMaximo = multiplicadorMaximo;
	}

	public double getMultiplicadorMaximo() {
		return multiplicadorMaximo;
	}

	// Retornar a tabuada com os cálculos
	public String[] mostrarTabuada() {
		if (multiplicadorMinimo > multiplicadorMaximo) {
			double troca = multiplicadorMinimo;
			multiplicadorMinimo = multiplicadorMaximo;
			multiplicadorMaximo = troca;
		}

		int tamanhoTabuada = (int) (multiplicadorMaximo - multiplicadorMinimo + 1);
		String[] tabuada = new String[tamanhoTabuada];
		double produto;
		int i = 0;
		while (i < tamanhoTabuada) {
			produto = multiplicando * multiplicadorMinimo;
			tabuada[i] = (multiplicando + " X " + multiplicadorMinimo + " = " + produto);
			multiplicadorMinimo++;
			i++;

		}
		return tabuada;
	}

}
