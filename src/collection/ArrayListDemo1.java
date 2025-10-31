package collection;
import java.util.*;
import java.util.stream.*;


public class ArrayListDemo1 {

	public static void main(String[] args) {
		
List<String> list = new ArrayList();
//add()
list.add("Rehan");
list.add("Faizan");
list.add("Ayyube");
list.add(1,"Affan");
System.out.println(list);
//add all ()
List<String> moreNames = Arrays.asList("Mohd", "Ansari");
list.addAll(moreNames);
System.out.println(list);
//get()
System.out.println("Elemnet index of 2:"+list.get(2));

//set()
list.set(2,"Faisal");
System.out.println("After replace "+list);

//contains()
System.out.println("first index of 'Rehan'"+ list.indexOf("Rehan"));
System.out.println("first index of 'Rehan'"+ list.lastIndexOf("Mohd"));
//size
System.out.println("Size of list: " + list.size());
//empty
System.out.println("Is list empty? " + list.isEmpty());
//remove
list.remove("Faizan");
list.remove(0);
System.out.println("after remove"+list);
//removeAll
list.removeAll(Arrays.asList("Rehan"));
System.out.println("after remove all"+list);

list.retainAll(Arrays.asList("Affan","Ansari"));
System.out.println("Reatin all"+list);

// add all again
list.addAll(Arrays.asList("Reahn","Faizan","Ayyube","Mohd"));
System.out.println(list);
//sub
List<String> sub = list.subList(1, 3);
System.out.println("sublist(1,3)"+sub);

//iterator
System.out.println("using ietrator");
Iterator<String> it = list.iterator();
while(it.hasNext()) {
	System.out.println(it.next()+" ");
}
	ListIterator<String> lit = list.listIterator();
    System.out.print("Forward ListIterator: ");
    while (lit.hasNext()) {
        System.out.print(lit.next() + " ");
    }

    System.out.println();
    System.out.print("Backward ListIterator: ");
    while (lit.hasPrevious()) {
        System.out.print(lit.previous() + " ");
    }
    System.out.println();
    System.out.print("Using forEach lambda: ");
    list.forEach(name -> System.out.print(name + " "));
    System.out.println();
    
    Object[] arr = list.toArray();
    System.out.println("Converted to Array: " + Arrays.toString(arr));

    System.out.println("Using Stream filter (starts with 'A'): ");
    list.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

    list.removeIf(name -> name.length() < 5);
    System.out.println("After removeIf (names <5 chars): " + list);

    list.replaceAll(name -> name.toUpperCase());
    System.out.println("After replaceAll (to upper case): " + list);

    list.sort(Comparator.naturalOrder());
    System.out.println("After sort: " + list);
    list.clear();
    System.out.println("After clear: " + list);
    
    System.out.println("Is list empty now? " + list.isEmpty());
	}

}
