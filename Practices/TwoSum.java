import java.util.*;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];

        // input
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        // step 1: sort
        Arrays.sort(nums);

        int i = 0, j = n - 1;
        boolean found = false;

        while(i < j){
            int sum = nums[i] + nums[j];

            if(sum == target){
                System.out.println(nums[i] + " " + nums[j]);
                found = true;
                break;
            }
            else if(sum > target){
                j--;
            }
            else{
                i++;
            }
        }

        if(!found){
            System.out.println("No pair found");
        }
    }
}