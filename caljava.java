import java.util.Scanner;

public class  caljava{

	public static void main(String args[]){
	float a, b;
	char choice;
	Scanner scan = new Scanner(System.in);
	
	do{
		choice = scan.next().charAt(0);
		switch(choice)
		{
			case '1':
				System.out.println("Enter The two values:" );
                		a = scan.nextFloat();
                		b = scan.nextFloat();
				Float res = a + b;
				System.out.println("Result:"+"\t" + res);
				break;
			case '2':
				System.exit(0);
			default:
				System.out.println("Invalid choice");
				break;


		}

		System.out.println("\n---------------------------------\n");
	}while(choice != 2);
	}

}
