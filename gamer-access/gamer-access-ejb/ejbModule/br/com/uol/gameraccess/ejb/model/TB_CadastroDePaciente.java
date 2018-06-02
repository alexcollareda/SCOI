package br.com.uol.gameraccess.ejb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the TB_CadastroDePaciente database table.
 * 
 */
@Entity
@NamedQuery(name="TB_CadastroDePaciente.findAll", query="SELECT t FROM TB_CadastroDePaciente t")
public class TB_CadastroDePaciente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CodigoPaiciente")
	private int codigoPaiciente;

	@Column(name="BairroPaciente")
	private String bairroPaciente;

	private String CEPPaciente;

	@Column(name="CidadePaciente")
	private String cidadePaciente;

	@Column(name="ComplementoEnderecoPaciente")
	private String complementoEnderecoPaciente;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DataNascimento")
	private Date dataNascimento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DataPrimeiraConsulta")
	private Date dataPrimeiraConsulta;

	@Column(name="Email")
	private String email;

	@Column(name="LocalDeNascimento")
	private String localDeNascimento;

	@Column(name="Nacionalidade")
	private String nacionalidade;

	@Column(name="NomePaciente")
	private String nomePaciente;

	@Column(name="Proficao")
	private String proficao;

	@Column(name="RG")
	private String rg;

	@Column(name="RuaPaciente")
	private String ruaPaciente;

	private int TB_Estado_CodigoEstado;

	private int TB_Raca_CodigoRaca;

	private int TB_Sexo_CodigoSexo;

	@Column(name="TelefonePaciente")
	private String telefonePaciente;

	//bi-directional one-to-one association to TB_Anamnese
	@OneToOne
	@JoinColumn(name="TB_Anamnese_CodigoAnamnese")
	private TB_Anamnese tbAnamnese;

	public TB_CadastroDePaciente() {
	}

	public int getCodigoPaiciente() {
		return this.codigoPaiciente;
	}

	public void setCodigoPaiciente(int codigoPaiciente) {
		this.codigoPaiciente = codigoPaiciente;
	}

	public String getBairroPaciente() {
		return this.bairroPaciente;
	}

	public void setBairroPaciente(String bairroPaciente) {
		this.bairroPaciente = bairroPaciente;
	}

	public String getCEPPaciente() {
		return this.CEPPaciente;
	}

	public void setCEPPaciente(String CEPPaciente) {
		this.CEPPaciente = CEPPaciente;
	}

	public String getCidadePaciente() {
		return this.cidadePaciente;
	}

	public void setCidadePaciente(String cidadePaciente) {
		this.cidadePaciente = cidadePaciente;
	}

	public String getComplementoEnderecoPaciente() {
		return this.complementoEnderecoPaciente;
	}

	public void setComplementoEnderecoPaciente(String complementoEnderecoPaciente) {
		this.complementoEnderecoPaciente = complementoEnderecoPaciente;
	}

	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getDataPrimeiraConsulta() {
		return this.dataPrimeiraConsulta;
	}

	public void setDataPrimeiraConsulta(Date dataPrimeiraConsulta) {
		this.dataPrimeiraConsulta = dataPrimeiraConsulta;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocalDeNascimento() {
		return this.localDeNascimento;
	}

	public void setLocalDeNascimento(String localDeNascimento) {
		this.localDeNascimento = localDeNascimento;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNomePaciente() {
		return this.nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getProficao() {
		return this.proficao;
	}

	public void setProficao(String proficao) {
		this.proficao = proficao;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRuaPaciente() {
		return this.ruaPaciente;
	}

	public void setRuaPaciente(String ruaPaciente) {
		this.ruaPaciente = ruaPaciente;
	}

	public int getTB_Estado_CodigoEstado() {
		return this.TB_Estado_CodigoEstado;
	}

	public void setTB_Estado_CodigoEstado(int TB_Estado_CodigoEstado) {
		this.TB_Estado_CodigoEstado = TB_Estado_CodigoEstado;
	}

	public int getTB_Raca_CodigoRaca() {
		return this.TB_Raca_CodigoRaca;
	}

	public void setTB_Raca_CodigoRaca(int TB_Raca_CodigoRaca) {
		this.TB_Raca_CodigoRaca = TB_Raca_CodigoRaca;
	}

	public int getTB_Sexo_CodigoSexo() {
		return this.TB_Sexo_CodigoSexo;
	}

	public void setTB_Sexo_CodigoSexo(int TB_Sexo_CodigoSexo) {
		this.TB_Sexo_CodigoSexo = TB_Sexo_CodigoSexo;
	}

	public String getTelefonePaciente() {
		return this.telefonePaciente;
	}

	public void setTelefonePaciente(String telefonePaciente) {
		this.telefonePaciente = telefonePaciente;
	}

	public TB_Anamnese getTbAnamnese() {
		return this.tbAnamnese;
	}

	public void setTbAnamnese(TB_Anamnese tbAnamnese) {
		this.tbAnamnese = tbAnamnese;
	}

}