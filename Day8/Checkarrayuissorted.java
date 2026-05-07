package Day8;

public class Checkarrayuissorted {
    public static void main(String[] args){
      int[] arr ={1,12,4,66,4};
      boolean result =false;
      for(int i=1;i<arr.length-1;i++){
        if(arr[i-1]>arr[i]){
            result =false;
        }
      }
      if(result==false){
      System.out.println("Not Sorted");
      }
      else{
      System.out.println("Sorted");
      }
    }
    
}
