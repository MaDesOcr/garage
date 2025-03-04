package model;

public class Vehicule {

	protected String model;
	protected String typeEssence;
	protected String plaque;
	

	
	public Vehicule(String model, String typeEssence, String plaque) {
		super();
		this.model = model;
		this.typeEssence = typeEssence;
		this.plaque = plaque;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTypeEssence() {
		return typeEssence;
	}
	public void setTypeEssence(String typeEssence) {
		this.typeEssence = typeEssence;
	}
	public String getPlaque() {
		return plaque;
	}
	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}


	@Override
	public String toString() {
		return "Vehicule [model=" + model + ", typeEssence=" + typeEssence + ", plaque=" + plaque + "]";
	}
	
	
	
}
