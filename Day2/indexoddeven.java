package Day2;

public class indexoddeven {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};

        for(int i=0;i<x.length;i++){
            if(i%2==0){
                x[i] = x[i]*2;
            }
            else{
                x[i] = x[i]*10;
            }
            System.out.println(x[i]+ " ");
        }
    }
    
}
