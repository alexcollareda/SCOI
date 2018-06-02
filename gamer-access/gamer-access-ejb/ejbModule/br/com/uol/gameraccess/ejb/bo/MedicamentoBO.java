package br.com.uol.gameraccess.ejb.bo;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.uol.gameraccess.ejb.dao.MedicamentoDAO;
import br.com.uol.gameraccess.ejb.model.Medicamento;

@Stateless
public class MedicamentoBO {

	@Inject
	private MedicamentoDAO medicamentoDAO;

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Medicamento> listar(String nomeMedicamento) {
		return medicamentoDAO.listar(nomeMedicamento);
	}

	public Medicamento buscarPorID(int idMedicamento) {
		return medicamentoDAO.findByID(idMedicamento);
	}
}