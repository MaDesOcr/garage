package model;

public class Moto extends Vehicule{

	public Moto(String model, String typeEssence, String plaque) {
		super(model, typeEssence, plaque);
	}

	@Override
	public String toString() {
		return "Moto [model=" + model + ", typeEssence=" + typeEssence + ", plaque=" + plaque + "]";
	}

	
	
}
