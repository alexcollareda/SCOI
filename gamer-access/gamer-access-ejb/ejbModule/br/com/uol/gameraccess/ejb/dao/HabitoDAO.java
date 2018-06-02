package br.com.uol.gameraccess.ejb.dao;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.uol.gameraccess.ejb.model.TB_Habito;

@ManagedBean
public class HabitoDAO {

	@PersistenceContext(unitName = "JPAGamerAccess")
	private EntityManager em;

	public List<TB_Habito> listar() {
		TypedQuery<TB_Habito> query = em.createQuery(getSql(), TB_Habito.class);
		return query.getResultList();
	}

	private String getSql() {
		StringBuilder hql = new StringBuilder();
		hql.append("SELECT habitos FROM TB_Habito habitos");
		return hql.toString();
	}

}