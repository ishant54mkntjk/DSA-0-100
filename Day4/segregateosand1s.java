package Day4;

public class segregateosand1s{
    public static void main(String[] args) {
        int[] arr= {0,0,0,0,1,0};
        int n=arr.length;

       int i=0;
       int j=n-1;
       while(i<j){
        if(arr[i]==0){
            i++;
        }
        else {
            int temp = arr[i];
            arr[i] =arr[j];
            arr[j]=temp;
            j--;
        }
       }
       for(int ele: arr){
        System.out.print(ele+" ");
       }
       
    }
}
