package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Professor database table.
 * 
 */
@Entity
@NamedQuery(name="Professor.findAll", query="SELECT p FROM Professor p")
public class Professor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RT")
	private int rt;

	@Column(name="NomeProfessor")
	private String nomeProfessor;

	@Column(name="SenhaProfessor")
	private String senhaProfessor;

	public Professor() {
	}

	public int getRt() {
		return this.rt;
	}

	public void setRt(int rt) {
		this.rt = rt;
	}

	public String getNomeProfessor() {
		return this.nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getSenhaProfessor() {
		return this.senhaProfessor;
	}

	public void setSenhaProfessor(String senhaProfessor) {
		this.senhaProfessor = senhaProfessor;
	}

}