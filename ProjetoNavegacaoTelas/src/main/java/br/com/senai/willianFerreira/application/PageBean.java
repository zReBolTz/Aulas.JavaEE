package br.com.senai.willianFerreira.application;


import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
//RequestScoped= determina o tempo de vida que terá está classe
//Está classe irá funcionar apenas quando for feita uma requisição
@RequestScoped
@SuppressWarnings("serial")
public class PageBean implements Serializable {
	
	//Criando um enum com as páginas
	//Enum= enum é uma maneira de dizer que sempreterá um conjunto de informações que podem se repetir durante o site
	public enum Pages{
		page_a, page_b
	}
	
	private String page;

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	//Comparando se uma String/Objeto é igual o valor que está determinada na váriavel"page"
	public Pages go_to(){
		if("a".equals(page)) {
			return Pages.page_a;
		}else if("b".equals(page)) {
			return Pages.page_b;
		}else {
			
			return null;
		}
			
	}
}
