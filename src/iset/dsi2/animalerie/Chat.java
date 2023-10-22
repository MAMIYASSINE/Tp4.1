package iset.dsi2.animalerie;

public class Chat extends Animal {
	private boolean sauvage;

	public boolean isSauvage() {
		return sauvage;
	}

	public void setSauvage(boolean sauvage) {
		this.sauvage = sauvage;
	}
	Chat()
	{
		
	}
	Chat(String couleur,int poids,boolean sauvage)
	{
		super(couleur,poids);
		this.sauvage=sauvage;
	}
}
