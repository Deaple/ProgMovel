package br.edu.ifba.wmobile.camadasosi.app;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

//import org.primefaces.mobile.component.field.Field;

import br.edu.ifba.wmobile.camadasosi.*;

@ManagedBean(name="camadas")
public class Camadas {
	private Usuario usuario = new Usuario();
	
	private static List<ICamada> camadas = new ArrayList<ICamada>();
	
	static {
		ICamada camadaOSI = new Aplicacao();
		camadas.add(camadaOSI);
		camadaOSI = new Apresentacao(camadaOSI);
		camadas.add(camadaOSI);
		camadaOSI = new Sessao(camadaOSI);
		camadas.add(camadaOSI);
		camadaOSI = new Transporte(camadaOSI);
		camadas.add(camadaOSI);
		camadaOSI = new Rede(camadaOSI);
		camadas.add(camadaOSI);
		camadaOSI = new Enlace(camadaOSI);
		camadas.add(camadaOSI);
		camadaOSI = new Fisica(camadaOSI);
		camadas.add(camadaOSI);
	}
	public void setEmailUsuario(String email){
		if(email!=null){
			usuario.setEmail(email);
			System.out.println("Usuário: "+usuario.getEmail()+" acessou a aplicação.");
		}
	}
	
	public String getTitulo(){
		return "Ensino de Camadas OSI";
	}
	
	public ICamada getCamada(int numero){
		return camadas.get(numero-1);
	}
	
	public String getNome(){
		return "Camadas OSI";
	}
	
	public int getTotalCamadas(){
		return camadas.size();
	}
}
