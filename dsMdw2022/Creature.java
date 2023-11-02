package dsMdw2022;

public class Creature extends Carte{
	
	String nom;
	int nbPtDegats;
	int nbPtVie;
	public Creature(double cout,String nom,int nbPtDegats,int nbPtVie) {
		super(cout);
		this.nom=nom;
		this.nbPtDegats=nbPtDegats;
		this.nbPtVie=nbPtVie;
		
	}
	@Override
	public String toString() {
		return (super.toString()+ " "+this.nom+" "+this.nbPtDegats+"/"+this.nbPtVie);
	}

}
