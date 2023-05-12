import java.util.Scanner;

public class Even_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for even number : ");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
