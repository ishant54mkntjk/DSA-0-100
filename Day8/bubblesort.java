package Day8;

public class bubblesort {
    public static void main(String[] args){
      int[] arr ={1,21,12,2,33,8};
      for(int j=0;j<arr.length-1;j++){
      for(int i=1;i<arr.length-j;i++){
       if(arr[i-1]>arr[i]){
        int temp = arr[i-1];
        arr[i-1] =arr[i];
        arr[i] =temp;
       }
       
       }
    }
      for(int ele:arr){
        System.out.print(ele+" ");
      }
}
}
