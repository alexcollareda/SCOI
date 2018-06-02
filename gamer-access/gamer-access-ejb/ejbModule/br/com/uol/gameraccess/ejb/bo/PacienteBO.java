package br.com.uol.gameraccess.ejb.bo;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.uol.gameraccess.ejb.dao.PacienteDAO;
import br.com.uol.gameraccess.ejb.model.TB_CadastroDePaciente;

@Stateless
public class PacienteBO {

	@Inject
	private PacienteDAO pacienteDAO;

	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<TB_CadastroDePaciente> listar(TB_CadastroDePaciente pacientePesquisa) {
		return pacienteDAO.listar(pacientePesquisa);
	}
}