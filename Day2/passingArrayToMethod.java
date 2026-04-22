package Day2;

public class passingArrayToMethod {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

    }
    public static void change(int[] y){
        y[2] = 100;
        }
    }

