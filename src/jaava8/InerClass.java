package jaava8;

public class InerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee() {
			public String getSalary() {
				return "100";
			}
			public String getDesignation() {
				return "Rehan";
			}
		};
System.out.println(e.getSalary()+" " +e.getDesignation());
	}

}

