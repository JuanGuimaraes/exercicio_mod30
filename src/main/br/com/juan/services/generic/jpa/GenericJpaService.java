package br.com.juan.services.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.juan.dao.Persistente;
import br.com.juan.dao.generic.jpa.IGenericJpaDAO;
import br.com.juan.exceptions.DAOException;
import br.com.juan.exceptions.MaisDeUmRegistroException;
import br.com.juan.exceptions.TableException;
import br.com.juan.exceptions.TipoChaveNaoEncontradaException;

public abstract class GenericJpaService<T extends Persistente, E extends Serializable> 
implements IGenericJpaService<T, E> {

protected IGenericJpaDAO<T, E> dao;

public GenericJpaService(IGenericJpaDAO<T, E> dao) {
	this.dao = dao;
}


@Override
public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
	return this.dao.cadastrar(entity);
}

@Override
public void excluir(T entity) throws DAOException {
	this.dao.excluir(entity);
}

@Override
public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
	return this.dao.alterar(entity);
}

@Override
public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
	return this.dao.consultar(valor);
}

@Override
public Collection<T> buscarTodos() throws DAOException {
	return this.dao.buscarTodos();
}


}
