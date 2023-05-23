import java.util.Scanner;

public class Mul_Add_Sub_two_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        //Size of array
        System.out.print("Enter row & cols : ");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int array1[][] = new int[row][cols];
        int array2[][] = new int[row][cols];
        int array3[][] = new int[row][cols];

        //Input array =1
        System.out.println("\nArray 1");
        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                array1[i][j] = sc.nextInt();
            }
        }

        //Input array =2
        System.out.println("\nArray 2");
        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                array2[i][j] = sc.nextInt();
            }
        }

        /*
        //Addition
        System.out.println("\nArray1 + Array2 :- ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        
        //Subtraction
        System.out.println("\nArray1 + Array2 :- ");
        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                array3[i][j] = array1[i][j] - array2[i][j];
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        */

        //Multiplication 
        System.out.println("\nArray1 * Array2 :-");
        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                if(cols<=row) {
                    for(int k=0; k<cols; k++) { //Col must be lesser
                        array3[i][j] += array1[i][k] * array2[k][j];
                    }
                    System.out.print(array3[i][j] + " ");
                } else {
                    for(int k=0; k<row; k++) { //Col must be lesser
                        array3[i][j] += array1[i][k] * array2[k][j];
                    }
                    System.out.print(array3[i][j] + " ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}