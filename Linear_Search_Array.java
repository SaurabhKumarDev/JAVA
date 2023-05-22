import java.util.Scanner;

public class Linear_Search_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Array Size
        System.out.print("Enter the size of an array : ");
        int size=sc.nextInt();
        int number[] = new int[size];
        
        //Input
        for(int i=0;i<size;i++) {
            System.out.print("Number["+i+"] : ");
            number[i] = sc.nextInt();
        }

        //Search
        System.out.print("Enter the number to be searched : ");
        int x=sc.nextInt();

        //boolean 
        boolean found = false;

        //Output
        for(int j=0;j<number.length;j++) {
            if(number[j]==x) {
                System.out.println("X is found at : "+j);
            }
            else
                found = false;
        }

        if(found) {     //for else condition 
            System.out.println("Doesn't exist");
        }

        sc.close();
    }
}
