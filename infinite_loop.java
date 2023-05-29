public class infinite_loop {
    public static void loop() {
        int i=0;
        do {
            System.out.println("Hello");
            i++;

        } while (i>=1);
    }
    public static void main(String[] args) {
        loop();
    }
}
