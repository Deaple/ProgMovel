package br.edu.ifba.wmobile.camadasosi;

import java.util.ArrayList;
import java.util.List;

public class Sessao implements ICamada{
	private ICamada anterior;
	
	public Sessao(ICamada anterior){
		this.anterior = anterior;
	}
	
	@Override
	public String getNome() {
		return "Sessão";
	}

	@Override
	public int getTamanhoBytes() {
		return anterior.getTamanhoBytes()+215;
	}

	@Override
	public List<String> getProtocolos() {
		List<String> protocolos = new ArrayList<String>();
		protocolos.add("NetBIOS");
		protocolos.add("MTU");
		protocolos.add("");
		return protocolos;
	}

	@Override
	public List<String> getCabecalhos() {
		List<String> cabecalhos = anterior.getCabecalhos();
		cabecalhos.add("Session Header");
		return cabecalhos;
	}

	@Override
	public int getNumero() {
		return 5;
	}

	@Override
	public String getPayload() {
		return "Dados";
	}

	@Override
	public String getResumoFuncao() {
		return "Estabele sessão entre processos em execução em diferentes estações, "
				+ "como encerramento e reconexão. Também oferece recursos de segurança, "
				+ "como logs e reconhecimento de nomes";
	}
}