//12. Write a java program to Check the given number is Armstrong or not.
public class Lab1_12 {
    public static void main(String args[]) {
        int n=407;
        double strong = 0, count = 0,r;
        int n1 = n, n2 = n;
        while (n1 > 0) {
            n1 = n1 / 10;
            count++;
        }
        while (n2 > 0) {
            r = n2 % 10;
            strong = strong + Math.pow(r, count);
            n2 = n2 / 10;
        }
        if (n == strong) {
            System.out.println(n + " is a armstrong number");
        } else {
            System.out.println(n + " is not a armstrong number");
        }
    }
}