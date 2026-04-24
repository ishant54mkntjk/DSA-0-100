package Day4;

public class missingvalues {
    public static void main(String[] args) {
        int[] arr= {1,2,5,4,6};
        int n = arr.length+1;
        int sum =n*(n+1)/2;
        int arraysum =0;
        for(int ele :arr){
            arraysum += ele;
        }
        System.out.print("Missing value is:"+(sum - arraysum));
    }
}
