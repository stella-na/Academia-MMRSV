package entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente extends Usuario {

	private String genero;
	private double peso;
	private double altura;
	private double imc;

	public Cliente(String nome, String email, String senha, LocalDate dtNascimento, String genero, double peso,
			double altura) {
		super(nome, email, senha, dtNascimento);
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


	public String getGenero() {
		return genero;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public int calcularIdade(LocalDate dtNascimento) {
		LocalDate hoje = LocalDate.now();
		int idade = (int) dtNascimento.until(hoje, ChronoUnit.YEARS);
		return idade;
	}

	public String toString() {
		return "Imc " + imc;
	}
	
}
