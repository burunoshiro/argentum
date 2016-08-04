package br.com.argentum.testes;

import java.util.Random;

public class TesteRandom {

	public static void main(String[] args) {
		
		Random random = new Random(30);
		
		System.out.println("" + random.nextLong());
		
	}
	
}
