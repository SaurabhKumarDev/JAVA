import java.util.Scanner;

public class Basic_Question {
    

    
    public static void SumOfNaturalNo(int n, int s, int t) {
        if(n==0) {
            System.out.println(t);
            return;
        }
        t = s+t;
        SumOfNaturalNo(n-1,s+1,t);
    }

    public static void print1to5(int x1) {
        if(x1==6) {
            return;
        }
        System.out.println(x1);
        print1to5(x1+1);
    }

    public static void print5to1(int x) {
        if(x==0) {
            return;
        }
        System.out.println(x);
        print5to1(x-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Print 5 to 1
        int x = 5;
        //print5to1(x);
        
        //Print 1 to 5
        int x1 = 1;
        // print1to5(x1); 

        //Print Sum of n natural number
        int n=5;
        int s = 1;
        int t=0;
        // SumOfNaturalNo(n,s,t);

        sc.close();
    }
}