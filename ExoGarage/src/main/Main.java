package main;

import model.Garage;
import model.Moto;
import model.Voiture;
import utils.Utilitaires;

public class Main {
	
	/*
	 * 
	 *	Créer un nouveau projet
		Créer une classe Voiture, avec model, typeEssence, typeBoiteDeVitesse
		Créer une classe Garage, qui va contenir une liste de voiture
		Créer une classe contenant une méthode main qui ne fait rien pour le moment
	 */
	
	
	public static void main(String[] args) {

		boolean appOn = true;
		
		Garage garage = new Garage();
		
		Voiture v1 = new Voiture("Citreon", "ssplomb", false, "AA-111-AA");
		Voiture v2 = new Voiture("Citreon", "ssplomb", false, "BB-111-BB");
		Voiture v3 = new Voiture("Citreon", "ssplomb", false, "BB-111-AA");
		Voiture v4 = new Voiture("Citreon", "ssplomb", false, "BB-111-AA");
		Voiture v5 = new Voiture("Citreon", "ssplomb", false, "AA-111-AA");
		// ajouter des voitures au garage
		
		garage.getAlVehicules().add(v1);
		garage.getAlVehicules().add(v2);
		garage.getAlVehicules().add(v3);
		garage.getAlVehicules().add(v4);
		garage.getAlVehicules().add(v5);
		
		
		Moto m1 = new Moto("Harley", "ssplomb", "MM-111-AA");
		
		garage.getAlVehicules().add(m1);
		
		System.out.println("Bonjour!");
		
		
		while(appOn) {
			System.out.println("Menu Garage");
			System.out.println("1. créer une voiture dans le garage");
			System.out.println("2. afficher le garage");
			System.out.println("3. supprimer une voiture");
			System.out.println("4. gestion des doublons");
			//ajout d'un case pour affichage et suppression des voitures doublon qui ont la même plaque
			System.out.println("5. exit");
			
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
				
				
				garage.getAlVehicules().add(v);
				break;
			case "2": System.out.println(garage);
				break;
			case "3": System.out.println("Quel modele voulez vous supprimer : ");
					System.out.println(garage.getAllModel());
					String modelASupprimer = Utilitaires.saisieString();
					for(int i = 0; i<garage.getAlVehicules().size(); i++) {
						if(garage.getAlVehicules().get(i).getModel().equals(modelASupprimer)) {
							System.out.println("je passe par là");
							garage.getAlVehicules().remove(i);
						}
					}
				break;
			case "4" : System.out.println("Affichage et suppression des doublons");
				for(int i = 0; i<garage.getAlVehicules().size(); i++) {
					for(int j = 0; j < garage.getAlVehicules().size(); j++) {
						if(i!=j && garage.getAlVehicules().get(i).getPlaque()
								.equals(garage.getAlVehicules().get(j).getPlaque())){
							garage.getAlVehicules().remove(j);
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
			case "5": appOn = false;
				break;				
				
			default:
			}
		}
		
		System.out.println("Au revoir");

		//création d'un menu donnant la choix de :
		//1.créer une voiture dans le garage
		//2.afficher le garage
		//3.exit
		
	
		//etapes :
		//utilisation d'une boucle while qui reste à true tant que exit n'est pas fourni
		//affichage du menu
		//demande à l'utilisateur d'une saisie
		//mise en place d'un switch basé sur la saisie utilisateur pour les déclencher les actions
		//dans un premier temps, uniquement mettre le titre de l'action dans les cases
		
		
		
		
		
/*		System.out.println("entrez une info : ");
		String s = Utilitaires.saisieString();
		System.out.println(s);
	*/	
		
	}

}
