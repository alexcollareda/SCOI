package br.com.uol.gameraccess.ejb.bo;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.uol.gameraccess.ejb.dao.DoencaDAO;
import br.com.uol.gameraccess.ejb.model.Tb_ListaDoenca;

@Stateless
public class DoencasBO {

	@Inject
	private DoencaDAO doencasDAO;

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Tb_ListaDoenca> listar() {
		return doencasDAO.listarDoencas();
	}
}