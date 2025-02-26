import java.util.Scanner;
class DivBy3And5
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter  Numebr ");
	int a = sc.nextInt();
	if((a%3==0) && (a%5==0)){
	System.out.println("Divided by 3 and 5");
	}else{
	System.out.println("Not Divided by 3 and 5");
	}
	}
}