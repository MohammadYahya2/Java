package Mammal;

public class Bat extends Mammal {

	public Bat(int energy) {
		super(energy);

	}
	public void fly() {
		energy-=50;
		System.out.println(" the bat in air "+energy);
	}
	public void eatHumans() {
		energy+=25;
		System.out.println(" the bat so happy "+energy);
	}
	public void attackTown() {
		energy-=100;
		System.out.println(" the bat is attacking "+energy);
	}

}
