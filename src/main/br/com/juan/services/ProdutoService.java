package br.com.juan.services;

import br.com.juan.dao.IProdutoDAO;
import br.com.juan.domain.Produto;
import br.com.juan.services.generic.GenericService;

public class ProdutoService  extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
