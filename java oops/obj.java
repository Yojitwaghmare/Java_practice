public class obj {
    
        public static void main(String[] args) {
            Pen p1 = new Pen();
            Account a1 =new Account();
            p1.setName("Yojit",42);
            p1.setName("waghmare",2);
            p1.name="yojit";
            System.out.println(p1.name);
            System.out.println(p1.rollno);
    
            a1.setDetail("Yojit",42);
            System.out.println(a1.getpassword());
    
        }
    }
    
    class Account{
        protected String name;
        private int password;
    
        void setDetail(String name, int password){
            this.name = name;
            this.password = password;
        }
    
        int getpassword(){
            return this.password;
        }
    }
    class Pen{
        String name;
        int rollno;
    
        void setName(String name, int rollno){
            this.name = name;
            this.rollno = rollno;
        }
    
    }

