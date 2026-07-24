import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];

        for(int i=0; i<n;i++){
            arr[i] =sc.nextInt();
        }

       int sum= 0;
       
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
         
           int avg=sum/n;
            System.out.print(avg);
            sc.close();
    }
    
}
