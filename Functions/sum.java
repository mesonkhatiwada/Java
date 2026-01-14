package Functions;
import java.util.Scanner;
public class sum{
    public static int addToNumbers(int a,int b){
        int sum =a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("One number:-");
        int a=sc.nextInt();
        System.out.println("Enter Second Numbers ;-");
        int b =sc.nextInt();
        int add =addToNumbers(a, b);
        System.out.println(add);
    }
}