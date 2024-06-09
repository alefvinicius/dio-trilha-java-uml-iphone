package com.dio.iphone;

import com.dio.interfaces.AparelhoTelefonico;
import com.dio.interfaces.NavegadorInternet;
import com.dio.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	
	
	public static void main(String[] args) {
		Iphone iphone11 = new Iphone();
		
		iphone11.ligar("32412020");
		iphone11.atender();
		iphone11.iniciarCorreioVoz();
		
		iphone11.exibirPagina("https://www.google.com.br"); 
		iphone11.adicionarNovaAba();       
		iphone11.atualizarPagina();        
		
		iphone11.tocar();                        
		iphone11.pausar();                       
		iphone11.selecionarMusica("Faixa 5");
	}
	
	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando música no iPhone");
		
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando música no iPhone");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Selecionando música no iPhone");
		
		
	}

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("Exibindo página no iPhone");
		
		
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando Aba no iPhone");
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando página no iPhone");
		
		
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Discando no iPhone");
		
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo ligação no iPhone");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando Correio de Voz no iPhone");
		
		
	}

}
