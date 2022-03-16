package superior.slide;

public class Programa {

	public static void main(String[] args) {
		
		int meuArray[] = new int[100];
		
		for (int i = 0; i < meuArray.length; i++) {
			meuArray[i] = (int)(Math.random()*100);
			if(meuArray[i]%2 == 0)
				System.out.println("O elemento na posição "+(i+1)+" tem o valor "+meuArray[i]+" é par");

		}
	}
}
