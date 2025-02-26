import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks ");
        int a = sc.nextInt();

        if (a < 0 || a > 100) {
            System.out.println("You are mad ");
        } else if (a >= 85 && a <= 100) {
            System.out.println("You will get Grade: A");
        } else if (a >= 75 && a < 85) {
            System.out.println("You will get Grade: B");
        } else if (a >= 60 && a < 75) {
            System.out.println("You will get Grade: C");
        } else if (a >= 45 && a < 60) {
            System.out.println("You will get Grade: D");
        } else {
            System.out.println("You are FAIL ");
        }
    }
}

