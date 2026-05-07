package Day8;

public class optimizebubblesort {
      public static void main(String[] args){
      int[] arr ={1,2,3,5,9};
      for(int j=0;j<arr.length-1;j++){
        int swap =0;
         for(int i=1;i<arr.length-j;i++){
           if(arr[i-1]<arr[i]){
           int temp = arr[i-1];
            arr[i-1] =arr[i];
            arr[i] =temp;
            swap++;
           }
          } 
          if(swap==0) break;
      }
       for(int ele:arr){
        System.out.print(ele+" ");
      }
    }
}