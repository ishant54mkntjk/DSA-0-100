package Day7;

public class addingOne {
    public static void main(String[] args){
    int[] nums ={9,9,9};
    int n =nums.length;

    int[] arr =new int[n];
    int carry=1;

    for(int i=n-1;i>=0;i--){
        if(nums[i] +carry<=9){
            arr[i]= nums[i]+carry;
            carry =0;
        }
        else{
            arr[i]= 0;
            carry =1;
        }
    }

        // if carry remains → new array
    if(carry == 1){
        int[] newarr= new int[n+1];
        newarr[0] =1;
        for(int num :newarr){
        System.out.print(num+" ");
        }
        return;
    }
    for(int num: arr){
    System.out.print(num+" ");
    }
    }  
}
