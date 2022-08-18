package practice.HybridDemo;

public class BmwVersion2  extends Bmw{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BmwVersion2 car = new BmwVersion2();
//		car.printWelcome();
		car.m1();
	}
	//overriding something
	public void printWelcome() {
		// method overriding  - run  time polymorphism
		System.out.println(" hey buddy  ");
	}
	public void m1() {
		System.out.println("bye team");
	}
}
