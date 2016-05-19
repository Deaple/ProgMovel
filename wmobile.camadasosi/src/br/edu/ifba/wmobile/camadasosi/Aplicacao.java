package br.edu.ifba.wmobile.camadasosi;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao implements ICamada{
	
	@Override
	public String getNome() {
		return "Aplicação";
	}

	@Override
	public int getTamanhoBytes() {
		return 215;
	}

	@Override
	public List<String> getProtocolos() {
		List<String> protocolos = new ArrayList<String>();
		protocolos.add("HTTP");
		protocolos.add("SMTP");
		protocolos.add("FTP");
		protocolos.add("DNS");
		protocolos.add("SSH");
		protocolos.add("Telnet");
		protocolos.add("DHCP");
		return protocolos;
	}

	@Override
	public List<String> getCabecalhos() {
		List<String> cabecalhos = new ArrayList<String>();
		cabecalhos.add("Application Header");
		return cabecalhos;
	}

	@Override
	public int getNumero() {
		return 7;
	}

	@Override
	public String getPayload() {
		return "Dados";
	}

	@Override
	public String getResumoFuncao() {
		return "Possibilita que aplicativos acessem recursos de rede, "
				+ "provendo serviços de comunicação entre as aplicações.";
	}

}
