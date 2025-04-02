package br.dev.felipe.tabuada.model;
public class Tabuada {
    private double multiplicando;
    private double minimoMultiplicador;
    private double maximoMultiplicador;

    public Tabuada(double multiplicando, double minimoMultiplicador, double maximoMultiplicador) {
        this.multiplicando = multiplicando;
        this.minimoMultiplicador = minimoMultiplicador;
        this.maximoMultiplicador = maximoMultiplicador;
    }

    public double getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(double multiplicando) {
        this.multiplicando = multiplicando;
    }

    public double getMinimoMultiplicador() {
        return minimoMultiplicador;
    }

    public void setMinimoMultiplicador(double minimoMultiplicador) {
        this.minimoMultiplicador = minimoMultiplicador;
    }

    public double getMaximoMultiplicador() {
        return maximoMultiplicador;
    }

    public void setMaximoMultiplicador(double maximoMultiplicador) {
        this.maximoMultiplicador = maximoMultiplicador;
    }

    //public void mostrarTabuada() {
    //    for (double i = minimoMultiplicador; i <= maximoMultiplicador; i++) {
    //        System.out.println(multiplicando + " x " + i + " = " + (multiplicando * i));
    //    }
    //}
    
    public void mostrarTabuada() {
    	if (minimoMultiplicador > maximoMultiplicador) {
    		double troca = minimoMultiplicador;
    		minimoMultiplicador = maximoMultiplicador;
    		maximoMultiplicador = troca;
    	}
    	while (minimoMultiplicador <= maximoMultiplicador) {
    		double produto = multiplicando * minimoMultiplicador;
    		System.out.println(multiplicando + " X " + minimoMultiplicador + " = " + produto);
    	}
    }
}
