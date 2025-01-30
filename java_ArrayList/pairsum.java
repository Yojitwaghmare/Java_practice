import java.util.ArrayList;

public class pairsum {
    int p;

    public static boolean pair(ArrayList<Integer>height,int target){
        int lp=0;
        int rp=height.size()-1;
        while (lp!=rp) {
            if (height.get(lp)+height.get(rp)==target) {
                System.out.println(height.get(lp)+" "+height.get(rp));
                return true;
                
            }
            if (height.get(lp)+height.get(rp)<target) {
                lp++;
            }else{
                rp--;
            }
        }

        return false;
    }

    public static void main(String[] args) {  
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(4);
        height.add(5);
        height.add(6);
        System.out.println(pair(height,5));
        
    }
}
