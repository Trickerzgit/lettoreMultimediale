package it.epicode.lettore;

public class Video extends ElementoMultimedialeRiproducibile implements  ElementoConLuminositaRegolabile {
	
	protected int luminosita;
	
	public Video (String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata, volume);
		this.luminosita = luminosita;
	}
	
	//Ritorna l'oggetto sulla quale il metodo è chiamato.
	//E' meglio usarlo invece che concatenare con il +.
	//La funzione toString(Object) e viene chiamata ogni volta che mando in output la reference di un oggetto.
	//Originariamente stampa il nome della classe seguito dall'indirizzo dell'oggetto.
	//Altrimenti facciamo l'override della funzione toString e lo personalizziamo noi.
	//Il metodo println stamperà la stringa inserita nel metodo toString.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Video titolo:");
		sb.append(titolo)
		.append(" Durata: ").append(durata)
		.append(" Volume: ").append(volume)
		.append(" luminosita: ").append(luminosita);
		return sb.toString();
		
	}
	

	@Override
	public void abbassaVolume() {
		super.abbassaVolume();
	}
	
	@Override
	public void alzaVolume() {
		super.alzaVolume();
	}

	@Override
	public void aumentaLuminosita() {
		if (luminosita < LUMINOSITA_MASSIMA) {
			++luminosita;
		}
		else {
			System.out.println("La luminosità è già al massimo.");
		}
	}

	@Override
	public void diminuisciLuminosita() {
		if (luminosita > 0) {
			luminosita--;
		}
		else {
			System.out.println("La luminosità è già al minimo");
		}
		
	}
	@Override
	public void play() {
		
		String p = titolo + " ";
		for (int i = 0; i < durata; i++) {
			p += titolo;
		}
		for (int i = 0; i < volume; i++) {
			p += "!";
		}
		for (int i = 0; i < luminosita; i++) {
			p += "*";
		}
		System.out.println(p);
	}

}
