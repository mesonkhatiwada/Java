package Functions;
import java.util.Scanner;
public class factorial {
    public static void facNum(int n){
        if(n<0){
            System.out.println("invalid number");
            return;
        }
        //loop
        int fact=1;
        for(int i=n;i>=1;i--){
            fact =fact*i;
        }
         System.out.println(fact);
         return;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        facNum(n);
    }
}