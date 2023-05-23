import java.util.Scanner;
public class avg {
    public static float Average(Float a,Float b,Float c) {
        float avg = (a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 Value : ");
        float a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        System.out.println("Average : "+Average(a, b, c));
        sc.close();
    }
}
