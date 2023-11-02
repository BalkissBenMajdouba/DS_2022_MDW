package dsMdw2022;

public class Jeu {
	Carte[] TabC;
	int nb=0;
	public Jeu(int nb) {
		this.TabC=new Carte[10];
		this.nb=0;
	}
	void ajouter(Carte c) {
		if(nb<10) {
			TabC[nb]=c;
			nb++;
			this.CarteAjoutée(c);
		}
		else 
			System.out.println("Pas d'espace !");
	}
	void jouer() {
		System.out.println("Je joue une carte...");
		System.out.println("La carte jouée est :");
		if(nb>0) {
			TabC[0]=null;
			for(int j=0; j<nb-1;j++) {
				TabC[j] = TabC[j+1];
				TabC[nb-1]=null;
				nb--;
				
			}
			CarteAjoutée(null);
		}
	}
	 void affiche() {
		 System.out.println("Là, j'ai en stock :");
		 
		 for (int i=0;i<nb;i++) {
				System.out.println(TabC[i]);
		 }
		 
		 
		 }
	 void CarteAjoutée(Carte c) {
		 if (c instanceof Terrain) {
			 System.out.println("Un nouveau terrain.");
		 }
		 else if (c instanceof Creature) {
			 System.out.println("Une nouvelle créature.");
		 }
		 else 
			 System.out.println("Un sortilège de plus.");
			 

		
	 }
	
	
}
