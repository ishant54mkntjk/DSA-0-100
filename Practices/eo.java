import java.util.*;
public class eo {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();   
        int row =1;
        // int var1 =0;
        // int var2=1;
        while(row<=n){
            int i =1;
            
            while(i<=row){
                if (row%2==0  ){
                    if(i%2!=0){
                    System.out.print("0 ");
                    }
                    else if(i%2==0){
                        System.out.print("1 ");
                    }
                }
                else{
                    if(i%2==0){
                        System.out.print("0 ");
                    }
                    else{
                    System.out.print("1 ");
                    }
                }
               
                i++;
            }
            // new line
         row++;
         System.out.println("");              
        }     
     sc.close();   
    }
    
}

