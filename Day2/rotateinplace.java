package Day2;

public class rotateinplace {
    public static void main(String[] args) {
        int[] arr ={5,2,6,7,9,2,8};
        int n = arr.length;
        int r =2;
        if(r<0){
            r =r + n;
        }
        r =(r%n);
        
        reverse(arr,0,r-1);
        reverse(arr,r,n-1);
        reverse(arr,0,n-1);

          for(int x :arr){
            System.out.print(x +" ");
          }
    }
    public static void reverse(int[] arr, int i,int j){
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        
    }
}
