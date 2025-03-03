public class compression {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        String str="abbbcccdde";
        
        for (int i = 0; i < str.length(); i++) {

            char c =str.charAt(i);
            int count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
                count++;
                i++; 
            }
            sb.append(c);
            if (count>1) {
                sb.append(count); 
            }
            
        }
        System.out.println(sb.toString());
    }
}
