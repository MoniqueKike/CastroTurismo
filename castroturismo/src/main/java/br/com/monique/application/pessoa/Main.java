package br.com.monique.application.pessoa;

import java.util.Date;

import br.com.monique.domain.itinerario.Rota;
import br.com.monique.domain.local.Cidade;
import br.com.monique.domain.local.Estado;
import br.com.monique.domain.local.Pais;
import br.com.monique.domain.pessoa.Motorista;
import br.com.monique.domain.pessoa.Passageiro;
import br.com.monique.domain.pessoa.Rodoviaria;
import br.com.monique.domain.veiculo.CombustiveisEnum;
import br.com.monique.domain.veiculo.Onibus;
import br.com.monique.domain.veiculo.Seguradora;
import br.com.monique.domain.viagem.FormaPagamentoEnum;
import br.com.monique.domain.viagem.Passagem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pais
		Pais pais = new Pais();

		pais.setId(1);

		pais.setNome("Brasil");

		System.out.println(pais);

		Estado estado = new Estado();

		estado = new Estado();

		estado.setId(1);

		estado.setNome("Parana");

		estado.setPais(pais);

		System.out.println(estado);

		Estado sp = new Estado();
		sp.setId(2);
		sp.setNome("São Paulo");
		sp.setPais(pais);
		System.out.println(sp);

		// cidade
		Cidade castro = new Cidade();

		castro.setId(1);

		castro.setNome("Castro");

		castro.setEstado(estado);

		System.out.println(castro);

		Cidade itp = new Cidade();

		itp.setId(2);

		itp.setNome("Itapetinga");

		itp.setEstado(sp);

		System.out.println(itp);

		// pessoas
		Motorista motorista = new Motorista();

		motorista.setNome("Tubarão da 151");

		motorista.setTelefoneCelular("42 9999-0000");

		motorista.setEmail("tubarao151@castroturismo.com.br");

		motorista.setLogradouro("Rua tal");

		motorista.setComplemento("Apt 01");

		motorista.setNumero(60);

		motorista.setCidade(castro);

		// Pessoa Fisica
		motorista.setCPF(123456789);

		motorista.setRG(123456);

		motorista.setOrgaoEmissor("SSPR");

		Date dataNascimento = new Date();

		motorista.setDataNascimento(dataNascimento);

		// funcionario
		motorista.setNumeroRegistro(1451);

		motorista.setEstaAtivo(true);

		// motorista
		motorista.setCNH(145678989);

		motorista.setCategoriaCNH("AE");

		motorista.setEAR(true);

		System.out.println(motorista);

		Passageiro passageiro = new Passageiro();

		passageiro.setId(2);

		passageiro.setNome("José das couves");

		passageiro.setTelefoneCelular("42 9999-9999");

		passageiro.setCPF(12345);

		System.out.println(passageiro);

		Rodoviaria rodCastro = new Rodoviaria();

		rodCastro.setId(4);

		rodCastro.setNome("Rodoviaria de Castro");

		rodCastro.setCNPJ(12345);

		rodCastro.setCidade(castro);

		System.out.println(rodCastro);

		Rodoviaria rodItp = new Rodoviaria();

		rodItp.setId(5);

		rodItp.setCNPJ(456789);

		rodItp.setCidade(itp);

		System.out.println(rodItp);

		Seguradora seguradora = new Seguradora();

		seguradora.setId(1);

		seguradora.setNome("Bradesco");

		seguradora.setCorretor("Ze do seguro");

		seguradora.setTelefone("42 99999");

		Onibus onibus = new Onibus();

		onibus.setId(1);

		onibus.setPlaca("ABC123");

		onibus.setRenavam(12345678);

		onibus.setEstaSegurado(true);

		onibus.setQuilometragem(1200.25);

		onibus.setApolice("12345678");

		onibus.setNumeroEixos(3);

		onibus.setCombustivel(CombustiveisEnum.DIESEL_S500);

		onibus.setPoltrona(30);

		onibus.setSeguradora(seguradora);

		Rota rota = new Rota();

		rota.setId(1);

		rota.setDestino(rodItp);

		rota.setOrigem(rodCastro);

		rota.setOnibus(onibus);

		rota.setQuilometragem(540.0);

		rota.setPrecopassagem(540.0 * 4.80);

		rota.setMotorista(motorista);

		Passagem passagem = new Passagem();

		passagem.setId(1);

		passagem.setNumeroPassagem(1520);

		passagem.setFormaPagamento(FormaPagamentoEnum.DINHEIRO);

		passagem.setPossuiBagagem(true);

		passagem.setPassageiro(passageiro);

		passagem.setRota(rota);

		System.out.println(passagem);

	}

}
