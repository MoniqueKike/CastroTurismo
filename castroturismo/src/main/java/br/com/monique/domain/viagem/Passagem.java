/**
 * 
 */
package br.com.monique.domain.viagem;
import java.io.Serializable;
/**
 * @author monique.0935
 *
 */
public class Passagem implements Serializable {

	private Integer id;
	
	private Integer numeroPassagem;
	
	private FormaPagamentoEnum formaPagamento;
}
