
public class occurence {
    public static int indexof(int arr[],int i,int value){ 
        if (i==arr.length) {
          return -1;
        }
        if(arr[i]==value){
            return i;
        }
        return indexof(arr, i+1,value);
    }

    public static int lastindexof(int arr[],int i,int value){ 
        if (i==arr.length) {
          return -1;
        }
        int val=lastindexof(arr,i+1,value);

        if(val ==-1 && arr[i]==value){
            return i;
        }
        
        return val;
    }

    public static void lastfirstindexof(int arr[],int i,int value){ 
        if (i==arr.length) {
          return;
        }
        if(arr[i]==value){
            System.out.println(i);
        }
        lastfirstindexof(arr,i+1,value);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,5,7,8};
        lastfirstindexof(array,0,5);
        
    }
}
