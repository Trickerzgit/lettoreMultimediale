package it.epicode.lettore;

public abstract class ElementoMultimedialeRiproducibile extends ElementoMultimediale {
	
	private int durata;
	private int volume;
	private final int maxVolume = 10;
		
	public ElementoMultimedialeRiproducibile(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	
	}
	
	public void play() {
		
	}
	
	public void abbassaVolume(int volume) {
		if (volume <= 0) {
			return;
		}
		else {
			volume--;
		}
		
	}
	
	public void alzaVolume (int volume) {
		if (volume < maxVolume) {
			++volume;
		}
		else {
			return;
		}
	}
	
}
