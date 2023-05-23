import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of circle : ");
        float rad = sc.nextInt();
        System.out.println("Area of Circle : "+3.14*(rad*rad));

        sc.close();
    }
}