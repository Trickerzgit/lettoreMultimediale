package it.epicode.lettore;

public abstract class ElementoMultimedialeRiproducibile extends ElementoMultimediale {
	
	protected int durata;
	protected int volume;
	private final int maxVolume = 10;
		
	public ElementoMultimedialeRiproducibile(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	
	}
	
	public abstract void play();
	
	public void esegui() {
		play();
	}
	
	public void abbassaVolume() {
		if (volume > 0) {
			volume--;
		}
		else {
			System.out.println("Il volume è già al minimo.");
		}
		
	}
	
	public void alzaVolume () {
		if (volume < maxVolume) {
			volume++;
		}
		else {
			System.out.println("Il volume è già al massimo.");
		}
	}
	
}
