import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition : "+(a+b));
        System.out.println("Subtraction : " +(a-b));
        System.out.println("Multiplication : "+a*b);
        if(b==0) {
            System.out.println("It can not be divided by 0"); 
        } else {
            System.out.println("Division : "+a/b);
            System.out.println("Reminder : "+a%b);
        }

        sc.close();
    }
}