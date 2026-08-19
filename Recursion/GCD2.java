import java.util.Scanner;

public class GCD2 {
     public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
     }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first no.");
        int a =sc.nextInt();
        System.out.println("Enter your second no.");
        int b =sc.nextInt();

        System.out.println(gcd(a,b));
    }
}
