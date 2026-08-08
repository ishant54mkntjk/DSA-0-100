import java.util.*;

public class print1ton{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        ishant(1,n);
    }
    public static void ishant(int x, int n){
        if(x>n) return;
        System.out.println(x);
        ishant(x+1,n);
    }
}