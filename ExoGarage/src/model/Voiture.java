	package model;
	
	
	public class Voiture extends Vehicule{
	
		
		private boolean boiteAuto;
		
		
		
		public Voiture(String model, String typeEssence, boolean boiteAuto, String plaque) {
			super(model, typeEssence, plaque);
			this.boiteAuto = boiteAuto;
		}



		@Override
		public String toString() {
			return "Voiture [boiteAuto=" + boiteAuto + ", id=" + id + ", model=" + model + ", typeEssence="
					+ typeEssence + ", plaque=" + plaque + ", proprietaire=" + proprietaire + "]";
		}

		

		
		
	}
