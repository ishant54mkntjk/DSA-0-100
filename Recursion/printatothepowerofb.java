import java.util.*;
public class printatothepowerofb{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your base no.");
        int a =sc.nextInt();
        System.out.println("Enter power digit");
        int b =sc.nextInt();

        System.out.println(a+ " raised to the power " +b+ " is " +pow(a, b));

    }
    public static int pow(int a, int b) {
        if(b==0) return 1;
        int call =pow(a, b/2);
       if(b%2==0) return call*call;
       else return a*call*call;
    }
}