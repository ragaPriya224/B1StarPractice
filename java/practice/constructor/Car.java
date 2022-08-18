package practice.constructor;

public class Car {
	
	int  tyres;
	String colour;

	Car(){
		this.colour = "black";
		this.tyres= 4;
	}
	Car(String colour){
		this.colour = colour;
	}
	
	public static void main(String[] args) {
		Car benz = new Car();
		System.out.println(benz.tyres); //o
		System.out.println(benz.colour); //null
		
		Car bmw = new Car(" blue ");
		System.out.println(bmw.tyres); //o
		System.out.println(bmw.colour); //null

	}
	
}
