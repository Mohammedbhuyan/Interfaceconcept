import java.util.ArrayList;
import java.util.Hashtable;

public class arraylistvshashtable {

	public static void main(String[] args) {
ArrayList ar = new ArrayList();
ar.add(100);
ar.add(200);
ar.add(400);
ar.add("hello selenium");
System.out.println(ar.size());
ar.add('h');
ar.add(12.33);
ar.add(90);
for(int i = 0;i<ar.size();i++) {
	System.out.println(i);
}
Hashtable h = new Hashtable();
h.put('a', 100);
h.put('b', 200);
h.put('c', 300);
System.out.println(h);

h.put(1, 900);
h.put("tom", 1979);
h.remove('c');







		
		
		
		
		
		
		
	}

}
