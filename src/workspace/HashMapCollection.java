package workspace;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<String,Integer> map=new HashMap<>();
 map.put("Rahul", 10);
 map.put("Ayush", 30);
 map.put("Ishan", 20);
 System.out.println(map);
 Set s1=map.entrySet();
 System.out.println(s1);
 /*if(map.containsKey("nitin"))
 {
	 Integer a = map.get("nitin");
	 
 }
 
 else
 {
	System.out.println("ayush best brother");
	
	
 }
 System.out.println("i love you");*/
 
 Iterator itr=s1.iterator();
 while(itr.hasNext())
 {
	  Map.Entry m1=(Map.Entry)itr.next();
	  System.out.println(m1.getKey()+"....."+m1.getValue());
	  if(m1.getValue().toString().equals("10"))
	  {
		  System.out.println("i love you ");
	  }
 }
 //System.out.println(map);

	}}
