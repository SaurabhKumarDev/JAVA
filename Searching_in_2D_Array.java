import java.util.Scanner;

public class Searching_in_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Size of array
        System.out.print("Enter Row and Cols : ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int twoDArray[][] = new int[row][cols];

        //Input
        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                twoDArray[i][j] = sc.nextInt();
            }
        }

        //Find x in array
        System.out.print("Find : ");
        int x = sc.nextInt(); 

        //Output
        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                if(twoDArray[i][j]==x) {
                    System.out.println("X find at ( "+i+", "+j+" )");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}