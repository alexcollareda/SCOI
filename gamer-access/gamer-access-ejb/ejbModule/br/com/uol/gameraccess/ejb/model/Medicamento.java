package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Medicamento database table.
 * 
 */
@Entity
@NamedQuery(name="Medicamento.findAll", query="SELECT m FROM Medicamento m")
public class Medicamento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoMedicamento")
	private int codigoMedicamento;

	@Column(name="NomeMedicamento")
	private String nomeMedicamento;

	public Medicamento() {
	}

	public int getCodigoMedicamento() {
		return this.codigoMedicamento;
	}

	public void setCodigoMedicamento(int codigoMedicamento) {
		this.codigoMedicamento = codigoMedicamento;
	}

	public String getNomeMedicamento() {
		return this.nomeMedicamento;
	}

	public void setNomeMedicamento(String nomeMedicamento) {
		this.nomeMedicamento = nomeMedicamento;
	}

}