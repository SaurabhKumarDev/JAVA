import java.util.Scanner;
public class num_pow_of_2_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int number;
        int count=1;

        //finding multiplication of 2
        for(number=2; number<=n; number=number*2){
            count++;
        }

        //number is equal to n or not
        if(number/2 == n) {
            System.out.println("2^"+(count-1)+" = "+n);
        }
        else {
            System.out.println("It is not Power of 2");
        }

        sc.close();
    }
}