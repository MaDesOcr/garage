package controller;

import java.util.ArrayList;

import data.Data;
import model.Camion;
import model.Garage;
import model.Moto;
import model.Personne;
import model.Voiture;
import utils.Utilitaires;

public class GestionGarage {

	Data data = new Data();
	
	public void lancement() {
	
		data.initialisationData();
		
		boolean appOn = true;
		
		
		ArrayList<Personne> clients = new ArrayList<Personne>();
			
		System.out.println("Bonjour!");
		
		
		while(appOn) {
			System.out.println("Menu Garage");
			System.out.println("1. créer une voiture dans le garage");
			System.out.println("2. afficher le garage");
			System.out.println("3. supprimer une voiture");
			System.out.println("4. gestion des doublons");
			System.out.println("5. définir le proprietaire d'un véhicule");
			System.out.println("6. exit");
			
			String choixUtilisateur = Utilitaires.saisieString();
			
			switch (choixUtilisateur) {
			case "1": 
				System.out.println("Quel modèle ? ");
				String model = Utilitaires.saisieString();
				System.out.println("Quel type d'essence ? ");
				String essence = Utilitaires.saisieString();
				System.out.println("Est ce une automatique ? ");
				boolean typeBoite = Utilitaires.saisieBoolean();
				System.out.println("Quel plaque ? ");
				String plaque = Utilitaires.saisieString();
				
				Voiture v = new Voiture(model, essence, typeBoite, plaque);
				
				
				data.getGarage().getAlVehicules().add(v);
				break;
			case "2": System.out.println(data.getGarage());
				break;
			case "3": System.out.println("Quel modele voulez vous supprimer : ");
					System.out.println(data.getGarage().getAllModel());
					String modelASupprimer = Utilitaires.saisieString();
					for(int i = 0; i<data.getGarage().getAlVehicules().size(); i++) {
						if(data.getGarage().getAlVehicules().get(i).getModel().equals(modelASupprimer)) {
							System.out.println("je passe par là");
							data.getGarage().getAlVehicules().remove(i);
						}
					}
				break;
			case "4" : System.out.println("Affichage et suppression des doublons");
				for(int i = 0; i<data.getGarage().getAlVehicules().size(); i++) {
					for(int j = 0; j < data.getGarage().getAlVehicules().size(); j++) {
						if(i!=j && data.getGarage().getAlVehicules().get(i).getPlaque()
								.equals(data.getGarage().getAlVehicules().get(j).getPlaque())){
							data.getGarage().getAlVehicules().remove(j);
						}
					}
				}
				
				/*
				 * erreur de  java.util.ConcurrentModificationException
				for(Voiture voiture1 : garage.getAlVehicules()) {
					for(Voiture voiture2 : garage.getAlVehicules()) {
						if(voiture1!=voiture2 && voiture1.getPlaque().equals(voiture2.getPlaque())) {
							garage.getAlVehicules().remove(voiture2);
						}
					}
				}*/
				break;
			case "5" : 
				System.out.println("Gestion des propriétaires");
				//ok on creer une liste de personne connue
				
				//lister les véhicules, en choisir un.
				System.out.println(data.getGarage());
				int idChoisi = Utilitaires.saisieInt();
				
				System.out.println("Donne moi le nom du proprietaire");
				String nomProprietaire = Utilitaires.saisieString();
				System.out.println("Donne moi le prénom du proprietaire");
				String prenomProprietaire = Utilitaires.saisieString();
				
				Personne propritaireTemp = null;
				
				for(Personne perso : clients) {
					if(perso.getNom().equals(nomProprietaire)
							&& perso.getPrenom().equals(prenomProprietaire)) {
						propritaireTemp = perso;
					}
					
				}
				if(propritaireTemp == null) {
					propritaireTemp = new Personne(nomProprietaire, prenomProprietaire);
				}
				
				clients.add(propritaireTemp);	
				data.getGarage().getAlVehicules().get(idChoisi).setProprietaire(propritaireTemp);
				
				break;
			case "6": appOn = false;
				break;				
				
			default:
			}
		}
		
		System.out.println("Au revoir");
		
		
		
	}
	
	
}
