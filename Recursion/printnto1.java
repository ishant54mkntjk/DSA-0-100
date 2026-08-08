import java.util.*;

public class printnto1{
    public static void main(String[] args) {
        ishant(5);
    }
    public static void ishant(int n){
        if(n==0) return;
        System.out.println(n);
        ishant(n-1);
    }
}