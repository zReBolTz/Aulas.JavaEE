package br.com.senai.analima.application.model;

import java.util.Date;
//Objetos e seus atributos
public class Despesas {

private String data;
private String descricao;
private Double valor;
private Boolean edit;


public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Double getValor() {
	return valor;
}
public void setValor(Double valor) {
	this.valor = valor;
}
public Boolean getEdit() {
	return edit;
}
public void setEdit(Boolean edit) {
	this.edit = edit;
}
	
	
	
}
