package it.epicode.lettore;

public class Audio extends ElementoMultimedialeRiproducibile {

	public Audio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);
		
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Audio titolo:");
		sb.append(titolo)
		.append(" Durata: ").append(durata)
		.append(" Volume: ").append(volume);
		return sb.toString();
	}
	@Override
	public void alzaVolume() {
		super.alzaVolume();
	}
	@Override
	public void abbassaVolume() {
		super.abbassaVolume();
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
		System.out.println(p);
	}
	

}
