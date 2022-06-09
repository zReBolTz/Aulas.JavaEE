package br.com.rafaelcosta.application.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.rafaelcosta.application.ejb.ClienteBean;
import br.com.rafaelcosta.application.ejb.PedidoBean;
import br.com.rafaelcosta.application.ejb.ProdutoBean;
import br.com.rafaelcosta.application.model.Cliente;
import br.com.rafaelcosta.application.model.Produto;


@Named
@RequestScoped
public class EditPedidoBean implements Serializable {
	
	@EJB
	private PedidoBean pedidoBean;
	
	@EJB
	private ProdutoBean produtoBean;
	
	@EJB
	private ClienteBean clienteBean;
	
	private List<Cliente> clientes;
	private List<Produto> produtos;
	//Variáveis que recebe o id do cliente e os ids dos produtos
	private Integer selectedClienteId;
	private Integer[] selectedProdutosIds;
	
	@PostConstruct
	public void init() {
		clientes = clienteBean.listar();
		produtos = produtoBean.listar();
	}
	
	//Pegandos os ids dos dois objetos e enviando para o método cadastrar
	public String cadastrarPedido() throws Exception {
		pedidoBean.cadastrar(selectedClienteId, selectedProdutosIds);	
		return "pedidos?faces-redirect=true";
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public Integer getSelectedClienteId() {
		return selectedClienteId;
	}

	public void setSelectedClienteId(Integer selectedClienteId) {
		this.selectedClienteId = selectedClienteId;
	}

	public Integer[] getSelectedProdutosIds() {
		return selectedProdutosIds;
	}

	public void setSelectedProdutosIds(Integer[] selectedProdutosIds) {
		this.selectedProdutosIds = selectedProdutosIds;
	}
}