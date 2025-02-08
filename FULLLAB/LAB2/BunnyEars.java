
// 10. We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3,
// ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
// because they each have a raised foot. Recursively return the number of "ears" in
// the bunny line 1, 2, ... n (without loops or multiplication).
// E.g.
// bunnyEars2(0) → 0
// bunnyEars2(1) → 2
// bunnyEars2(2) → 5
import java.util.*;

public class BunnyEars {
    public static int bunnyEar(int bunny, int i, int n) {
        if (i == 0)
            bunny = 0;
        else if (i % 2 == 0) {
            bunny = bunny + 3;
        } else {
            bunny = bunny + 2;
        }
        if (i == n) {
            return bunny;
        } else {
            return bunnyEar(bunny, i + 1, n);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        int bunny = 0;
        System.out.println("bunnyEars2(" + n + ")-->" + bunnyEar(bunny, 0, n));
        sc.close();
    }
}
