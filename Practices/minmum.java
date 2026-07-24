package Practices;
import java.util.*;
public class minmum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array size");
        int n =sc.nextInt();
        int[] arr =new int[n];
        int min = arr[0];
        System.out.print("Enter array elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
           if(arr[i]<min){
            min = arr[i];
           }
        }
            System.out.println(min);
         
        
        sc.close();
    }
}
