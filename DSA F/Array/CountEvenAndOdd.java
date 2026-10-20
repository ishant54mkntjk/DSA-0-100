public class CountEvenAndOdd {
    public static void main(String[] args){
       int arr[] ={1,43,5,9,3,0};
  
          int even= 0;
          int odd =0;
       for(int i=0;i<arr.length;i++){
          if(arr[i]%2==0){
            even++;
          }
          else{
            odd++;
          }
       }
      
       System.out.println("Even :" + even);
       System.out.println("Odd :" + odd);
       
}
}
