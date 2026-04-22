package Day2;

public class twosum {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int target = 5;
        int i = 0;
        int j = x.length-1;
        while(i<j){
                if(x[i]+x[j]==target){
                    System.out.println("Pair found: "+x[i]+" and "+x[j]);
                    i++;
                    j--;
                    
                }
                else if(x[i]+x[j]<target){
                    i++;
                }
                else{
                    j--;
                }   
            }
        }
    }
    

