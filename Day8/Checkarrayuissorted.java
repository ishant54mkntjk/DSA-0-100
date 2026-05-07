package Day8;

public class Checkarrayuissorted {
    public static void main(String[] args){
      int[] arr ={1,1,2,2,33,88};
      boolean result =true;
      for(int i=1;i<arr.length;i++){
        if(arr[i-1]>arr[i]){
            result =false;
        }
      }
      if(result){
      System.out.println("Sorted");
      }
      else{
      System.out.println("Not Sorted");
      }
    }
    
}
