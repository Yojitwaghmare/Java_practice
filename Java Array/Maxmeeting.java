import java.util.Arrays;

public class Maxmeeting {

    public static void findmeetings(int startTime[], int endTime[],int n) {

        // int[] startTime = {5, 3, 0, 1, 8, 5};
        // int[] endTime = {7, 4, 6, 2, 9, 9};
        // int n = startTime.length;
        int count =0;
        int[] newStartTime = new int[n];
        int[] newEndTime = new int[n];

        // Initialize with the first element
        newStartTime[0] = startTime[0];
        newEndTime[0] = endTime[0];

        for (int i = 1; i < n; i++) {
            int currentDuration = endTime[i] - startTime[i];
            boolean inserted = false;

            // Traverse new arrays to find the correct position to insert
            for (int j = 0; j < i; j++) {
                int existingDuration = newEndTime[j] - newStartTime[j];
                if (currentDuration >= existingDuration) {
                    // Shift elements to the right
                    for (int k = i; k > j; k--) {
                        newStartTime[k] = newStartTime[k - 1];
                        newEndTime[k] = newEndTime[k - 1];
                    }
                    // Insert the current element
                    newStartTime[j] = startTime[i];
                    newEndTime[j] = endTime[i];
                    inserted = true;
                    break;
                }
            }
            // If not inserted, place at the end
            if (!inserted) {
                newStartTime[i] = startTime[i];
                newEndTime[i] = endTime[i];
            }
        }

        System.out.println(Arrays.toString(newStartTime));
        System.out.println(Arrays.toString(newEndTime));

       int prend=0;
       for(int i=n-1;i>0;i--){
           if(newEndTime[i]>newStartTime[i]&&newStartTime[i]>prend){
               prend=newEndTime[i];
               count++;
           }
       }
       System.out.println(count);
        
    //     if (startTime[n-1]==endTime[0]) {
    //         System.out.print("("+newStartTime[n-1]+","+newEndTime[n-1]+")");   
    //     }
    //     else{
    //          int i=1;
    //          while (count<lastStartTime&&(n-i)>0) {
    //          count += newEndTime[n-i] - newStartTime[n-i];
    //          System.out.print("("+newStartTime[n-i]+","+newEndTime[n-i]+")");
    //          i++;
    //         }
    //    }
    
    }
    public static void main(String[] args) {
    // int[] startTime = {5, 3, 0, 1, 8, 5};
    // int[] endTime = {7, 4, 6, 2, 9, 9};
    int[] startTime={75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
    int[] endTime={112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252};
    findmeetings(startTime, endTime,8);
    }
}
