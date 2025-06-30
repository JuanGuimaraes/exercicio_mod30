package br.com.juan.dao.jpa;

import br.com.juan.dao.generic.jpa.GenericJpaDAO;
import br.com.juan.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
