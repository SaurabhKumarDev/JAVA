import java.util.Scanner;
public class greatest_common_factor {
    
    //Write a function that calculates the Greatest Common Divisor of 2 numbers. 
    // Example: Find the GCF of 12 and 8.
    // Solution:
    // Factors of 12: 1, 2, 3, 4, 6, 12
    // Factors of 8: 1, 2, 4, 8
    // Common Factors: 1, 2, 4
    // Greatest Common Factor: 4
    // Hence, the GCF of 12 and 8 is 4.
    public static int GCF(int x1,int x2) {
        int i,newv=1;
        for(i=1;i<=x1 && i<=x2;i++) {
            if(x1%i==0 && x2%i==0) {
                newv=i;
            }
        }
        System.out.println(newv);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x1 and x2 : ");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        GCF(x1, x2);
        sc.close();
    }    
}
