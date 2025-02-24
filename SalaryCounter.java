import java.util.Scanner;

class SalaryCounter
{
public static void main(String[] agrs)
{
Scanner sc = new Scanner(System.in);
System.out.println("********Final salary Counter********");

System.out.println("Enter the Salary:");
int sal = sc.nextInt();

System.out.println("Enter the Late mark :");
int lm = sc.nextInt();

int pday = sal/30;
System.out.println("Salary Per Day :" + pday);

int r = pday * lm;
int finalsal = sal - r;
System.out.println("Your final Salary is: " + finalsal);

}
}