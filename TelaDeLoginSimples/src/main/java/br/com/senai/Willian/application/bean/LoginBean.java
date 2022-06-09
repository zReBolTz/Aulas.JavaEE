package br.com.senai.Willian.application.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@SuppressWarnings("serial")
@Named
@RequestScoped

public class LoginBean implements Serializable{

	private String nome;
	private String senha;
	
	@PostConstruct
	public void onCreate() {
		System.out.println("Bean criado!");
	}
	
	@PreDestroy
	public void onDrestroy() {
		System.out.println("Bean será detruído");
	}

	//Fazendo a validação do usuário
	//Como String é um objeto, devemos usar o equals para comparar dois objetos
	public String doLogin() {
		if("abc".equals(nome) && "123".equals(senha)) {
			//Fazendo um outcome
			//Outcome: retorna á página requerida
				return "sucesso";	
		}
		return null;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
