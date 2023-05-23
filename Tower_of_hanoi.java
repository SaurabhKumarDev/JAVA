//Tower of Hanoi
public class Tower_of_hanoi {
    public static void TowerOfHanoi(int n, String src, String helper, String destination) {
        if(n==0) {
            return;
        }
        TowerOfHanoi(n-1, src, destination, helper);
        System.out.println("DISK "+n+" "+src+" to "+destination);
        TowerOfHanoi(n-1, helper, src, destination);
    }
    public static void main(String[] args) {
        TowerOfHanoi(2, "S", "H", "D");
    }
}

//Question : Do Same thing using iteration