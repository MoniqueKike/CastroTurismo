/**
 * 
 */
package br.com.monique.domain.veiculo;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * @author monique.0935
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
   public abstract class Veiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String placa;
	
	private Integer renavam;
	
	private Double quilometragem;
	
	private Boolean estaSegurado;
	
	private String apolice;
	
	private Integer numeroEixos;
	
	private CombustiveisEnum combustivel;

	private Seguradora seguradora;
	
	
}
