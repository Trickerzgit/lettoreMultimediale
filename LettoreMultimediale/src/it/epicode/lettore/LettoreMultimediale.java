package it.epicode.lettore;

import java.util.Scanner;

public class LettoreMultimediale {
	
	Scanner input = new Scanner(System.in);
	private ElementoMultimediale[] elements = new ElementoMultimediale[5];
	private int multimediaCounter;
	
	public boolean inserisciElemento(ElementoMultimediale file) {
		if (multimediaCounter >= 5) {
			System.out.println("Il lettore è già pieno.");
			return false;
		}
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == null) {
				elements[i] = file;
				return true;
			}
				
		}
		return false;
		
	}
	public void mostraArray() {
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
			// Richiama il .toString dell'oggetto in maniera automatica.
		}
	}
	public void riproduci() {
		int numero;
		do {	
			System.out.println("Scegli il file da riprodurre inserendo un numero da 1 a 5");
		
			numero = input.nextInt();
			switch(numero) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				if (elements[numero-1] != null) {
					elements[numero-1].esegui();
					
				}
				else {
					System.out.println("Nello slot" + " " + numero + " " + "non è presente nessun elemento");
				}
				break; 
			case 0:
				System.out.println("Termine programma");
				break;
			default:
				System.out.println("Inserisci un numero da 0 a 5");
				break;
			}
		}
		while(numero != 0);
	
		//		Con instanceof mi chiedo se sia un video o un audio (Ovvero del tipo a destra).
		//		if(elements[0] instanceof ElementoMultimedialeRiproducibile) {
		//			Con le parentesti tonde cast forzato per dire che in elements[0] ci sta un elemento riproducibile.
		//			ElementoMultimedialeRiproducibile e = (ElementoMultimedialeRiproducibile) elements[0];
		//			e.play();
		//		}
		//		else if (elements[0] instanceof Immagine) {
		//			Immagine i = (Immagine) elements[0];
		//			i.show();
		//		}
				
	}

}
