package Ex1;

public class Pointcol extends Point {
	private String couleur;
	Pointcol()
	{
		super();
		this.couleur="";
	}
	Pointcol(char nom, int ab,int or,String couleur)
	{
		super(nom,ab,or);
		this.couleur=couleur;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	@Override
	void afficher()
	{
		super.afficher();
		System.out.println(couleur);
	}
	
}	
