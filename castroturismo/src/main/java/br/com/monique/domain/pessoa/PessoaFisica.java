/**
 * 
 */
package br.com.monique.domain.pessoa;

import java.io.Serializable;
import java.util.Date;

/**
 * @author monique.0935
 *@version 1.0.0
 */
public class PessoaFisica extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer CPF;
	
	private Integer RG;
	
	private String OrgaoEmissor;
	
	private Date dataNascimento;
	
	private Pessoa Pessoa;

	
	/**
	 * 
	 */
	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the cPF
	 */
	public Integer getCPF() {
		return CPF;
	}

	/**
	 * @param cPF the cPF to set
	 */
	public void setCPF(Integer cPF) {
		CPF = cPF;
	}

	/**
	 * @return the rG
	 */
	public Integer getRG() {
		return RG;
	}

	/**
	 * @param rG the rG to set
	 */
	public void setRG(Integer rG) {
		RG = rG;
	}

	/**
	 * @return the orgaoEmissor
	 */
	public String getOrgaoEmissor() {
		return OrgaoEmissor;
	}

	/**
	 * @param orgaoEmissor the orgaoEmissor to set
	 */
	public void setOrgaoEmissor(String orgaoEmissor) {
		OrgaoEmissor = orgaoEmissor;
	}

	/**
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * @param dataNascimento the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + ((OrgaoEmissor == null) ? 0 : OrgaoEmissor.hashCode());
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
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
		PessoaFisica other = (PessoaFisica) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (OrgaoEmissor == null) {
			if (other.OrgaoEmissor != null)
				return false;
		} else if (!OrgaoEmissor.equals(other.OrgaoEmissor))
			return false;
		if (RG == null) {
			if (other.RG != null)
				return false;
		} else if (!RG.equals(other.RG))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		return true;
	}

	public Pessoa getPessoa() {
		return Pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		Pessoa = pessoa;
	}
	
	
}
