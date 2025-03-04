package model;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicule> alVehicules;
	
	public Garage() {
		super();
		alVehicules = new ArrayList<Vehicule>();
	}

	public Garage(ArrayList<Vehicule> alVehicules) {
		super();
		this.alVehicules = alVehicules;
	}

	
	
	public ArrayList<String> getAllModel(){
		ArrayList<String> allModel = new ArrayList<String>();
		for(Vehicule v : alVehicules) allModel.add(v.getModel());
		return allModel;
	}
	
	
	@Override
	public String toString() {
		return "Garage [alVehicules=" + alVehicules + "]";
	}

	public ArrayList<Vehicule> getAlVehicules() {
		return alVehicules;
	}

	public void setAlVehicules(ArrayList<Vehicule> alVehicules) {
		this.alVehicules = alVehicules;
	}

	
	
}
