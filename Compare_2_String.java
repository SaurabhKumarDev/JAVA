public class Compare_2_String {

    public static void first_method(String name1, String name2) {
        //s1>s2 -> +value
        //s1==s2 ->  0
        //s1<s2 ->  -value
        if(name1.compareTo(name2)==0) {
            System.out.println("Matched");
        } else {
            System.out.println("Not matched");
        }
    }

    public static void second_method(String name1, String name2) {
        int count = 0;
        if(name1.length() == name2.length()) {
            for(int i=0; i<name1.length(); i++) {
                if(name1.charAt(i) == name2.charAt(i)) {
                    count++;
                }
            }
            if(count == name1.length()) {
                System.out.println("Size and character matched");
            } else {
                System.out.println("Size Same but Character are different");
            }
        } else {
            System.out.println("Not Matched");
        }
    }

    public static void main(String[] args) {
        String name1 = "Saurabh";
        String name2 = "Kumarji";
        
        first_method(name1, name2);
        second_method(name1, name2);
    }
}