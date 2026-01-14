package solveingquestions;
import java.util.Scanner;

public class Powerfunction {

    public static int power(int x, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int ans = power(x, n);

        System.out.println(x + " raised to power " + n + " = " + ans);
    }
}
