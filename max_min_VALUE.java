import java.util.Scanner;

public class max_min_VALUE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Size
        System.out.print("Size of an array : ");
        int size = sc.nextInt();
        int[] array  = new int[size];

        //Input
        for(int i=0; i<size; i++) {
            System.out.print("A["+i+"] = ");
            array[i] = sc.nextInt();
        }

        //Max and Min range
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //Min
        for(int i=0; i<array.length; i++) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        //Max
        for(int i=0;i<array.length; i++) {
            if(array[i]>max) {
                max = array[i];
            }
        }

        //Print
        System.out.println("Smallest no. : "+min);
        System.out.println("Largest no. : "+max);
        
        /*
        //ANOTHER METHOD

        // create an array of int type
        int[] arr = {4, 2, 5, 1, 0};

        // assign first element of array as minimum value
        int min = arr[1];
        for (int i = 1; i < arr.length; i++) {
        
            // compare all elements with min
            // assign minimum value to min
            min = Math.min(min, arr[i]);
        }
        System.out.println("Minimum Value:"+min);
        */
        sc.close();
    }
}