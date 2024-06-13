package org.lessons.java.shop;

import java.util.Random;
import java.text.DecimalFormat;

public class Prodotto {

	static int codice;
	static String nome;
	String descrizione;
	static float prezzo;
	float iva;
	String nomeEsteso;
	
	String dettagliProdotto() {
		return "Codice: " + codice + "," + " " +"Nome: " + nome + "," + " " + "Descrizione: " + descrizione + "," + " " + "Prezzo: " + "€"+ prezzo + ", " + " " + "Prezzo con Iva del 5% = €" + iva + "," + " " + "Nome Completo: " + nomeEsteso;
	}
	
	public static void main(String[] args) {
		
		Prodotto product = new Prodotto();
		
		//nome + descrizione
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
		
		//calcola iva del prodotto
		float calcolaIva = (prezzo * 5) / 100;
		product.iva = prezzo + calcolaIva;
		
		//nome completo
		product.nomeEsteso = codice + nome;
		
		System.out.println(product.dettagliProdotto());

	}

}
