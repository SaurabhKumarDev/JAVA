public class Pattern1_str {
    public static void main(String[] args) {
        //Patter1
        // A
        // B C
        // D E F
        // G H I J
        char ch ='A';
        for(int i=1; i<=4; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        System.out.println();
    }
}
