public class smallestAndLargest {
    public static void main(String[] args){
       int arr[] ={1,43,5,9,3,0};
  
          int largest =arr[0];
          int smallest =arr[0];
       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest =arr[i];
        }
        if(arr[i]<smallest){
            smallest =arr[i];
        }
       }
       System.out.println("Largest Element :" + largest);
       System.out.println("Smallest Element :" + smallest);
       
}
}