import java.util.Arrays;

public  class sorting {
    public static void main(String[] args) {
        Job[] arr = {
            new Job(1, 4, 20),
            new Job(2, 1, 1),
            new Job(3, 1, 40),
            new Job(4, 1, 30)
        };
         Arrays.sort(arr, (a, b) -> b.profite - a.profite);
         System.out.println(Arrays.toString(arr));
    }
}

 class Job{
    int id,deadline,profite;
    Job(int x,int y,int z){
        this.id=x;
        this.deadline=y;
        this.profite=z;
    }
    @Override
    public String toString() {
        return "Job ID: " + id + ", Deadline: " + deadline + ", Profit: " + profite;
    }
}

