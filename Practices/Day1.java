package Practices;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
           // default
        // for(int i =0;i<arr.length; i++){
        // System.out.print(arr[1]+" ");
        // }

           // taking array form user
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+"");

        }

        sc.close();
    }
    
}
