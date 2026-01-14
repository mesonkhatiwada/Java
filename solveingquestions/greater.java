package solveingquestions;
import java.util.Scanner;
public class greater {
    public static int great(int a, int b){
        int greata= (a>b ? a :b);
        return greata;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :-");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number;-");
        int b=sc.nextInt();
        int result = great(a, b);
        System.out.println(result);
    }
}
