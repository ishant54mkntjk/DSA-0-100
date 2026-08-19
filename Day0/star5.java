public class star5 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n*2-1;i++){
            if(n>=i){
            //space
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            // star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            
            
        }
         else{
            //space
            for(int j=1;j<=i-n;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*(n*2-i)-1;k++){
                System.out.print("*");
            }
         }
            System.out.println();
        }

    }
}
