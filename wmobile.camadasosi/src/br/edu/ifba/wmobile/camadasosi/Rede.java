package br.edu.ifba.wmobile.camadasosi;

import java.util.ArrayList;
import java.util.List;

public class Rede implements ICamada{
	private ICamada anterior;
	public Rede(ICamada anterior){
		this.anterior = anterior;
	}
	@Override
	public String getNome() {
		return "Rede";
	}

	@Override
	public int getTamanhoBytes() {
		return anterior.getTamanhoBytes()+215;
	}

	@Override
	public List<String> getProtocolos() {
		List<String> protocolos = new ArrayList<String>();
		protocolos.add("IPv4");
		protocolos.add("IPv6");
		protocolos.add("IPX");
		protocolos.add("ICMP");
		protocolos.add("IGMP");
		protocolos.add("ARP");
		protocolos.add("RIP");
		protocolos.add("XNS");
		return protocolos;
	}

	@Override
	public List<String> getCabecalhos() {
		List<String> cabecalhos = anterior.getCabecalhos();
		cabecalhos.add("Network Header");
		return cabecalhos;
	}

	@Override
	public int getNumero() {
		return 3;
	}
	@Override
	public String getPayload() {
		return "Pacotes";
	}
	@Override
	public String getResumoFuncao() {
		return "Controla as operações de sub-redes, controlando o destino dos pacotes na rede,"
				+ " implementando o roteamento dos mesmos e mapeamento de endereço lógico-físico,"
				+ " através dos protocolos ARP/RARP.";
	}

}
