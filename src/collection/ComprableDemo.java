package collection;
import java.util.*;
public class ComprableDemo {

	public static void main(String[] args) {
		TreeSet<Student> list = new TreeSet<Student>();
list.add(new Student(3,"rehan"));
list.add(new Student(5,"affa"));
list.add(new Student(5,"affa"));
//Collections.sort(list);
System.out.println(list);


	}

}
class Student implements Comparable<Student>{
int id;
String name;

Student(int id, String name){
	this.id=id;
	this.name=name;
}

	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if(id == s.id)
		return 0;
		else if(id>s.id) 
			return 1;
		else
			return -1;
	}
	public String toString() {
		return id +" " +name;
	}
}
