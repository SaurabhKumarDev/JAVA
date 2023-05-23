public class infinite_loop {
    
    //Loop
    public static int dowhileloop() {
        int i=1;
        do {
            System.out.println("loop is going on "+i);
            i=i+1;
        } while(i<=8);
        dowhileloop();
        return 0;
    }
    public static void main(String[] args) {
        dowhileloop();
    }
}
