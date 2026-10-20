
public class largestelement{
    public static void main(String[] args){
       int arr[] ={1,43,5,9,3,0};
  
          int largest =0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest =arr[i];
        }
       }
       System.out.println("Largest Element :" + largest);
    }
}