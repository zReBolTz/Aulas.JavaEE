package br.com.softblue.javaee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class NumberBean implements Serializable {
	
	private static Random random = new Random();

	private Integer qtde;
	private Integer min;
	private Integer max;
	//Lista onde será recebido os numeros aleatórios
	private List<Integer> numeros = new ArrayList<>();

	public String gerar() {
		//Caso "i" for menor que "qtde"(valor de numeros aleatórios que o usuário deseja), gerar numeros aleatórios e adicionar na lista
		for (int i = 0; i < qtde; i++) {
			int n = random.nextInt(max - min) + min + 1;
			numeros.add(n);
		}
		
		return null;
	}

	public Integer getQtde() {
		return qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public List<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(List<Integer> numeros) {
		this.numeros = numeros;
	}
}
