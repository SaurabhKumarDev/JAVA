import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value : ");
        int value = sc.nextInt();
        System.out.print("Enter the percentage value : ");
        float per = sc.nextInt();
        // Percentage
        float percentage = value*per / 100;
        System.out.println("Percentage : "+percentage+" %");
        sc.close();
    }
}
