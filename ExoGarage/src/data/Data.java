package data;

import model.Camion;
import model.Garage;
import model.Moto;
import model.Voiture;

public class Data {

	private Garage garage = new Garage();

	
	public void initialisationData() {
		Voiture v1 = new Voiture("Citreon", "ssplomb", false, "AA-111-AA");
		Voiture v2 = new Voiture("Citreon", "ssplomb", false, "BB-111-BB");
		Voiture v3 = new Voiture("Citreon", "ssplomb", false, "BB-111-AA");
		Voiture v4 = new Voiture("Citreon", "ssplomb", false, "BB-111-AA");
		Voiture v5 = new Voiture("Citreon", "ssplomb", false, "AA-111-AA");
		
		garage.getAlVehicules().add(v1);
		v1.id = garage.getAlVehicules().indexOf(v1);
		
		garage.getAlVehicules().add(v2);
		v2.id = garage.getAlVehicules().indexOf(v2);

		garage.getAlVehicules().add(v3);
		v3.id = garage.getAlVehicules().indexOf(v3);

		garage.getAlVehicules().add(v4);
		v4.id = garage.getAlVehicules().indexOf(v4);
		
		garage.getAlVehicules().add(v5);
		v5.id = garage.getAlVehicules().indexOf(v5);
		
		
		Moto m1 = new Moto("Harley", "ssplomb", "MM-111-AA");
		
		garage.getAlVehicules().add(m1);
		
		
		Camion c1 = new Camion("Volvo", "diesel", "CC-111-AA", 15);
		
		garage.getAlVehicules().add(c1);
	}
	
	
	public Garage getGarage() {
		return garage;
	}

	public void setGarage(Garage garage) {
		this.garage = garage;
	}
	
	
	
	
	
	
}
