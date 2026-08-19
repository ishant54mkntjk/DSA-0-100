import java.util.*;
public class star {
    public static void main(String[] args){
        // System.out.println("Enter your number");
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
            System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
}
