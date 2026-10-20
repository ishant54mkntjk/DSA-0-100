public class MoveZerosEnd {
    public static void main(String[] args){
       int arr[] ={0,43,0,9,3,0,0};
       int i=0;
       int j=i+1;
       while(j<arr.length){
          if(arr[i]!=0){
            i++;
            j++;
          }
          else if(arr[i]==0 && arr[j]!=0){
            int temp =arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
            j++;
            i++;
          }
          else{
             j++;
          }

       }
      
       for(int k=0;k<arr.length;k++){
          System.out.print(arr[k]+ " ");
       }
       
    }
}
