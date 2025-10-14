package String;

public class Main {

	
	 String name;
	    int age;
	    Main(String name, int age){
	        this.name=name;
	        this.age=age;
	    }
	    
	    public static void main(String[] args) {
	        Main s1 = new Main("durga",101);
	        Main s2 = new Main("ravi",102);
	        String s5 =new String("durga");
	        
	       
	        System.out.println(s1.equals(s5));
	    }
	
}
