import java.util.Scanner;

public class caljava{

	public static void main(String args[]){
	float a, b;
	char choice;
	Scanner scan = new Scanner(System.in);
	
	do{
		choice = scan.next().charAt(0);
		switch(choice)
		{
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
	}while(choice != 3);
	}

}
