package model;

import java.util.ArrayList;

public class Apartamento {
	private String numeroApartamento;
	private int qtdQuartos;
	
	private ArrayList<Pessoa> moradores = new ArrayList<Pessoa>();
	
	private ArrayList<Competencia> competencias = new ArrayList<Competencia>();
	
	public String getNumeroApartamento() {
		return numeroApartamento;
	}
	public void setNumeroApartamento(String numeroApartamento) {
		this.numeroApartamento = numeroApartamento;
	}
	public int getQtdQuartos() {
		return qtdQuartos;
	}
	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}
	
	public void locacao(Proprietario prop,Pessoa[] morador) {
		for (Pessoa p : morador) {
			moradores.add(p);
		}
	}
	
	
}
