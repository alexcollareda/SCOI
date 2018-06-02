package br.com.uol.gameraccess.ejb.dao;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.uol.gameraccess.ejb.model.TB_CadastroDePaciente;

@ManagedBean
public class PacienteDAO {

	@PersistenceContext(unitName = "JPAGamerAccess")
	private EntityManager em;

	public List<TB_CadastroDePaciente> listar(TB_CadastroDePaciente pacientePesquisa) {
		TypedQuery<TB_CadastroDePaciente> query = em.createQuery(getSql(pacientePesquisa), TB_CadastroDePaciente.class);

		if (pacientePesquisa != null) {
			if (pacientePesquisa.getRg() != null && !pacientePesquisa.getRg().isEmpty()) {
				query.setParameter("rg", pacientePesquisa.getRg());
			}

			if (pacientePesquisa.getNomePaciente() != null && !pacientePesquisa.getNomePaciente().isEmpty()) {
				query.setParameter("nomePaciente", "%" + pacientePesquisa.getNomePaciente() + "%");
			}
		}

		return query.getResultList();
	}

	private String getSql(TB_CadastroDePaciente pacientePesquisa) {
		StringBuilder hql = new StringBuilder();
		hql.append("SELECT paciente FROM TB_CadastroDePaciente paciente where 1=1");

		if (pacientePesquisa != null) {
			if (pacientePesquisa.getRg() != null && !pacientePesquisa.getRg().isEmpty()) {
				hql.append(" and paciente.rg = :rg ");
			}

			if (pacientePesquisa.getNomePaciente() != null && !pacientePesquisa.getNomePaciente().isEmpty()) {
				hql.append(" and paciente.nomePaciente like :nomePaciente ");
			}
		}
		return hql.toString();
	}

}