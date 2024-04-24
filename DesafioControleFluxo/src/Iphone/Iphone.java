package Iphone;

import Aplicativos.AparelhoTelefonico.AparelhoTelefonico;
import Aplicativos.NavegadorInternet.NavegadorInternet;
import Aplicativos.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico,ReprodutorMusical,NavegadorInternet{
    
	public void exibirPagina() {
		System.out.println("Exibindo página");
		
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página");
		
	}

	public void tocarMusica() {
		System.out.println("Tocando musica");
		
	}

	public void pausarMusica() {
		System.out.println("Música pausada");
		
	}

	public void selecionarMusica() {
		System.out.println("Música selecionada");
		
	}

	public void ligar() {
		System.out.println("Ligando para o número discado");
		
	}

	public void atender() {
		System.out.println("Atender ligação");
		
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}
	
	

}
