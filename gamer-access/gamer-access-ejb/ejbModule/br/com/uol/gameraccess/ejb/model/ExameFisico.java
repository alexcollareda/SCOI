package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ExameFisico database table.
 * 
 */
@Entity
@NamedQuery(name="ExameFisico.findAll", query="SELECT e FROM ExameFisico e")
public class ExameFisico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoExameFisico")
	private int codigoExameFisico;

	@Column(name="TipoExameFisico")
	private String tipoExameFisico;

	public ExameFisico() {
	}

	public int getCodigoExameFisico() {
		return this.codigoExameFisico;
	}

	public void setCodigoExameFisico(int codigoExameFisico) {
		this.codigoExameFisico = codigoExameFisico;
	}

	public String getTipoExameFisico() {
		return this.tipoExameFisico;
	}

	public void setTipoExameFisico(String tipoExameFisico) {
		this.tipoExameFisico = tipoExameFisico;
	}

}