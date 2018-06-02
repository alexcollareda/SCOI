package br.com.uol.gameraccess.ejb.dao;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.uol.gameraccess.ejb.model.Tb_ListaDoenca;

@ManagedBean
public class DoencaDAO {

	@PersistenceContext(unitName = "JPAGamerAccess")
	private EntityManager em;

	public List<Tb_ListaDoenca> listarDoencas() {
		TypedQuery<Tb_ListaDoenca> query = em.createQuery(getSql(), Tb_ListaDoenca.class);
		return query.getResultList();
	}

	private String getSql() {
		StringBuilder hql = new StringBuilder();
		hql.append("SELECT doencas FROM Tb_ListaDoenca doencas");
		return hql.toString();
	}

}