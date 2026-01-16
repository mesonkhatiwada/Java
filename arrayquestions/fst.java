package arrayquestions;
import java.util.*;
public class fst {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arrplz=sc.nextInt();
        int []arr = new int[arrplz];
        for(int i=0;i<=arrplz ;i++){
            arr [i] =sc.nextInt();
        }
        for(int i =0 ;i<arr.length;i++){
            System.out.println("name"+(i+1)+"is :"+arr[i]);
        }
    }
}