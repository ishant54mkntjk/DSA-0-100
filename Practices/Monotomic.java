import java.util.*;

public class Monotomic {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 1; i < n; i++){

            if(arr[i] > arr[i-1]){
                decreasing = false;
            }

            if(arr[i] < arr[i-1]){
                increasing = false;
            }
        }

        System.out.println(increasing || decreasing);
    }
}