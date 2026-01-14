package Functions;
import java.util.Scanner;
public class product {
    public static int productOfTwoNum(int a ,int b){
        int pro=a*b;
        return pro;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter one number;-");
        int a=sc.nextInt();
        System.out.println("Enter Second number;-");
        int b= sc.nextInt();
        int produ=productOfTwoNum(a, b);
        System.out.println(produ);
    }
    
}