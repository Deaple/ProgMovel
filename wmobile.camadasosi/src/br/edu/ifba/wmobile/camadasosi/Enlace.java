package br.edu.ifba.wmobile.camadasosi;

import java.util.ArrayList;
import java.util.List;

public class Enlace implements ICamada{
	private ICamada anterior;
	
	public Enlace(ICamada anterior){
		this.anterior = anterior;
	}
	
	@Override
	public String getNome() {
		return "Enlace";
	}

	@Override
	public int getTamanhoBytes() {
		return anterior.getTamanhoBytes()+215;
	}

	@Override
	public List<String> getProtocolos() {
		List<String> cabecalhos = anterior.getCabecalhos();
		cabecalhos.add("Data Link Header");
		cabecalhos.add("");
		return cabecalhos;
	}

	@Override
	public List<String> getCabecalhos() {
		List<String> protocolos = new ArrayList<String>();
		protocolos.add("PPP");
		protocolos.add("IEEE 802.11");
		protocolos.add("IEEE 802.16");
		protocolos.add("Ethernet");
		protocolos.add("Frame Relay");
		protocolos.add("FDDI");
		protocolos.add("STP");
		return protocolos;
	}

	@Override
	public int getNumero() {
		return 2;
	}

	@Override
	public String getPayload() {
		return "Frames";
	}

	@Override
	public String getResumoFuncao() {
		return "Visa garantir a transmissão precisa dos dados para a Camada Física,"
				+ " corrigindo os erros, através de confirmação de dados, verificação de integridade, etc.";
	}
}