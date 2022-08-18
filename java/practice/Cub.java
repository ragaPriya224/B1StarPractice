package practice;

public class Cub extends  Lion{ // single level inheritance
	//Lion -> Parent class
	//Cub -> child class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cub c = new Cub();
		c.sing();
		System.out.println(c.legs);
		c.printSound();
	}

	public void sing() {
		System.out.println(" cub is singing ");
	}

}
