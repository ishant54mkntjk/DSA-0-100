package Day2;

import java.util.Scanner;

public class secondmaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        // boolean found =false;
        for(int i=0;i<n;i++){
            if(x[i]>max){
                secondmax = max;
                max = x[i];
                
            }
            else if( x[i]>secondmax && x[i]!=max){
                secondmax =x[i];
            // found =true;
            }
        }
        // if(found){
        // System.out.println("Second maximum is: "+secondmax);
          
        // }
        // else{
        // System.out.println("Second maximum is not found");
        // }
        if(secondmax == Integer.MIN_VALUE){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found "+secondmax);
        }
        sc.close();
    }
    
}
