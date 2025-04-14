package br.com.juan.dao;

import br.com.juan.dao.generic.IGenericDAO;
import br.com.juan.domain.Venda;
import br.com.juan.exceptions.DAOException;
import br.com.juan.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {
	
public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

}
