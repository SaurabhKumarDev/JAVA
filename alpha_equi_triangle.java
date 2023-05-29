public class alpha_equi_triangle {
    public static void triangle_alpha(int row) {
        for(int i=1;i<=row;i++) {
            char ch='A';
            for(int j=1;j<=row-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(ch);
                ch++;
            }
            ch='A';
            for(int k=1;k<i;k++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        triangle_alpha(5);
    }
}
