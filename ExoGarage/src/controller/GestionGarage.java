package controller;

import data.Data;
import data.Texte;
import model.Personne;
import model.Voiture;
import utils.Utilitaires;

public class GestionGarage {

	Data data = new Data();
	
	public void lancement() {
	
		data.initialisationData();
		
		boolean appOn = true;
				
		System.out.println("Bonjour!");
		
		while(appOn) {
			
			System.out.println(Texte.MENUPRINCIPAL);
			String choixUtilisateur = Utilitaires.saisieString();
			
			switch (choixUtilisateur) {
			case "1": 
				creationVoiture();		
				break;
			case "2": 
				System.out.println(data.getGarage());
				break;
			case "3": 
				suppressionVoiture();				
				break;
			case "4" :
				suppressionDoublon();
				break;
			case "5" : 
				gestionProprietaire();
				break;
			case "6": 
				appOn = false;
				break;
			default:
				System.out.println("Mauvais choix, recommencez");
			}
		}
		
		System.out.println("Au revoir");
		
	}

	private void gestionProprietaire() {
		System.out.println("Gestion des propriétaires");
		
		System.out.println(data.getGarage());
		int idChoisi = Utilitaires.saisieInt();
		
		System.out.println("Donne moi le nom du proprietaire");
		String nomProprietaire = Utilitaires.saisieString();
		System.out.println("Donne moi le prénom du proprietaire");
		String prenomProprietaire = Utilitaires.saisieString();
		
		Personne propritaireTemp = null;
		
		for(Personne perso : data.getClients()) {
			if(perso.getNom().equals(nomProprietaire)
					&& perso.getPrenom().equals(prenomProprietaire)) {
				propritaireTemp = perso;
			}
			
		}
		if(propritaireTemp == null) {
			propritaireTemp = new Personne(nomProprietaire, prenomProprietaire);
		}
		
		data.getClients().add(propritaireTemp);	
		data.getGarage().getAlVehicules().get(idChoisi).setProprietaire(propritaireTemp);
		
		
	}

	private void suppressionDoublon() {
		System.out.println("Affichage et suppression des doublons");
		for(int i = 0; i<data.getGarage().getAlVehicules().size(); i++) {
			for(int j = 0; j < data.getGarage().getAlVehicules().size(); j++) {
				if(i!=j && data.getGarage().getAlVehicules().get(i).getPlaque()
						.equals(data.getGarage().getAlVehicules().get(j).getPlaque())){
					data.getGarage().getAlVehicules().remove(j);
				}
			}
		}

		
	}

	private void suppressionVoiture() {
		System.out.println("Quel modele voulez vous supprimer : ");
		System.out.println(data.getGarage().getAllModel());
		String modelASupprimer = Utilitaires.saisieString();
		for(int i = 0; i<data.getGarage().getAlVehicules().size(); i++) {
			if(data.getGarage().getAlVehicules().get(i).getModel().equals(modelASupprimer)) {
				System.out.println("je passe par là");
				data.getGarage().getAlVehicules().remove(i);
			}
		}
		
	}

	private void creationVoiture() {
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
		
	}
	
}




/*
 * erreur de  java.util.ConcurrentModificationException
for(Voiture voiture1 : garage.getAlVehicules()) {
	for(Voiture voiture2 : garage.getAlVehicules()) {
		if(voiture1!=voiture2 && voiture1.getPlaque().equals(voiture2.getPlaque())) {
			garage.getAlVehicules().remove(voiture2);
		}
	}*/