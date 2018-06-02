package br.com.uol.gameraccess.web.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.uol.gameraccess.ejb.bo.AlergiaBO;
import br.com.uol.gameraccess.ejb.bo.DoencasBO;
import br.com.uol.gameraccess.ejb.bo.HabitoBO;
import br.com.uol.gameraccess.ejb.bo.MedicamentoBO;
import br.com.uol.gameraccess.ejb.bo.PacienteBO;
import br.com.uol.gameraccess.ejb.model.Medicamento;
import br.com.uol.gameraccess.ejb.model.TB_CadastroDePaciente;
import br.com.uol.gameraccess.ejb.model.TB_Habito;
import br.com.uol.gameraccess.ejb.model.TB_SinaisVitai;
import br.com.uol.gameraccess.ejb.model.Tb_ListaDoenca;

@ManagedBean
public class NovaConsultaBean {

	@EJB
	private HabitoBO habitoBO;

	@EJB
	private PacienteBO pacienteBO;

	@EJB
	private DoencasBO doencasBO;

	@EJB
	private AlergiaBO alergiaBO;

	@EJB
	private MedicamentoBO medicamentoBO;

	private List<TB_Habito> listHabitos;

	private List<Tb_ListaDoenca> listDoencas;

	private List<Tb_ListaDoenca> listAlergias;

	private TB_SinaisVitai sinaisVitais;

	private TB_CadastroDePaciente pacientePesquisa;

	private TB_CadastroDePaciente pacienteSelecionado;

	private List<Medicamento> medicamentosInformado;

	private Medicamento medicamentoSelecionado;

	@PostConstruct
	public void init() {
		pacientePesquisa = new TB_CadastroDePaciente();
		pacienteSelecionado = new TB_CadastroDePaciente();
		medicamentosInformado = new ArrayList<Medicamento>();
		sinaisVitais = new TB_SinaisVitai();
		listHabitos = habitoBO.listar();
		listDoencas = doencasBO.listar();
		listAlergias = alergiaBO.listar();
	}

	public List<TB_CadastroDePaciente> pesquisandoPaciente(String nomeDigitado) {
		pacientePesquisa.setNomePaciente(nomeDigitado);
		return pacienteBO.listar(pacientePesquisa);
	}

	public void adicionarMedicamento() {
		if (medicamentoSelecionado == null) {
			return;
		}
		medicamentosInformado.add(medicamentoSelecionado);
		medicamentoSelecionado = null;
	}

	public List<Medicamento> pesquisandoMedicamento(String nomeDigitado) {
		return medicamentoBO.listar(nomeDigitado);
	}

	public List<TB_Habito> getListHabitos() {
		return listHabitos;
	}

	public void setListHabitos(List<TB_Habito> listHabitos) {
		this.listHabitos = listHabitos;
	}

	public List<Tb_ListaDoenca> getListDoencas() {
		return listDoencas;
	}

	public void setListDoencas(List<Tb_ListaDoenca> listDoencas) {
		this.listDoencas = listDoencas;
	}

	public List<Tb_ListaDoenca> getListAlergias() {
		return listAlergias;
	}

	public void setListAlergias(List<Tb_ListaDoenca> listAlergias) {
		this.listAlergias = listAlergias;
	}

	public TB_SinaisVitai getSinaisVitais() {
		return sinaisVitais;
	}

	public void setSinaisVitais(TB_SinaisVitai sinaisVitais) {
		this.sinaisVitais = sinaisVitais;
	}

	public TB_CadastroDePaciente getPacientePesquisa() {
		return pacientePesquisa;
	}

	public void setPacientePesquisa(TB_CadastroDePaciente pacientePesquisa) {
		this.pacientePesquisa = pacientePesquisa;
	}

	public TB_CadastroDePaciente getPacienteSelecionado() {
		return pacienteSelecionado;
	}

	public void setPacienteSelecionado(TB_CadastroDePaciente pacienteSelecionado) {
		this.pacienteSelecionado = pacienteSelecionado;
	}

	public List<Medicamento> getMedicamentosInformado() {
		return medicamentosInformado;
	}

	public void setMedicamentosInformado(List<Medicamento> medicamentosInformado) {
		this.medicamentosInformado = medicamentosInformado;
	}

	public Medicamento getMedicamentoSelecionado() {
		return medicamentoSelecionado;
	}

	public void setMedicamentoSelecionado(Medicamento medicamentoSelecionado) {
		this.medicamentoSelecionado = medicamentoSelecionado;
	}
}