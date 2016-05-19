package br.edu.ifba.wmobile.camadasosi;

import java.util.List;

public interface ICamada {
	public String getNome();
	
	public int getTamanhoBytes();
	
	public List<String> getProtocolos();
	
	public List<String> getCabecalhos();
	
	public String getPayload();
	
	public int getNumero();
	
	public String getResumoFuncao();
}
