package br.com.argentum.modelo;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CandlestickFactoryTest {

	@Test
	public void test() {
		
		LocalDateTime hoje = LocalDateTime.now();

		Negociacao negociacao1 = new Negociacao(50.0, 59, hoje);
		Negociacao negociacao2 = new Negociacao(40.0, 90, hoje);
		Negociacao negociacao3 = new Negociacao(30.0, 78, hoje);
		Negociacao negociacao4 = new Negociacao(44.0, 66, hoje);
		Negociacao negociacao5 = new Negociacao(45.0, 55, hoje);
		Negociacao negociacao6 = new Negociacao(12.0, 44, hoje);

		List<Negociacao> negociacoes = Arrays.<Negociacao> asList(negociacao1, negociacao2, negociacao3, negociacao4, negociacao5,
				negociacao6);

		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candlestick = fabrica.geraCandlestick(negociacoes, hoje);

		Assert.assertEquals(12.0, candlestick.getMinimo(), 0.000001);
		Assert.assertEquals(50.0, candlestick.getMaximo(), 0.000001);
		Assert.assertEquals(50.0, candlestick.getAbertura(), 0.000001);
		Assert.assertEquals(12.0, candlestick.getFechamento(), 0.000001);
		Assert.assertEquals(392.0, candlestick.getVolume(), 0.000001);
		
//		System.out.println("Abertura: " + candlestick.getAbertura());
//		System.out.println("Fechamento: " + candlestick.getFechamento());
//		System.out.println("Máximo: " + candlestick.getMaximo());
//		System.out.println("Mínimo: " + candlestick.getMinimo());
//		System.out.println("Volume: " + candlestick.getVolume());
		
	}

}
