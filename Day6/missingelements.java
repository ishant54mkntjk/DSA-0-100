package Day6;

public class missingelements {
    
    public static void main(String[] args){
        int[] arr ={1,2,4,5,6};
        int n =arr.length;

        for(int i=0; i<n-1;i++){
            int curr = arr[i];
            int next =arr[i+1];
            for(int j =curr +1;j<next;j++){
               System.out.print(j+" ");
            }
        }
    }
}