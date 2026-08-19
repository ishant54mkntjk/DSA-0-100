public class star4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n*2-1;i++){
            if(i<=n){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }  
            for(int j=1;j<=n*2-(2*i-1);j++){
                System.out.print("*");             
            }        
            System.out.println();
            }
        else{
            for(int k=0;k<=n*2-i-1;k++){
                System.out.print(" ");
            }          
            for(int j=1;j<=i*2-(n*2-1);j++){
                System.out.print("*");              
            }
                     
            System.out.println();
        }
    }
        
    }
}
