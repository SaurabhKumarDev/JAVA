package sorting;
import java.util.Scanner;

public class Sorting {

    //Function
    //Print Sorted array
    public static void SortedArray(int array[]) {
        System.out.print("Sorted : ");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] +", ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Size of array
        System.out.print("No. of Elements : ");
        int size = sc.nextInt();
        int array[] = new int[size];

        //Input
        for(int i=0; i<size; i++) {
            System.out.print("Array["+i+"] : ");
            array[i] = sc.nextInt();
        }

        /*
        //Bubble Sort
        //Repeat this array.length Stop when all elements sorted / One by one bit sorted
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
        */

        /*
        // Radix Sort    //Not execute
        int result[] = new int[size];
        for(int i=0; i<size; i++) {
            result[i] = array[i] / 10;
            System.out.println(result[i]);
        }
        int temp[] = new int[size];
        for(int i=0; i<size; i++) {
            for(int k=0; k<size; k++) {
                temp[k] = result[k] % 10;
            }
            for(int j=0; j<size; j++) {
                if(temp[j] > temp[j+1]) {
                    int temp1 = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp1;
                }
            }
        }
        SortedArray(array);
        */

        /*
        // Selection Sort
        for(int i=0; i<size-1; i++) {
            int fix = i;
            for(int j=i+1; j<size; j++) {
                if(array[fix] > array[j]) {
                    fix = j;
                }
            }
            //swap
            int temp = array[fix];
            array[fix] = array[i];
            array[i] = temp;
        }
        SortedArray(array);
        */

        /*
        // Insertion Sort
        for(int i=1; i<array.length; i++) {
            int CurrentValueOfI = array[i];
            int j = i-1;
            while(j>=0 && CurrentValueOfI < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            //Placement
            array[j+1] = CurrentValueOfI;
        }
        SortedArray(array);
        */

        sc.close();
    }
}