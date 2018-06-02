package br.com.uol.gameraccess.ejb.bo;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.uol.gameraccess.ejb.dao.HabitoDAO;
import br.com.uol.gameraccess.ejb.model.TB_Habito;

@Stateless
public class HabitoBO {

	@Inject
	private HabitoDAO habitoDAO;

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<TB_Habito> listar() {
		return habitoDAO.listar();
	}
}