// This program finds the indices of two numbers in an array whose sum is equal to a given number.

public class IndexofSubarray{
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5};
        int i,j,k;
        int n = 6;
        int sum=0;
        for(i=0;i<arr.length;i++){
            for(j=i;j<arr.length;j++){
                sum=0;
                for(k=i;k<=j;k++){
                    sum+=arr[k];
                    if(sum==n){
                        break;
                    } else if(sum>n){
                        break;
                    }
                }
                if(sum==n){
                    System.out.println("Sum found at from "+i+" to "+j);
                    break;
                }

            }  

        }
            
        if(sum!=n){ System.out.println(-1);}
              
    }
           
}

