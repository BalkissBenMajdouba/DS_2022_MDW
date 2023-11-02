package dsMdw2022;

public class Carte {
	//char couleur;
	double cout;
	public Carte(double cout) {
		this.cout=cout;
	}
	
	@Override 
	public String toString()
	{
		return (getClass().getSimpleName());
	}
	

}
