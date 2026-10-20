// // public class ReverseArraay {
// //     public static void main(String[] args){
// //        int arr[] ={1,43,5,9,3,0};
// //       int i=0;
// //       int j=arr.length-1;

  
// //        while(i<j){
// //             int temp =arr[i];
// //             arr[i]=arr[j];
// //             arr[j] =temp;
// //             System.out.print(arr);
// //             i++;
// //             j--;
            
// //          }
// //         //   System.out.print(arr[i]);
         
// //       System.out.println();
// //     }
// // }

// public class ReverseArraay {
//     public static void main(String[] args){
//        int arr[] ={1,43,5,9,3,0};
      
  
//        for(int i=0;i<j;i++){
//          for(int j=arr.length-1;j>i;j--){
//             int temp =arr[i];
//             arr[i]=arr[j];
//             arr[j] =temp;
//             System.out.print(arr[i]);
//          }
//         //   System.out.print(arr[i]);
//          }
//       System.out.println();
//     }
// }



public class ReverseArraay {
    public static void main(String[] args){
       int arr[] ={1,43,5,9,3,0};
      int j = arr.length-1;
  
       for(int i=0;i<j;i++){      
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j] =temp;
          j--;
         }

         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
         }
      
    }
}
