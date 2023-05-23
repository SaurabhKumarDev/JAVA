import java.util.*;

public class String_Builder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder("S");

        //append
        sb.append("a");
        sb.append("u");
        sb.append("r");
        sb.append("c");
        sb.append("d");
        sb.append("h");

        //Insert
        sb.insert(4,"a");

        //Replace
        sb.replace(5, 6, "b");

        //Delete
        sb.delete(6, 7);

        //Reverse
        System.out.println(sb);

        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - 1 - i;
            char frontchar = sb.charAt(i);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        } System.out.println(sb);

        //Reverse2
        sb.reverse();

        //Capacity
        System.out.println(sb.capacity()); 

        sc.close();
    }
}
