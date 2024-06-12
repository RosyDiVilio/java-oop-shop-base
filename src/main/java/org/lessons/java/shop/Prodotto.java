package org.lessons.java.shop;

import java.util.Random;
import java.text.DecimalFormat;

public class Prodotto {

	int codice;
	String nome;
	String descrizione;
	static float prezzo;
	float iva;
	
	String dettagliProdotto() {
		return codice + "," + " " + nome + "," + " " + descrizione + "," + " " + "€" + prezzo + "," + " " + "prezzo con iva del 5% = €" + iva;
	}
	
	public static void main(String[] args) {
		
		Prodotto product = new Prodotto();
		
		product.nome = "armadio";
		product.descrizione = "oggetto molto utile";
		
		//creazione codice prodotto random
	    Random random = new Random();
	    int numero = random.nextInt(500);
		product.codice = numero;
		
		//creazione prezzo prodotto random
		Random randomDue = new Random();
		float numeroDue = randomDue.nextFloat(1000);
		product.prezzo = numeroDue;
		
		float calcolaIva = (prezzo * 5) / 100;
		product.iva = prezzo + calcolaIva;
		
		System.out.println(product.dettagliProdotto());

	}

}
