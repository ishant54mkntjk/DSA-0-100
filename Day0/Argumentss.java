package Day0;
public class Argumentss{
    public static void max(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("a is greater");
        }
        else if(b>a && b>c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
    public static void main(String[] args) {
        max(10,20,30);
        
    }
}