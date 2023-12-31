package Mammal;
public class Gorilla extends Mammal {

	public Gorilla(int energy) {
		super(energy);
	
	}
public void throwSomething() {
	energy-=5;
	System.out.println(" that the gorilla has thrown  banan "+energy);
}
public void eatBananas() {
	energy+=10;
	System.out.println("the Gorilla is so happy "+energy);
	
}
public void climb() {
	energy-=10;
	System.out.println("the Gorilla is so bad "+energy);
	
	}
}
