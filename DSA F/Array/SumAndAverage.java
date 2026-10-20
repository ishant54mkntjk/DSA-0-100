public class SumAndAverage {
    public static void main(String[] args){
       int arr[] ={1,43,5,9,3,0};
  
          int sum= 0;
          int average =0;
       for(int i=0;i<arr.length;i++){
         sum +=arr[i];
       }
       average =sum/arr.length;
       System.out.println("Sum :" + sum);
       System.out.println("Average :" + average);
       
}
}
