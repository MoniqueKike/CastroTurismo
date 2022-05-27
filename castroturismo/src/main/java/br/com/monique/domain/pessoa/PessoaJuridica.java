/**
 * 
 */
package br.com.monique.domain.pessoa;

import java.io.Serializable;
/**
 * @author monique.0935
 *
 */
	public class PessoaJuridica extends Pessoa implements Serializable {

		private static final long serialVersionUID = 1L;
		
		private Integer CNPJ;
		
		private Integer IncricaoEstadual;
		
		private Pessoa Pessoa;

		/**
		 * 
		 */
		public PessoaJuridica() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @return the cNPJ
		 */
		public Integer getCNPJ() {
			return CNPJ;
		}

		/**
		 * @param cNPJ the cNPJ to set
		 */
		public void setCNPJ(Integer cNPJ) {
			CNPJ = cNPJ;
		}

		/**
		 * @return the incricaoEstadual
		 */
		public Integer getIncricaoEstadual() {
			return IncricaoEstadual;
		}

		/**
		 * @param incricaoEstadual the incricaoEstadual to set
		 */
		public void setIncricaoEstadual(Integer incricaoEstadual) {
			IncricaoEstadual = incricaoEstadual;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + ((CNPJ == null) ? 0 : CNPJ.hashCode());
			result = prime * result + ((IncricaoEstadual == null) ? 0 : IncricaoEstadual.hashCode());
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
			PessoaJuridica other = (PessoaJuridica) obj;
			if (CNPJ == null) {
				if (other.CNPJ != null)
					return false;
			} else if (!CNPJ.equals(other.CNPJ))
				return false;
			if (IncricaoEstadual == null) {
				if (other.IncricaoEstadual != null)
					return false;
			} else if (!IncricaoEstadual.equals(other.IncricaoEstadual))
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
