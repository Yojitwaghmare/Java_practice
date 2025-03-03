import java.util.ArrayList;

public class TwodArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> masterlist =new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=1;i<=5;i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        } 
        
        masterlist.add(list1);
        masterlist.add(list2);
        masterlist.add(list3);

        for (int i = 0; i < masterlist.size(); i++) {
            ArrayList<Integer> current = masterlist.get(i);
            for (int j = 0; j < current.size(); j++) {
                System.out.print(current.get(j)+" ");
            }
            System.out.println();
        }
    }
}
