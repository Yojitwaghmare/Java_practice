import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// import java.util.List;
public class Noofmeeting {
   


    public static int countIntervals(int[] start, int[] end) {
        ArrayList<int[]> intervals = new ArrayList<>();

        // Creating intervals with end, start, and index
        for (int i = 0; i < start.length; i++) {
            intervals.add(new int[]{end[i], start[i], i});
        }

        // Sorting the intervals based on their end time
        Collections.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        int limit = intervals.get(0)[0];
        int count = 1;

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i)[1] > limit) {
                count++;
                limit = intervals.get(i)[0];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int result = countIntervals(start, end);
        System.out.println("Number of non-overlapping intervals: " + result);
    
    }
}

