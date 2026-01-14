package solveingquestions;
import java.util.Scanner;

public class circumferience {

    public static void cir(int r){
        double circu = 2 * 3.14 * r;
        System.out.println("Circumference = " + circu);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        int r = sc.nextInt();

        cir(r); // method call
    }
}
