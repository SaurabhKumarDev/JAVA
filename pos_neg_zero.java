import java.util.Scanner;
public class pos_neg_zero {
    
    // Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos=0;
        int neg=0;
        int zero=0;
        char choice;
        do {
            System.out.println("Enter a Number : ");
            int n = sc.nextInt();
            if(n>0)
                pos++;
            else if(n<0)
                neg++;
            else 
                zero++;
            System.out.println("Do you want to continue Y/N : ");
            choice = sc.next().charAt(0);
        } while( choice == 'y' || choice == 'Y') ;
        System.out.println("Counting of Possitive number : "+pos);
        System.out.println("Counting of Negative number : "+neg);
        System.out.println("Counting of Zero number : "+zero);
        sc.close();
    }
}
