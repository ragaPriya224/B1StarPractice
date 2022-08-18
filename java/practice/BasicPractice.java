package practice;

public class BasicPractice {

	public static void main(String[] args) {
		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			//		    break;
		case 5:
			System.out.println("Friday");
			//		    break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;




		}

		//		for(int i = 0; i<10; i++){    
		//			System.out.println(i);  
		//		}  
		//		
		//		int i = 0;
		//		while (i<5) {
		//			System.out.println("hello");
		//			i++;
		//		}

		//		do {
		//		System.out.println("it's DO WHILE LOOP");
		//		i++;
		//		}
		//		while (i<5);

		for(int i = 0; i<5; i++) {
			if(i == 3) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i = 0; i<5; i++) {
			if(i == 3) {
				continue; //skipping that particular iteration 
			}
			System.out.println(i + "hello");
		}

	}

}
