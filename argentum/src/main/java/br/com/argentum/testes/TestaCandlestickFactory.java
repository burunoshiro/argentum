package br.com.argentum.testes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.argentum.modelo.Candlestick;
import br.com.argentum.modelo.CandlestickFactory;
import br.com.argentum.modelo.Negociacao;

public class TestaCandlestickFactory {
	
	public static void main(String[] args) {
		
		List<Negociacao> negociacoes = new ArrayList<Negociacao>();
		
		LocalDateTime hoje = LocalDateTime.now();
		
		Negociacao negociacao1 = new Negociacao(50.0, 59, hoje);
		Negociacao negociacao2 = new Negociacao(40.0, 90, hoje);
		Negociacao negociacao3 = new Negociacao(30.0, 78, hoje);
		Negociacao negociacao4 = new Negociacao(44.0, 66, hoje);
		Negociacao negociacao5 = new Negociacao(45.0, 55, hoje);
		Negociacao negociacao6 = new Negociacao(12.0, 44, hoje);
		
		negociacoes = Arrays.<Negociacao>asList(negociacao1, negociacao2, negociacao3, negociacao4, negociacao5, negociacao6);
		
		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candlestick = fabrica.geraCandlestick(negociacoes, hoje);
		
		System.out.println("Abertura: " + candlestick.getAbertura());
		System.out.println("Fechamento: " + candlestick.getFechamento());
		System.out.println("Máximo: " + candlestick.getMaximo());
		System.out.println("Mínimo: " + candlestick.getMinimo());
		System.out.println("Volume: " + candlestick.getVolume());
				
	}
	
}
