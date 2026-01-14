package Functions;
import java.util.Scanner;

public class main {

    public static void printMyName(String name){ //Function
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        printMyName(name);

    }
}