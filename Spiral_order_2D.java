import java.util.Scanner;

public class Spiral_order_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Size
        System.out.print("Row and cols : ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int array[][] = new int[row][cols];

        //Input
        System.out.print("\nMatrix :- \n");
        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        //Variable's
        int row_start = 0;
        int row_end = row-1;
        int column_start = 0;
        int column_end = cols-1;

        //Spiral Order
        System.out.print("\nSpiral Order :- ");
        while (row_start <= row_end && column_start <= column_end) {
            
            //row_start 
            for(int j=column_start; j<=column_end; j++) {
                System.out.print(array[row_start][j] +" ");
            }
            row_start++;    //row_start = 1

            //column_end 
            for(int i=row_start; i<=row_end; i++) {
                System.out.print(array[i][column_end] +" ");
            }
            column_end--;   //column_end = cols - 2

            //row_end
            for(int j=column_end; j>=column_start; j--) {
                System.out.print(array[row_end][j] +" ");
            }
            row_end--;  

            //column_start
            for(int i=row_end; i>=row_start; i--) {
                System.out.print(array[i][column_start] +" ");
            }
            column_start++;
        }

        sc.close();
    }
}