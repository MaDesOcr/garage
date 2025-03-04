package model;

public class Camion extends Vehicule {

	private int poidTransportable;
		
	public Camion(String model, String typeEssence, String plaque, int poidTransportable) {
		super(model, typeEssence, plaque);
		this.poidTransportable = poidTransportable;
	}


	public int getPoidTransportable() {
		return poidTransportable;
	}


	public void setPoidTransportable(int poidTransportable) {
		this.poidTransportable = poidTransportable;
	}


	@Override
	public String toString() {
		return "Camion [poidTransportable=" + poidTransportable + ", model=" + model + ", typeEssence=" + typeEssence
				+ ", plaque=" + plaque + "]";
	}

	
	
}
