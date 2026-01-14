package solveingquestions;
import java.util.Scanner;
public class vote {
    public static void agesa(int age){
        if(age>18){
            System.out.println("You can give vote");
        }
        else{
            System.out.println("better luct next time ");
        }
        return ;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter your age ;-");
        int age =sc.nextInt();
        agesa(age);
    }
}
