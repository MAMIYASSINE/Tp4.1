package Ex1;

public class Point {
	protected int abscisse;
	protected int ordonne;
	protected char nom;
	Point(char nom,int abscisse,int ordonne)
	{
		this.nom=nom;
		this.abscisse=abscisse;
		this.ordonne=ordonne;
	}
	Point()
	{
		nom='O';
	}
	Point( Point p)
	{
		abscisse=p.abscisse;
		ordonne=p.ordonne;
		nom=p.nom;
	}
	void deplacer(int a,int b) {
		abscisse=abscisse+a;
		ordonne=ordonne+b;
	}
	void reset()
	{
		abscisse=0;
		ordonne=0;
	}
	@Override
	public String toString()
	{
		return this.nom+"("+this.abscisse+","+this.ordonne+")";
	
	}
	void afficher()
	{
		System.out.println(this);
	}
	boolean coincide_V1(Point p)
	{
		
			if(p.abscisse==this.abscisse)
			{
				if(p.ordonne==this.ordonne)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		
	}
	static boolean coincide_V2(Point a,Point b)
	{
		return ((a.abscisse==b.abscisse)&&(a.ordonne==b.ordonne));	
	}
}
	
