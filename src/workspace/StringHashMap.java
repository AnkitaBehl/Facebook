package workspace;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StringHashMap {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="jkjkjkkqqqsdddgg";
		
		
		char[] strArray= input.toCharArray();
		HashMap<Character,Integer>map=new HashMap<Character,Integer>();
		for(char c:strArray)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
				
			}
			else
			{
				map.put(c, 1);
			}
		}
		
	
System.out.println(map);
		
		
	
	}}


