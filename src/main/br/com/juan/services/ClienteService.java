package br.com.juan.services;

import br.com.juan.dao.IClienteDAO;
import br.com.juan.domain.Cliente;
import br.com.juan.services.generic.GenericService;
import br.com.juan.exceptions.DAOException;
import br.com.juan.exceptions.MaisDeUmRegistroException;
import br.com.juan.exceptions.TableException;
import br.com.juan.exceptions.TipoChaveNaoEncontradaException;

public class ClienteService  extends GenericService<Cliente, Long> implements IClienteService {
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		//this.clienteDAO = clienteDAO;
	}

	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


}
