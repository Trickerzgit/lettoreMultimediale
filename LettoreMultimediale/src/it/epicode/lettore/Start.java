package it.epicode.lettore;

import java.util.Scanner;

public class Start {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		LettoreMultimediale lettore = new LettoreMultimediale();
		
//		Audio a1 = new Audio("Ciao", 4, 3);
//		a1.abbassaVolume();
//		a1.play();
		
//		Video v1 = new Video("Ballo", 5, 4, 5);
//		v1.alzaVolume();
//		v1.aumentaLuminosita();
//		v1.play();
		
//		Immagine i1 = new Immagine("Quadro", 9);
//	i1.aumentaLuminosita();
//		i1.show();

//		boolean inserito = lettore.inserisciElemento(a1);
//		if (inserito) {
//			System.out.println("Elemento di tipo audio aggiunto.");
//		}
//		inserito = lettore.inserisciElemento(v1);
//		if (inserito) {
//			System.out.println("Elemento di tipo video aggiunto.");
//		}
//		inserito = lettore.inserisciElemento(i1);
//		if (inserito) {
//			System.out.println("Elemento di tipo immagine aggiunto");
//		}
		for (int i = 0; i < 2; i++) {
			ElementoMultimediale x = richiediNuovoElemento();
			lettore.inserisciElemento(x);
		}
		lettore.mostraArray();
		lettore.riproduci();
		
 
	}
	
	public static ElementoMultimediale richiediNuovoElemento() {
		ElementoMultimediale elemento;
		while (true) {
			System.out.println("Inserisci il tipo di elemento: v: video, i: immagine, a: audio");
			String answer = input.nextLine();
	
			switch (answer) {
			case "v":
				System.out.println("Inserisci il titolo del video:");
				String titolo = input.nextLine();
				System.out.println("Inserisci la durata del video:");
				int durata = input.nextInt();
				System.out.println("Inserisci il volume del video:");
				int volume = input.nextInt();
				System.out.println("Inserisci la luminosità del video:");
				int luminosita = input.nextInt();
				input.nextLine();
				elemento = new Video(titolo, durata, volume, luminosita);
				return elemento;
			case "i":
				System.out.println("Inserisci il titolo dell'immagine:");
				String titoloImg = input.nextLine();
				System.out.println("Inserisci la luminosita dell'immagine:");
				int luminositaImg= input.nextInt();
				input.nextLine();
				elemento = new Immagine(titoloImg, luminositaImg);
				return elemento;
			case "a":
				System.out.println("Inserisci il titolo dell'audio:");
				String titoloAud = input.nextLine();
				System.out.println("Inserisci la durata dell'audio:");
				int durataAud = input.nextInt();
				System.out.println("Inserisci il volume dell'audio:");
				int volumeAud = input.nextInt();
				input.nextLine();
				elemento = new Audio(titoloAud, durataAud, volumeAud);
				return elemento;
			default:
				System.out.println("Inserisci un valore tra v, i ed a");
			}
		
			
		}
		
	}

}
