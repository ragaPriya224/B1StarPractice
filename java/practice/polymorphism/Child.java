package practice.polymorphism;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.wealth();
		child.marry();
	}
	
	/**
	 * method overriding 
	 */
	@Override
	public   void marry() {
		System.out.println("y");
	}

}
