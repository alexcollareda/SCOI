package br.com.uol.gameraccess.ejb.dao;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.uol.gameraccess.ejb.model.Medicamento;

@ManagedBean
public class MedicamentoDAO {

	@PersistenceContext(unitName = "JPAGamerAccess")
	private EntityManager em;

	public List<Medicamento> listar(String nomeMedicamento) {
		TypedQuery<Medicamento> query = em.createQuery(getSql(nomeMedicamento), Medicamento.class);

		if (nomeMedicamento != null && !nomeMedicamento.isEmpty())
			query.setParameter("nomeMedicamento", "%" + nomeMedicamento + "%");

		return query.getResultList();
	}

	private String getSql(String nomeMedicamento) {
		StringBuilder hql = new StringBuilder();
		hql.append("SELECT medicamento FROM Medicamento medicamento WHERE 1=1");
		if (nomeMedicamento != null && !nomeMedicamento.isEmpty())
			hql.append(" AND medicamento.nomeMedicamento like :nomeMedicamento ");
		return hql.toString();
	}

	public Medicamento findByID(int idMedicamento) {
		Query query = em.createQuery(getSqlFindByID(), Medicamento.class);
		query.setParameter("idMedicamento", idMedicamento);
		return (Medicamento) query.getSingleResult();
	}

	private String getSqlFindByID() {
		StringBuilder hql = new StringBuilder();
		hql.append("SELECT medicamento FROM Medicamento medicamento WHERE medicamento.codigoMedicamento = :idMedicamento");
		return hql.toString();
	}

}