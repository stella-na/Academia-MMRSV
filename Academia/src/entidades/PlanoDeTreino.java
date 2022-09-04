package entidades;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;

public class PlanoDeTreino {
	
	private LocalDate dataInicio;
	private Period duracao;
	private Cliente cliente;
	private IRepositorioGenerico<Treino> treinos;

	public PlanoDeTreino(LocalDate dataInicio, Period duracao, Cliente cliente) {
		this.dataInicio = dataInicio;
		this.duracao = duracao;
		this.cliente = cliente;
		this.treinos = new RepositorioGenerico<>();
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public Period getDuracao() {
		return duracao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public IRepositorioGenerico<Treino> getTreinos() {
		return treinos;
	}

	public String toString() {
		return "PlanoDeTreino de " + cliente + "\nData de Inicio:" + dataInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
				"\nDuracao: " + duracao  + treinos.listar();
	}

}
