package br.com.juan.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.juan.dao.Persistente;
import br.com.juan.dao.generic.IGenericDAO;
import br.com.juan.exceptions.DAOException;
import br.com.juan.exceptions.MaisDeUmRegistroException;
import br.com.juan.exceptions.TableException;
import br.com.juan.exceptions.TipoChaveNaoEncontradaException;


public class GenericService <T extends Persistente, E extends Serializable> 
implements IGenericService<T, E>{

	
protected IGenericDAO<T,E> dao;
	
	public GenericService(IGenericDAO<T,E> dao) {
		this.dao = dao;
	}

	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.cadastrar(entity);
	}

	public void excluir(E valor) throws DAOException {
		this.dao.excluir(valor);
	}

	public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		this.dao.alterar(entity);
	}

	public T consultar(E valor) throws DAOException {
		try {
			return this.dao.consultar(valor);
		} catch (MaisDeUmRegistroException | TableException e) {

			e.printStackTrace();
		}
		return null;
	}

	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}
}
