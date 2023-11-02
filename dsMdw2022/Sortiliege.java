package dsMdw2022;

public class Sortiliege extends Carte{
	String nom;
	String explic;
	public Sortiliege(double cout,String nom,String explic) {
		super(cout);
		this.nom=nom;
		this.explic=explic;
		
	}
	@Override
	public String toString() {
		return (super.toString()+this.explic);
	}
}
