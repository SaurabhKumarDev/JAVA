import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int count=0;
        int i = 1;

        while(i<=n) {
            if(n%i==0) {
                count++;
            }
            i=i+1;
        }
        if(count==2) 
            System.out.println("Prime number");
        else
            System.out.println("Not a Prime number");
        sc.close();
    }
}