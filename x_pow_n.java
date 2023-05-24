public class x_pow_n {

    public static int retur(int x, int n) {
        if(n==0 || x==1) {
            return 1;
        }
        return x * retur(x, n-1);
    }

    public static int xpown(int x, int n) {
        if(n==0) {
            return 1;
        }
        if(n%2 == 0) {
            return xpown(x, n/2) * xpown(x, n/2);
        } else {
            return xpown(x, n/2) * xpown(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        //Print x^n (stack height n)
        System.out.println(retur(6, 4));

         //Print x^n (Stack height log n)
        System.out.println(xpown(2, 4));
    }
}