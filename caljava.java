public class caljava{

	public static void main(Strig args[]){
	float a, b;
	char choice;
	Scanner scan = new Scanner(System.in);

	do{
		System.out.println("Enter the value of a:" );
		a = scan.nextfloat();
		System.out.println("Enter the value of b:" );
		b = scan.nextfloat();
		Float res;
		System.out.printls("Enter 1 or 2 or 3");
		choice = scan.next().charAt(0);
		switch(choice){
			case '1':
				res = a + b;
				System.out.println("Result:"+"\t" + res);
				break;
			case '2':
				res = a-b;
				System.out.println("Result:" + "\t" + res);
			case '3':
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;


		}

		System.out.println("\n---------------------------------\n");
		}while(choice != 2);
	}

}
