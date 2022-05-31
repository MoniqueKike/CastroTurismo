/**
 * 
 */
package br.com.monique.domain.pessoa;
import java.io.Serializable;
/**
 * Classe que recebe dados Passageiro
 * 
 * @author monique.0935
 *@version 1.0.0
 *@since 1.0.0
 */
public class Passageiro extends PessoaFisica implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer NumeroCartao;
	
	private String ValidadeCartao;
	
	private Integer Seguranca;
	
	private PessoaFisica PessoaFisica;

	/**
	 * 
	 */
	public Passageiro() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numeroCartao
	 */
	public Integer getNumeroCartao() {
		return NumeroCartao;
	}

	/**
	 * @param numeroCartao the numeroCartao to set
	 */
	public void setNumeroCartao(Integer numeroCartao) {
		NumeroCartao = numeroCartao;
	}

	/**
	 * @return the validadeCartao
	 */
	public String getValidadeCartao() {
		return ValidadeCartao;
	}

	/**
	 * @param validadeCartao the validadeCartao to set
	 */
	public void setValidadeCartao(String validadeCartao) {
		ValidadeCartao = validadeCartao;
	}

	/**
	 * @return the seguranca
	 */
	public Integer getSeguranca() {
		return Seguranca;
	}

	/**
	 * @param seguranca the seguranca to set
	 */
	public void setSeguranca(Integer seguranca) {
		Seguranca = seguranca;
	}

	/**
	 * @return the pessoaFisica
	 */
	public PessoaFisica getPessoaFisica() {
		return PessoaFisica;
	}

	/**
	 * @param pessoaFisica the pessoaFisica to set
	 */
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		PessoaFisica = pessoaFisica;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((NumeroCartao == null) ? 0 : NumeroCartao.hashCode());
		result = prime * result + ((PessoaFisica == null) ? 0 : PessoaFisica.hashCode());
		result = prime * result + ((Seguranca == null) ? 0 : Seguranca.hashCode());
		result = prime * result + ((ValidadeCartao == null) ? 0 : ValidadeCartao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passageiro other = (Passageiro) obj;
		if (NumeroCartao == null) {
			if (other.NumeroCartao != null)
				return false;
		} else if (!NumeroCartao.equals(other.NumeroCartao))
			return false;
		if (PessoaFisica == null) {
			if (other.PessoaFisica != null)
				return false;
		} else if (!PessoaFisica.equals(other.PessoaFisica))
			return false;
		if (Seguranca == null) {
			if (other.Seguranca != null)
				return false;
		} else if (!Seguranca.equals(other.Seguranca))
			return false;
		if (ValidadeCartao == null) {
			if (other.ValidadeCartao != null)
				return false;
		} else if (!ValidadeCartao.equals(other.ValidadeCartao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"Passageiro [NumeroCartao=%s, ValidadeCartao=%s, Seguranca=%s, PessoaFisica=%s, getCPF()=%s, getRG()=%s, getOrgaoEmissor()=%s, getDataNascimento()=%s, getPessoa()=%s, getId()=%s, getNome()=%s, getTelefoneCelular()=%s, getEmail()=%s, getLogradouro()=%s, getComplemento()=%s, getNumero()=%s, getCidade()=%s]",
				NumeroCartao, ValidadeCartao, Seguranca, PessoaFisica, getCPF(), getRG(), getOrgaoEmissor(),
				getDataNascimento(), getPessoa(), getId(), getNome(), getTelefoneCelular(), getEmail(), getLogradouro(),
				getComplemento(), getNumero(), getCidade());
	}
	
	
}
