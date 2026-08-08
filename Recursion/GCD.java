import java.util.Scanner;

public class GCD {
    public static void gcd(int a, int b) {
        int hcf =1;
        for(int i=2; i<Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                hcf =i;
            }
        }
        System.out.println(hcf);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first no.");
        int a =sc.nextInt();
        System.out.println("Enter your second no.");
        int b =sc.nextInt();

        gcd(a,b);
    }
}
