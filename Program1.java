import java.util.Scanner;
class Program1
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter name: ");
	String name = sc.nextLine();

	System.out.print("Enter Phone No: ");
	long pno = sc.nextLong();

	System.out.print("Enter Height: ");
	double height = sc.nextDouble();

	System.out.print("Enter Age: ");
	int age = sc.nextInt();

	System.out.print("Enter Blood Group: ");
	String bg = sc.next();




	System.out.println("Your name is: "+ name);


	System.out.println("Your Phone No is: "+pno );


	System.out.println("Your Height is: "+height);


	System.out.println("Your Age is: "+age);


	System.out.println("Your Blood Group is: "+bg);

	}
}