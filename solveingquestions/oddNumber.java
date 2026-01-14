package solveingquestions;
import java.util.Scanner;
public class oddNumber {
    public static void oddNumbersDisplay(int n){
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        Scanner np =new Scanner (System.in);
        int n= np.nextInt();
        oddNumbersDisplay(n);
    }
}
