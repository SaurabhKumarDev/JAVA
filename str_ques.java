public class str_ques {
    //Print String in reverse
    // public static void strreverse(String str, int idx) {
    //     if(idx < 0) {
    //         return;
    //     }
    //     System.out.println(str.charAt(idx));
    //     strreverse(str, idx-1);
    // }
    // public static void main(String[] args) {
    //     String name = "Saurabh";
    //     strreverse(name, name.length()-1);
    // }

    // Find the occurrence of the first and last occurrence of an element using recursion.
    // public static int first = -1;
    // public static int last = -1;
    // public static void occur(String str,  int idx) {
    //     if(str.length()-1 == idx) {
    //         return;
    //     }
    //     if(str.charAt(idx)=='x') {
    //         if(first == -1) {
    //             first = idx;
    //             occur(str,  idx+1);
    //         } else {
    //             last = idx;
    //             occur(str,  idx+1);
    //         }
    //     }
    //     occur(str, idx+1);
    // }
    // public static void main(String[] args) {
    //     String str ="axbcdfghxxxxwer";
    //     // char ch = 'x';
    //     occur(str,  0);
    //     System.out.println("First occurence of the x is : "+first);
    //     System.out.println("Last occurence of the x : "+last);
    // }

    //Check if an array is sorted (strictly increasing). - O(n)
    // public static boolean sorted(int arr[], int idx) {
    //     if(arr.length-1 == idx) {
    //         return true;
    //     }
    //     if(arr[idx]<arr[idx+1]) {
    //         return sorted(arr, idx+1);
    //     } else {
    //         return false;
    //     }
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,4,5};
    //     System.out.println(sorted(arr, 0));
    // }

    //Move all ‘x’ to the end of the string. - O(n)
    // public static String newString;
    // public static void addx(count) {
    //     for(int i=1; i<=count; i++) {
    //         newString += 'x';
    //     }
    // }
}
