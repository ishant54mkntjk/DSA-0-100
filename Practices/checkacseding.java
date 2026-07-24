package Practices;
import java.util.*;
public class checkacseding {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array size");
        int n =sc.nextInt();
        int[] arr =new int[n];
        
        System.out.print("Enter array elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
           boolean isAscending = true;
           boolean isDescending =true;

           for(int i =0; i<n-1;i++){
            if(arr[i] > arr[i+1]){
             isAscending = false;
            }
             if(arr[i]<arr[i+1]){
                isDescending =false;
            }
           }

           if(isAscending){
            System.out.print("Ascending");
           }
           else if(isDescending){
            System.out.print("Descending");
           }
           else{
            System.out.print("Not sorted");
           }
           sc.close();
        }
         
    }

