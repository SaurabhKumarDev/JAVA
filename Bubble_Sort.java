package sorting;
import java.util.Scanner;

public class Bubble_Sort {

    //Print Sorted array
    public static void SortedArray(int array[]) {
        System.out.print("Sorted : ");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] +", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Size of Array : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("Array : ");
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }

   
        // Bubble Sort
        // Repeat this array.length Stop when all elements sorted / One by one bit sorted
        for(int i=0; i<array.length-1; i++) {
            //Read that element which are present for comparing
            for(int j=0; j<array.length-1-i; j++) {
                //Comparing j to j+1
                if(array[j] > array[j+1]) {
                    //Swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        SortedArray(array);
            sc.close();
        }
    }
