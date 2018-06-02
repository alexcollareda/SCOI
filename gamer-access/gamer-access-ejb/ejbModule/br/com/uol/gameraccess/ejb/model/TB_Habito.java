package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TB_Habitos database table.
 * 
 */
@Entity
@Table(name="TB_Habitos")
@NamedQuery(name="TB_Habito.findAll", query="SELECT t FROM TB_Habito t")
public class TB_Habito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoHabitos")
	private int codigoHabitos;

	@Column(name="DescricaoHabitos")
	private String descricaoHabitos;

	//bi-directional one-to-one association to TB_Anamnese_has_TB_Habito
	@OneToOne(mappedBy="tbHabito")
	private TB_Anamnese_has_TB_Habito tbAnamneseHasTbHabito;

	public TB_Habito() {
	}

	public int getCodigoHabitos() {
		return this.codigoHabitos;
	}

	public void setCodigoHabitos(int codigoHabitos) {
		this.codigoHabitos = codigoHabitos;
	}

	public String getDescricaoHabitos() {
		return this.descricaoHabitos;
	}

	public void setDescricaoHabitos(String descricaoHabitos) {
		this.descricaoHabitos = descricaoHabitos;
	}

	public TB_Anamnese_has_TB_Habito getTbAnamneseHasTbHabito() {
		return this.tbAnamneseHasTbHabito;
	}

	public void setTbAnamneseHasTbHabito(TB_Anamnese_has_TB_Habito tbAnamneseHasTbHabito) {
		this.tbAnamneseHasTbHabito = tbAnamneseHasTbHabito;
	}

}