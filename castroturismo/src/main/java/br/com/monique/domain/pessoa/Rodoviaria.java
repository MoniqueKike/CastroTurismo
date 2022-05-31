/**
 * 
 */
package br.com.monique.domain.pessoa;

/**
 * @author monique.0935
 *
 */
public class Rodoviaria extends PessoaJuridica {
	
	private String horaAbertura;
	
	private String horaFechamento;
	
	private Double taxaEmbarque;
	
	private PessoaJuridica PessoaJuridica;

	/**
	 * 
	 */
	public Rodoviaria() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the horaAbertura
	 */
	public String getHoraAbertura() {
		return horaAbertura;
	}

	/**
	 * @param horaAbertura the horaAbertura to set
	 */
	public void setHoraAbertura(String horaAbertura) {
		this.horaAbertura = horaAbertura;
	}

	/**
	 * @return the horaFechamento
	 */
	public String getHoraFechamento() {
		return horaFechamento;
	}

	/**
	 * @param horaFechamento the horaFechamento to set
	 */
	public void setHoraFechamento(String horaFechamento) {
		this.horaFechamento = horaFechamento;
	}

	/**
	 * @return the taxaEmbarque
	 */
	public Double getTaxaEmbarque() {
		return taxaEmbarque;
	}

	/**
	 * @param taxaEmbarque the taxaEmbarque to set
	 */
	public void setTaxaEmbarque(Double taxaEmbarque) {
		this.taxaEmbarque = taxaEmbarque;
	}

	/**
	 * @return the pessoaJuridica
	 */
	public PessoaJuridica getPessoaJuridica() {
		return PessoaJuridica;
	}

	/**
	 * @param pessoaJuridica the pessoaJuridica to set
	 */
	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		PessoaJuridica = pessoaJuridica;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((PessoaJuridica == null) ? 0 : PessoaJuridica.hashCode());
		result = prime * result + ((horaAbertura == null) ? 0 : horaAbertura.hashCode());
		result = prime * result + ((horaFechamento == null) ? 0 : horaFechamento.hashCode());
		result = prime * result + ((taxaEmbarque == null) ? 0 : taxaEmbarque.hashCode());
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
		Rodoviaria other = (Rodoviaria) obj;
		if (PessoaJuridica == null) {
			if (other.PessoaJuridica != null)
				return false;
		} else if (!PessoaJuridica.equals(other.PessoaJuridica))
			return false;
		if (horaAbertura == null) {
			if (other.horaAbertura != null)
				return false;
		} else if (!horaAbertura.equals(other.horaAbertura))
			return false;
		if (horaFechamento == null) {
			if (other.horaFechamento != null)
				return false;
		} else if (!horaFechamento.equals(other.horaFechamento))
			return false;
		if (taxaEmbarque == null) {
			if (other.taxaEmbarque != null)
				return false;
		} else if (!taxaEmbarque.equals(other.taxaEmbarque))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"Rodoviaria [horaAbertura=%s, horaFechamento=%s, taxaEmbarque=%s, PessoaJuridica=%s, getCNPJ()=%s, getIncricaoEstadual()=%s, getPessoa()=%s, getId()=%s, getNome()=%s, getTelefoneCelular()=%s, getEmail()=%s, getLogradouro()=%s, getComplemento()=%s, getNumero()=%s, getCidade()=%s]",
				horaAbertura, horaFechamento, taxaEmbarque, PessoaJuridica, getCNPJ(), getIncricaoEstadual(),
				getPessoa(), getId(), getNome(), getTelefoneCelular(), getEmail(), getLogradouro(), getComplemento(),
				getNumero(), getCidade());
	}

}
