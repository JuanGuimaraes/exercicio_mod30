package br.com.juan.dao.jpa;

import br.com.juan.dao.generic.jpa.GenericJpaDAO;
import br.com.juan.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
