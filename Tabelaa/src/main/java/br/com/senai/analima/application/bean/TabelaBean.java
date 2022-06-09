package br.com.senai.analima.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;
import br.com.senai.analima.application.model.Despesas;

@SuppressWarnings("serial")
@Named("tabela")
@SessionScoped //Enquanto o navegador estiver aberto o Bean estará em funcionamento.

public class TabelaBean implements Serializable {
	//Criando uma lista de Despesas
	private List<Despesas> despesasList = new ArrayList<>();
	//o ListDataModel tem algumas funções diferentes que o List normal
	private ListDataModel<Despesas> despesas = new ListDataModel<>(despesasList);
	
	//Quando é usado o método inserir, será criado uma nova instância e adicionar na lista
	public String inserir() {	
	Despesas desp = new Despesas(); 
	desp.setEdit(true);
	despesasList.add(desp);
		return null;
	}
	
	public String excluir(Despesas despesa) {	
	despesasList.remove(despesa);
		return null;
	}
	
	public String editar(Despesas despesa) {	
	 despesa.setEdit(true);
		return null;
	}
	
	public String gravar(Despesas despesa) {	
	 despesa.setEdit(false);
		return null;
	}
	
	public ListDataModel<Despesas> getDespesas() {
		return despesas;
		
	} 

	
	}
	
	