import java.util.Scanner;

public class Check_Ascending_and_Descending_Order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array Size
        System.out.print("Size of array : ");
        int size = sc.nextInt();
        int array[] = new int[size];

        //Input
        for(int i=0; i<size; i++) {
            System.out.print("A["+i+"] : ");
            array[i] = sc.nextInt();
        }

        //Boolean have only true and false, Used condition output
        boolean isAscending = true;
        boolean isDescending = true;

        //Ascending order
        for(int i=0; i<array.length-1; i++) {  
            if(array[i]>array[i+1]) {   
                isAscending = false;
            }
        }

        //Descending order
        for(int i=0; i<array.length-1; i++) {  
            if(array[i]<array[i+1]) {   
                isDescending = false;
            }
        }

        //Condition & Print
        if(isAscending)
            System.out.println("Ascending order");
        else if(isDescending)
            System.out.println("Descending Order");
        else 
            System.out.println("Not Ascending and Descending Order");

        sc.close();
    }
}