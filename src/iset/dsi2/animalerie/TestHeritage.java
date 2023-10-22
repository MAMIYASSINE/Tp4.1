package iset.dsi2.animalerie;

public class TestHeritage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal T[]=new Animal[3];
		T[0]=new Animal();
		T[1]=new Chat();
		T[2]=new Chien();
		for(int i=0;i<T.length;i++)
		{
			if(T[i] instanceof Animal)
			{
				System.out.println("L'espece de cet animal est inconnue");
			}
			else
			{
				T[i].decrisToi();
				T[i].boire();
				T[i].manger();
				T[i].crier();
			}
			
			
		}

	}

}
