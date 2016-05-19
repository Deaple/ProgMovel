package br.edu.ifba.wmobile.camadasosi;

import java.util.ArrayList;
import java.util.List;

public class Apresentacao implements ICamada {
	private ICamada anterior;
	
	public Apresentacao(ICamada anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String getNome() {
		return "Apresentação";
	}

	@Override
	public int getTamanhoBytes() {
		return anterior.getTamanhoBytes()+215;
	}

	@Override
	public List<String> getProtocolos() {
		List<String> protocolos = new ArrayList<String>();
		protocolos.add("TLS");
		protocolos.add("ASCII");
		return protocolos;
	}

	@Override
	public List<String> getCabecalhos() {
		List<String> cabecalhos = anterior.getCabecalhos();
		cabecalhos.add("Presentation Header");
		return cabecalhos;
	}

	@Override
	public int getNumero() {
		return 6;
	}

	@Override
	public String getPayload() {
		return "Dados";
	}

	@Override
	public String getResumoFuncao() {
		return "Formata os dados para exibição para a Camada de Aplicação,"
				+ " de acordo com padrões como o ASCII e também através da decriptação das informações,"
				+ " como o TLS.";
	}
}