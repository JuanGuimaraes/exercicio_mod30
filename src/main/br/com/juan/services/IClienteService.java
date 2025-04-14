package br.com.juan.services;

import br.com.juan.domain.Cliente;
import br.com.juan.exceptions.DAOException;
import br.com.juan.exceptions.TipoChaveNaoEncontradaException;
import br.com.juan.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {
	
	Cliente buscarPorCPF(Long cpf) throws DAOException;
	//
}
