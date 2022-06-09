package br.com.rafaelcosta.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.application.model.Cliente;

//Tempo de vida do EJB
//Stateless= Tem a mesma função que o RequestScope, ele será usado na hora de ter uma requesição
@Stateless
public class ClienteBean {

	@PersistenceContext
	private EntityManager em;
	
	//Método que será obtido o select da clase Clientes
	public List<Cliente> listar() {
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
}
