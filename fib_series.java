import java.util.Scanner;
public class fib_series {
    //Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 ..... In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
    static int n1=0,n2=1,n3=0;
    public static void Fibonacci(int n) {
        if(n>0) {
            n3 = n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            Fibonacci(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.print(n1+" "+n2);
        Fibonacci(n-2);
        sc.close();
    }
}
