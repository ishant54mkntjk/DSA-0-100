package Day2;
import java.util.*;
public class Searchinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = {1, 2, 3, 4, 5};
        boolean found = false;
        for(int i=0;i<x.length;i++){
            if(x[i]==n){
                found = true;
                System.out.println("Element found at index "+i);
                return;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
        sc.close();
    }
    
}
