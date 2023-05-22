import java.util.Scanner;

public class Cal_percent_use_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many subject : ");
        int NumberOfSubject = sc.nextInt();
        int subject[] = new int[NumberOfSubject];

        int total_marks=0;
        
        //Enter marks
        for(int i=0; i<NumberOfSubject; i++) {
            System.out.print("Marks["+(i+1)+"] : ");
            subject[i] = sc.nextInt();
        }

        //Add Marks
        for(int i=0; i<NumberOfSubject; i++) {
            total_marks = total_marks+subject[i];
        }

        //For exact percentage
        float NofSub = NumberOfSubject;
        System.out.println("Percentage : "+total_marks/NofSub);
    
    sc.close();
    }
}