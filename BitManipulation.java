import java.util.Scanner;

public class BitManipulation {
    public static void Get(int num, int cmp) {
        if((num & cmp) == 0) {
            System.out.println("Bit = 0");
        } else {
            System.out.println("Bit = 1");
        }
    }
    public static void Set(int num, int cmp) {
        if((num & cmp) == 0) {
            int new_value = num | cmp;
            System.out.println("Your new Value : "+new_value);
        } else {
            System.out.println("Already 1");
        }
    }
    public static void Clear(int num, int cmp) {
        if((num & cmp) == 0) {
            System.out.println("Already 0");
        } else {
            int new_value = num & (~cmp);
            System.out.println("Your new Value : "+new_value); 
        }
    }
    public static void update(int num, int cmp) {
        if((num & cmp) == 0) {
            int new_value = num | cmp;
            System.out.println("New Value : "+new_value);
        } else {
            int new_value = num & (~cmp);
            System.out.println("New Value : "+new_value);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nNumber and Position : ");
        int num = sc.nextInt(), pos = sc.nextInt();
        int cmp = 1<<pos;

        System.out.println("\n1. Get\n2. Set\n3. Clear\n4. Update");
        System.out.print("\nWhat do you want to do : ");
        int todo = sc.nextInt();

        switch(todo) {
            case 1 :
                Get(num,cmp);
                break;
            case 2 :
                Set(num, cmp);
                break;
            case 3 :
                Clear(num, cmp);
                break;
            case 4 :
                update(num, cmp);
                break;
            default : 
                System.out.println("Wrong Input");
                break;
        }
        sc.close();
    }
}