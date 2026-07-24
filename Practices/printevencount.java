package Practices;
import java.util.*;
public class printevencount{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // output
        int count = 0;
        for(int i =0;i<n;i++){
            if(arr[i]%2==0){ 
            count  = count +1;
            }     
        }
        System.out.print(count);
        sc.close();
    }
}
