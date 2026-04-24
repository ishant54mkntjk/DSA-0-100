package Day4;

public class missingvalues {
    public static void main(String[] args) {
        int[] arr= {1,2,5,4,6};
        long n = arr.length+1;
        long sum =n*(n+1)/2;
        long arraysum =0;
        for(int ele :arr){
            arraysum += ele;
        }
        System.out.print("Missing value is:"+(int)(sum - arraysum));
    }
}
