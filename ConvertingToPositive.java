import java.util.Scanner;
class ConvertingToPositive
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter  Numebr ");
	int a = sc.nextInt();
	if(a<0){
	System.out.println("Converted: "+(a*-1));
	}else{
	System.out.println("Not Converted:"+a);
	}
	}
}