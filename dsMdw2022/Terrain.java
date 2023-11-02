package dsMdw2022;

public class Terrain extends Carte{

	char couleur;
	public Terrain(char couleur) {
		super(0);
		if(couleur=='b'||couleur=='B'||couleur=='n'||couleur=='r') {
			this.couleur=couleur;
		}
		
	}
	@Override
	 public String toString() {
        String nomC = "";
        switch (couleur) {
            case 'B':
                nomC = "Blanc";
                break;
            case 'b':
            	nomC = "Bleu";
                break;
            case 'n':
            	nomC = "Noir";
                break;
            case 'r':
            	nomC = "Rouge";
                break;
            case 'v':
            	nomC = "Vert";
                break;
            default:
            	nomC = "Faux";
        }
        return "Un Terrain " + nomC;
    }

	
}
