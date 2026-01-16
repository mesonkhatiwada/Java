package Arrays;
import java.util.*;
public class q1 {                     // Linear Search 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr=sc.nextInt();
        int [] ball= new int [arr] ;
        for(int i =0;i<arr;i++){
            ball [i] = sc.nextInt();
        }
        int x =sc.nextInt();
        for(int i =0 ;i<ball.length;i++){
            if(ball[i] ==x){
                System.out.println("xfound in "+i);
            }

        }

    }
    
}
