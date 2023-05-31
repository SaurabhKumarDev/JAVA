public class bitwise {
    public static void AND(int a, int b) {
        System.out.println("And Operator : "+(a&b));
    }
    public static void OR(int a, int b) {
        System.out.println("OR Operator : "+(a|b));
    }
    public static void XOR(int a, int b) {
        System.out.println("XOR Operator : "+(a^b));
    }
    public static void NOT(int a) {
        System.out.println("Negation of A : "+(~a));
    }
    public static void Left_Shift(int a, int c) {
        System.out.println("Left Shift Operator (<<) (+ve) : "+(a<<2));
        System.out.println("Left Shift Operator (<<) (-ve) : "+(c<<1));
    }
    public static void Right_Shift(int a, int c) {
        System.out.println("Binary Right Shift Operator (>>) (+ve) : "+(a>>1));
        System.out.println("Binary Right Shift Operator (>>) (+ve) : "+(c>>1));
    }
    public static void Zero_Right_Shift(int a, int c) {
        System.out.println("Zero Fill Right Shift Operator (>>>) (+ve) : "+(a>>>1));
        System.out.println("Zero Fill Right Shift Operator (>>>) (-ve) : "+(c>>>1));
    }
    public static void main(String[] args) {

        //BitWise Operator
        int a = 8;
        int b = 4;
        int c = -6;

        AND(a, b);
        OR(a, b);
        NOT(a);
        XOR(a, b);
        Left_Shift(a, c);
        Right_Shift(a, c);
        Zero_Right_Shift(a, c);
    }
}