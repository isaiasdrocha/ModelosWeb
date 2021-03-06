package br.com.isaiasdrocha.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import br.com.isaiasdrocha.enums.EnumTipoPessoa;

@Entity
public class Pessoa implements Serializable{

	private static final long serialVersionUID = 8729681972796386368L;

	/*****************************************************************/
	/*************************** ATRIBUTOS ***************************/
	/*****************************************************************/
	@Id
    @GeneratedValue
    private Integer id;
	
	@Column(length = 11)
	private Long codigo;
	
	@Size(min = 2, max = 60)
	private String nomeRazao;
	
	/*****************************************************************/
	/***************************** ENUMS *****************************/
	/*****************************************************************/
	@Enumerated(EnumType.STRING)
	private EnumTipoPessoa tipoPessoa;
	
	
	/*****************************************************************/
	/************************** FOREING KEY **************************/
	/*****************************************************************/
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "pessoa_endereco",
		joinColumns = { @JoinColumn(name = "pessoa_id") }, 
		inverseJoinColumns = { @JoinColumn(name = "endereco_id") })
	private List<Endereco> enderecos;
	
	/*****************************************************************/
	/********************** GETTERS AND SETTERS **********************/
	/*****************************************************************/
	public String getNomeRazao() {
		return nomeRazao;
	}

	public void setNomeRazao(String nomeRazao) {
		this.nomeRazao = nomeRazao;
	}

	public EnumTipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(EnumTipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
}