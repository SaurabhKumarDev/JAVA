import java.util.Scanner;

public class Month_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Month Number : ");
        int Month = sc.nextInt();
        
        switch (Month) {
            case 1: 
                System.out.println("Jan");
                System.out.println("Chaitra");
                break;
            case 2 : 
                System.out.println("Feb");
                System.out.println("Vaishakha");
                break;
            case 3 : 
                System.out.println("Mar");
                System.out.println("Jaishtha");
                break;
            case 4: 
                System.out.println("Apr");
                System.out.println("Ashadha");
                break;
            case 5 : 
                System.out.println("May");
                System.out.println("Shravana");
                break;
            case 6 : 
                System.out.println("Jun");
                System.out.println("Bhadrapada");
                break;
            case 7: 
                System.out.println("Jul");
                System.out.println("Ashvina");
                break;
            case 8 : 
                System.out.println("Aug");
                System.out.println("Kartika");
                break;
            case 9 : 
                System.out.println("Sep");
                System.out.println("Margshirsha");
                break;
            case 10 : 
                System.out.println("Oct");
                System.out.println("Pausha");
                break;
            case 11 : 
                System.out.println("Nov");
                System.out.println("Magha");
                break;
            case 12 : 
                System.out.println("Dec");
                System.out.println("Phalguna");
                break;
            default : System.out.println("Invalid");
        }
        sc.close();
    }
}