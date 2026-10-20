// public class CheckArraySorted {
//      public static void main(String[] args){
//        int arr[] ={1,43,5,9,3,0};
      
//        boolean sorted =false;
//        for(int i=0;i<arr.length;i++){      
//             if(arr[i]<arr[i-1]){
//                 boolean sorted =false;
//                 break;
//             }
            
//        }
//        System.out.println("Array is :"+ sorted);
//     }
      
// }


public class CheckArraySorted {
     public static void main(String[] args){
       int arr[] ={1,3,3,5,6};
      
       boolean sorted =true;
       for(int i=1;i<arr.length;i++){      
            if(arr[i]<arr[i-1]){
            //   System.out.println("Array is not Sorted");
              sorted =false;
            }
        }
    if( sorted == false){System.out.print("Array is not sorted");}
       else {System.out.print("Array is sorted");}
    }
      
}
