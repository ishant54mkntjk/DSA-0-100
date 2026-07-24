package Practices;
import java.util.*;
public class maximum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array size");
        int n =sc.nextInt();
        int[] arr =new int[n];
        int max = arr[0];
        System.out.print("Enter array elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max){
            max = arr[i];
            }
        }
            System.out.println(max);
         sc.close();
    }
}
