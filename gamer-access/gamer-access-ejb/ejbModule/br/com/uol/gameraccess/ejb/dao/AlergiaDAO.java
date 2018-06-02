package br.com.uol.gameraccess.ejb.dao;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.uol.gameraccess.ejb.model.TB_Alergia;

@ManagedBean
public class AlergiaDAO {

	@PersistenceContext(unitName = "JPAGamerAccess")
	private EntityManager em;

	public List<TB_Alergia> listar() {
		TypedQuery<TB_Alergia> query = em.createQuery(getSql(), TB_Alergia.class);
		return query.getResultList();
	}

	private String getSql() {
		StringBuilder hql = new StringBuilder();
		hql.append("SELECT alergia FROM TB_Alergia alergia");
		return hql.toString();
	}

}