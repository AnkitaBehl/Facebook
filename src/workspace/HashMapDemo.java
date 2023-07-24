package workspace;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap m=new HashMap();
  m.put("Nitin",700 );
  m.put("Ankita", 1000);
  m.put("Ayush", 500);
  m.put("Ishan", 200);
  
  System.out.println(m);
  System.out.println(m.put("Ankita", 1500));
  
  Set s=m.keySet();
  System.out.println(s);
  
  Collection c=m.values();
  System.out.println(c);
  
  Set s1=m.entrySet();
  System.out.println(s1);
  
  System.out.println(m.put("Nitin", 1200));
  
  System.out.println(s1);
  
  Iterator itr=s1.iterator();
  while(itr.hasNext())
  {
	  Map.Entry m1=(Map.Entry)itr.next();
	  System.out.println(m1.getKey()+"....."+m1.getValue());
	  if(m1.getKey().equals("Ayush"))
	  {
		  m1.setValue(800);
	  }
  }
  System.out.println(m);
	  }
  
	}


