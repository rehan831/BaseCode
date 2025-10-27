package collection;

import java.util.Hashtable;

public class HashtableDemo2 {
	public static void main(String [] args) {
		
		
		Hashtable h = new Hashtable();
		h.put(new aadi(5),"A");
		h.put(new aadi(2),"B");
		h.put(new aadi(6),"C");
		h.put(new aadi(15),"D");
		h.put(new aadi(23),"E");
		h.put(new aadi(16),"F");
		System.out.println(h);
		
	}

}
class aadi{
	int i;
	aadi(int i){
		this.i=i;
	}
	public int hashcode() {
		return i % 9;
	}
	public String toString() {
		return i +" ";
	}
}
