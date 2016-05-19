package br.edu.ifba.wmobile.camadasosi;

import java.util.ArrayList;
import java.util.List;

public class Transporte implements ICamada{
	private ICamada anterior;
	
	public Transporte(ICamada anterior){
		this.anterior = anterior;
	}
	@Override
	public String getNome() {
		return "Transporte";
	}

	@Override
	public int getTamanhoBytes() {
		return anterior.getTamanhoBytes()+210;
	}

	@Override
	public List<String> getProtocolos() {
		List<String> protocolos = new ArrayList<String>();
		protocolos.add("UDP");
		protocolos.add("TCP");
		protocolos.add("SCTP");
		protocolos.add("ESP");
		return protocolos;
	}

	@Override
	public List<String> getCabecalhos() {
		List<String> cabecalhos = anterior.getCabecalhos(); 
		cabecalhos.add("Authentication Header");
		cabecalhos.add("Transport Header");
		return cabecalhos;
	}

	@Override
	public int getNumero() {
		return 4;
	}
	@Override
	public String getPayload() {
		return "Segmentos";
	}
	@Override
	public String getResumoFuncao() {
		return "Garante que segmentos sejam entregues sem falhas, duplicidade e em sequência, "
				+ "eliminando os erros vindos das camadas anteriores. Implementa dois protocolos principais"
				+ " o TCP, que tem garantia de entrega e UDP que visa a velocidade, par aplicações em tempo real.";
	}

}
