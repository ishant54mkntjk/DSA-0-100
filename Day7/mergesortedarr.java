package Day7;

public class mergesortedarr {
    public static void main(String[] args){
        int[] a ={2,5,6,9};
        int[] b ={1,3,4,7};
        int n =a.length;
        int m =b.length;
        int p =n+m;
        int[] c =new int[p];

        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(a[i]>b[j]){
                c[k] =b[j];
                 j++;
            }
            else{
                c[k]=a[i];
                i++;
            }
            k++;
        }
            while(j<m){
                c[k] =b[j];
                j++;
                k++;
            }
                while(i<n){
                c[k] =a[i];
                i++;
                k++;
            }
            for(int ele: c){
                System.out.print(ele+" ");
            }
    }
    
}
