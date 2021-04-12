package it.epicode.lettore;

public class Immagine extends ElementoMultimediale implements ElementoConLuminositaRegolabile {
	
	protected int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Immagine titolo:");
		sb.append(titolo)
		.append(" luminosita: ").append(luminosita);
		return sb.toString();
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
	
	public void show() {
		
		String s = titolo + " ";
		for (int i = 0; i < luminosita; i++) {
			s += "*";
		}
		System.out.println(s);
		
	}
	
	public void esegui() {
		show();
	}

}
