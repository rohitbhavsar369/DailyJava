import java.util.Scanner;
class AddNum
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Number: ");
	int num1 = sc.nextInt();

	System.out.print("Enter Number: ");
	int num2 = sc.nextInt();

	int result=num1+num2;

	System.out.print("Addition is: "+result);
	
	}
}