import java.util.ArrayList;
public class parisumrotated {

    private static boolean rotated(ArrayList<Integer> height, int target) {
        int lp=0;
        int rp=0;
        int n=height.size();
        
        for (int i = 0; i < height.size(); i++) {
            // if (i==height.size()-1) {
            //     System.out.println("not");
            //     return false;
            // }
            if (height.get(i)>height.get(i+1)) {
                lp=i+1;rp=i;
                break;
            }
        }
        while (lp!=rp) {
            if (height.get(lp)+height.get(rp)==target) {
                System.out.println(height.get(lp)+" "+height.get(rp));
                return true;
                
            }
            if (height.get(lp)+height.get(rp)<target) {
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
            }
        }

        return false;

    }
    public static void main(String[] args) {  
        ArrayList<Integer>height=new ArrayList<>();
        height.add(11);
        height.add(15);
        height.add(16);
        height.add(4);
        height.add(10);
        System.out.println(rotated(height,16));
    }
}
