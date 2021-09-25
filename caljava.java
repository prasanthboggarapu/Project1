import java.util.Scanner;

public class calculator{

	public static void main(Strig args[]){
	float a, b;
	char choice;
	Scanner scan = new Scanner(System.in);

	do{
		System.out.println("Enter The a value:" );
		a = scan.nextfloat();
		 System.out.println("Enter The b value:" );
		b = scan.nextfloat();
		Float res;
		System.out.println("Enter 1 or 2 or 3 or 4:");
		choice = scan.next().charAt(0);
		switch(choice){
			case '1':
				res = a + b;
				System.out.println("Result of addition:"+"\t" + res);
				break;
			case '2':
				 res = a - b;
                                System.out.println("Result of Subtraction:"+"\t" + res);
				break;
			case '3':
				res = a * b'
                                System.out.println("Result of Subtraction:"+"\t" + res);
			case '4':
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;


		}

		System.out.println("\n---------------------------------\n");
		}while(choice != 2);
	}

}
