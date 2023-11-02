package dsMdw2022;

public class Test {
		public static void main(String[] args) {
		System.out.println("on change de main");
		//System.out.println();
		Jeu maMain = new Jeu(10);
		Terrain t = new Terrain('B');
		 maMain.ajouter(t);
		 Creature c = new Creature(6, " Gobelin", 4, 6);
		 maMain.ajouter(c);
		 Sortiliege s=new Sortiliege(1, null," Amplificatum" );
		 maMain.ajouter(s);
		// System.out.println("Là, j'ai en stock :");
		 maMain.affiche();
		 maMain.jouer();
		 } 
	}
  