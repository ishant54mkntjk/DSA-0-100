public class LinearSearch {
    public static void main(String[] args){
       int arr[] ={1,43,5,9,3,0};
       int target =9;
       int index =-1;
  
       for(int i=0;i<arr.length;i++){
         if(arr[i]==target){
            index =i;
            // System.out.println("Index of target :"+ index);
            break;
         }
         
       }
       
      System.out.println( index);
       
}
}
