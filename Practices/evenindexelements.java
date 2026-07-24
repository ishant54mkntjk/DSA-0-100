package Practices;
import java.util.*;
public class evenindexelements{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        // output
        
        for(int i =0;i<n;i+=2){

          System.out.print(arr[i]+" ");    
        }
        
        sc.close();
    }
}
