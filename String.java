package string;
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //User Name
        System.out.print("Enter email : ");
        String mail = sc.next();
        
        for(int i=0; i<mail.length(); i++) {
            if(mail.charAt(i) == '@') {
                System.out.println(mail.substring(0, i));
            }
            else {
                System.out.println("Could not find ");
            }
        }


        // Replace 'e' with 'i'
        String input = sc.next();
        String result = "";

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == 'e') {
                result += 'i';
            } else {
                result += input.charAt(i);
            }
        }
        System.out.println(result);


        // Different String length
        int size = sc.nextInt();
        String array[] = new String[size];

        for(int i=0; i<size; i++) {
            array[i] = sc.next();
        }

        int add = 0 ;
        for(int i=0; i<size; i++) {
            add += array[i].length();
        }
        System.out.println(add);


        //Declaration
        String FirstName = "Saurabh";
        String LastName = "Kumar";
        String FullName = "Saurabh Kumar";


        //Number to String
        int num = 1234;
        System.out.println(Integer.toString(num));


        //ParseInt
        String str ="12390";
        int number = Integer.parseInt(str);
        System.out.println(number);


        //Print
        System.out.println(FullName);


        //Concatenation
        System.out.println(FirstName +" " +LastName);


        //String Length 
        System.out.println(FullName.length());
        System.out.println(FirstName.length());


        //Print Char one by one
        for(int i=0; i<FullName.length(); i++) {
            System.out.println(FullName.charAt(i));
        }


        //Comparing string length 
        String comp = "Saurabh";
        if(FirstName.length() == comp.length()) {
            System.out.println("Length of the String = Equal");
        } else {
            System.out.println("Not Equal Length of String");
        }


        //Compare each Char & length 1
        // String same = "Saurabh";
        int i=0;
        if(FirstName.length() == LastName.length()) {
            do{
                if(FirstName.charAt(i) == LastName.charAt(i)) {
                    System.out.println("Equal");
                } else {
                    System.out.println("Not Equal");
                    break;
                }
                i++;
            } while (i<FirstName.length());
        } else {
            System.out.println("Length is different");
        }


        //Compare to(String)
        String First = "saurabh";
        if(FirstName.compareTo(First) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }


        //Substring
        String Sentence = "I am Saurabh Kumar";
        System.out.println(Sentence.substring(5,Sentence.length()));
        for(int j=5; j<Sentence.length(); j++) {
            System.out.print(Sentence.charAt(j));
        }

        sc.close();
    }
}