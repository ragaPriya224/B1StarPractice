package practice.polymorphism;

/**
 * to demonstrate the concept of method overloading 
 * 
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.toAdd();
	}

	public  void toAdd() {
		System.out.println(2+5);
		System.out.println("first method called");
	}
	//*

	public void toAdd(int num) {
		// method overloading - compile time polymorphism
		System.out.println(num+10);
		System.out.println("second method called");
	}

}
