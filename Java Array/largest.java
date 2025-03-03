

public class largest {
    public static void main(String[] args) {
        String[] name={"apple","mango","andro"};
        String largest=name[0];
        int index=0;
        for (int i = 1; i <name.length; i++) {
            int num = largest.compareTo(name[i]);
            if (num < 0) {
                largest=name[i];
                index=i;
            }
            
            
            }
            for (int i = index; i < name.length-1; i++) {
                 if(largest.length()< name[index+1].length()){
                      largest=name[index+1];
                       index=index+1;
                    }
       
            }
        System.out.println(largest);
    }
}
