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
	
	private String primNumero;
	private String segNumero;
	private String terNumero;
	private int resultado;
	
	@Inject
	private Flash flash;
	
	public String somar() {
		flash.put("soma", resultado= Integer.parseInt("primNumero") + Integer.parseInt("segNumero")+ Integer.parseInt("terNumero"));
		
		return "result?faces-redirect=true";
	}

	public String getPrimNumero() {
		return primNumero;
	}

	public void setPrimNumero(String primNumero) {
		this.primNumero = primNumero;
	}

	public String getSegNumero() {
		return segNumero;
	}

	public void setSegNumero(String segNumero) {
		this.segNumero = segNumero;
	}

	public String getTerNumero() {
		return terNumero;
	}

	public void setTerNumero(String terNumero) {
		this.terNumero = terNumero;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	


	

	

}