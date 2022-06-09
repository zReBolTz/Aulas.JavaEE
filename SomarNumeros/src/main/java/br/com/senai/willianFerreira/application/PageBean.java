package br.com.senai.willianFerreira.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
@SuppressWarnings("serial")

public class PageBean implements Serializable  {
	
	private Integer primNumero;
	private Integer segNumero;
	private Integer terNumero;
	private Integer resultado;
	
	@Inject
	private Flash flash;
	//Realizando a soma
	public String somar() {
		flash.put("soma", resultado= primNumero + segNumero + terNumero);
		//O método está retornando á página que será redirecionada
		return "result?faces-redirect=true";
	}

	public Integer getPrimNumero() {
		return primNumero;
	}

	public void setPrimNumero(Integer primNumero) {
		this.primNumero = primNumero;
	}

	public Integer getSegNumero() {
		return segNumero;
	}

	public void setSegNumero(Integer segNumero) {
		this.segNumero = segNumero;
	}

	public Integer getTerNumero() {
		return terNumero;
	}

	public void setTerNumero(Integer terNumero) {
		this.terNumero = terNumero;
	}

	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}
	
	


	

	

}