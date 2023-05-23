import java.util.Scanner;
public class AtoZ_atoz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        char ch = 'A';
        char chs = 'a';
        System.out.print("Capital Letter End at : ");
        char z = sc.next().charAt(0);
        System.out.print("Small Letter End at : ");
        char Z = sc.next().charAt(0);
        
        //Print A to Z
        while (ch <= z) {
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();
        
        //Print a to z
        do {
            System.out.print(chs +" ");
            chs++;
        } while (chs <= Z);
        sc.close();
    }
}
