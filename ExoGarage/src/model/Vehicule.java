package model;

public class Vehicule {

	public int id;
	protected String model;
	protected String typeEssence;
	protected String plaque;
	
	protected Personne proprietaire;

	
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

	

	public Personne getProprietaire() {
		return proprietaire;
	}


	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}


	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", model=" + model + ", typeEssence=" + typeEssence + ", plaque=" + plaque
				+ ", proprietaire=" + proprietaire + "]";
	}




	
	
	
	
}
