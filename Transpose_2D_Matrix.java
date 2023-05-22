import java.util.Scanner;

public class Transpose_2D_Matrix {
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

        //Transpose
        System.out.print("\n\nTranspose :-\n");
        for(int i=0; i<cols; i++) {
            for(int j=0; j<row; j++) {
                System.out.print(array[j][i] +" ");
            }
            System.out.println();
        }

        sc.close();
    }
}