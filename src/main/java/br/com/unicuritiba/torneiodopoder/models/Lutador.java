package br.com.unicuritiba.torneiodopoder.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lutador {
	
	@Id	
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private long id; 
	private int ki;
	private float peso;
	private float altura;
	private int estamina;
	private String nome;
	private int inscricao;
	
	public Lutador(long id, int ki, float peso, float altura, int estamina, String nome, int inscricao) {
		super();
		this.id = id;
		this.ki = ki;
		this.peso = peso;
		this.altura = altura;
		this.estamina = estamina;
		this.nome = nome;
		this.inscricao = inscricao;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public int getKi() {
		return ki;
	}
	
	public void setKi(int ki) {
		this.ki = ki;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public int getEstamina() {
		return estamina;
	}
	
	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getInscricao() {
		return inscricao;
	}
	
	public void setInscricao(int inscricao) {
		this.inscricao = inscricao;
	}
	
}
