package Practices;
import java.util.*;
public class printevenelements{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // output
        for(int i =0;i<n;i++){
            if(arr[i]%2==0){
            System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }
}
