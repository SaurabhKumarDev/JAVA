package for_;
public class str_ques {
    
    //RECURSION

    //Print String in reverse
    public static void strreverse(String str, int idx) {
        if(idx < 0) {
            return;
        }
        System.out.println(str.charAt(idx));
        strreverse(str, idx-1);
    }
    public static void main(String[] args) {
        String name = "Saurabh";
        strreverse(name, name.length()-1);
    }

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

    //Print all a at the end of the string
    // public static void PrintAatEnd(String str, char cmp, int idx, int count, String newString) {
    //     if(str.length() == idx) {
    //         for(int i=1; i<=count; i++) {
    //             newString = newString+cmp;
    //         }
    //         System.out.println(newString);
    //     }
    //     if(str.charAt(idx) == cmp) {
    //         count++;
    //         PrintAatEnd(str, cmp, idx+1, count, newString);
    //     } else {
    //         newString = newString + str.charAt(idx);
    //         PrintAatEnd(str, cmp, idx+1, count, newString);
    //     }
    // }
    // public static void main(String[] args) {
    //     String str = "abacadaea";
    //     char cmp = 'a';
    //     PrintAatEnd(str, cmp, 0, 0, "");
    // }

    //Remove duplicates in a string.
    // public static boolean map[] = new boolean[25];
    // public static void returnString(String str, int idx, String newString) {
    //     if(str.length() == idx) {

    //     }
    //     if(str.length(idx) == )
    // }
    // public static void main(String[] args) {
    //     String str = "abaxghag";
    //     returnString(str, 0, "");
    // }
}
