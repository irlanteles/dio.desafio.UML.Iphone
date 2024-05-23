package Iphone;

import RecursosDoIphone.Camera;
import RecursosDoIphone.Email;
import RecursosDoIphone.NavegadorSafari;
import RecursosDoIphone.RecursosDoIphone;
import RecursosDoIphone.Telefone;


public class Iphone {
	
	public static void main(String[] args) {
		
		
		RecursosDoIphone iphone = new RecursosDoIphone();
		Telefone telefone = iphone;
		Camera camera = iphone;
		Email email= iphone;
		
		telefone.atenderLigacao();
		telefone.desligarLigacao();
		camera.tirarFoto();
		camera.listarFoto();
		email.escreverEmail();
		email.enviarEmail();
		NavegadorSafari navegador = iphone;
		navegador.acessarPaginaWeb("google.com");
		
		
		
		
	}

}
