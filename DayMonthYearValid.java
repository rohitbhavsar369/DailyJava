import java.util.Scanner;
public class DayMonthYearValid {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Day");
	int d = sc.nextInt();
	System.out.println("Enter Mouth");
	int m = sc.nextInt();
	System.out.println("Enter Year");
	int y = sc.nextInt();
	if(d<1 ||  m<1 || y<1 || d>31 || y>12) {    //Day,Month and year can't be in - and no more than 31(Days) and 12(Month)
		System.out.println("Invalid");
	}else if(m==4 || m==6 || m==9 || m==11 && d>30) {   // Month that have 30 days cannot have more than 30 
		System.out.println("Invalid");
	}else if(m==2 && d>29) {                 // Feb can't have more than 29 days 
   		System.out.println("Invalid");
	}else if(!(y%4==0 && y%100!=0)||(y%400==0) && m == 2 && d>28) {   // check Leaper is not and 2 month can't have more than 28 days
		System.out.println("Invalid");
	}else {
		System.out.println("Valid");
	}
		
}
}
