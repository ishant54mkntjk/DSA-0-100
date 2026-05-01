package Day6;

public class wavaarray {
      public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6};
        int n =arr.length;
        
        for(int i=0; i<n-1;i+=2){
          
            int temp = arr[i];
            arr[i] =arr[i+1];
            arr[i+1]= temp;

            
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
