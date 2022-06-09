package br.com.rafaelcosta.application.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//Entidade
@Entity
public class Cliente implements Serializable {
	//Id
	@Id
	@GeneratedValue
	private Integer id;
	//Definindo o tamanho de caractres que irá ter o Banco de Dados
	//nullable= definindo se pode ou não deixar null
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 50, nullable = false)
	private String email;
	//OneToMany= Colocando a chave estrangeira na tabela
	
	//Mappedby= Ele vai determinar irá ser denominado entre as relações
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
}

