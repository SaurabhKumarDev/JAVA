public class Bin_and_Deci {

    static int countbits(int n) {
        int count =0; 
        while(n!=0) {
            count++;
            n>>=1;
        }
        return count;
    }

    public static void main(String[] args) {
        
        // Write a program to count the number of 1’s in a binary representation of the number.
        int n = 32; //100000
        int one=0;
        int zero=0;
        int bitmask1 = countbits(n);
        for(int pos=0; pos<bitmask1; pos++) {
            int bitmask = 1<<pos;
            if((bitmask & n) == 0) {
                zero++;
            } else {
                one++;
            }
        }
        System.out.println("No. of 0's : "+zero);
        System.out.println("No. of 1's : "+one); 

        // Binary to Decimal
        // int binary = 10101;
        // int base =1;
        // int Decimal = 0;
        // int rem;
        // while (binary > 0) {
        //     rem = binary % 10;
        //     Decimal = Decimal + rem * base;
        //     binary = binary / 10;
        //     base = base * 2;
        // }
        // System.out.println(Decimal);

        //Decimal to Binary
        // int n = 100; //number
        // int array[] = new int[40]; //store only 40bits
        // int reminder=0; //Reminder have binary number(1,0) from right to left
        // int count = 0; //Used for print binary number or set limit of the loop
        // for(int i=0; n>0; i++) { //i is used to store 1 and 0, n>0 it will find out how much bit are present or calculate
        //     count++; //how many times loop work
        //     reminder = n % 2; //n%2 give us reminder which is always 1 either 0
        //     array[i] = reminder; 
        //     n = n / 2; //Repeat this process till 0,this will work till all digit in binary counted counted like 101 = 3 bits{5/2 = 2/2 = 1/2 }
        // }
        // for(int i=count-1; i>=0; i--) {
        //     System.out.print(array[i]);
        // }

        
    }
}