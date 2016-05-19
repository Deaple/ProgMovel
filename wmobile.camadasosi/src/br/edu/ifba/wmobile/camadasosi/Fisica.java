package br.edu.ifba.wmobile.camadasosi;

import java.util.ArrayList;
import java.util.List;

public class Fisica implements ICamada{
	private ICamada anterior;
	
	public Fisica(ICamada anterior){
		this.anterior = anterior;
	}
	@Override
	public String getNome() {
		return "Física";
	}

	@Override
	public int getTamanhoBytes() {
		return anterior.getTamanhoBytes()+215;
	}

	@Override
	public List<String> getProtocolos() {
		List<String> protocolos = new ArrayList<String>();
		protocolos.add("USB");
		protocolos.add("DSL");
		protocolos.add("Bluetooth");
		protocolos.add("3G");
		return protocolos;
	}

	@Override
	public List<String> getCabecalhos() {
		List<String> cabecalhos = anterior.getCabecalhos();
		cabecalhos.add("Physical Header");
		return cabecalhos;
	}

	@Override
	public int getNumero() {
		return 1;
	}
	@Override
	public String getPayload() {
		return "Bits";
	}
	@Override
	public String getResumoFuncao() {
		return "Envio e recepção do fluxo de bits(ou transporte de sinais) através do meio físico,"
				+ " descrevendo as interfaces óticas, mecânicas e funcionais das NICs.";
	}

}
