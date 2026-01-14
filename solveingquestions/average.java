package solveingquestions;
import java.util.Scanner;
public class average {
    public static void avgNum(int a,int b, int c){
        int avg=(a+b+c)/3;
        System.out.println("The Average of three number is "+avg);
    }
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter One number ;-");
        int a = sc.nextInt();
        System.out.println("Enter another number ;-");
        int b = sc.nextInt();
        System.out.println("Enter another number ;-");
        int c = sc.nextInt();
        avgNum(a, b, c);
    }
}