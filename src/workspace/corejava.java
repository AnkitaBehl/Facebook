package workspace;

import java.util.ArrayList;

public class corejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr2= {1,2,3,4,5,6,7,8,9,20,30};
for(int i=0;i<arr2.length;i++)
{
	if(arr2[i] % 2 ==0)
	{
		System.out.println(arr2[i]);
	}
	else
	{
		System.out.println(arr2[i] + "is not matching with 2");
	}
	
}
ArrayList<String> a = new ArrayList<String>();
a.add("Ankita");
a.add("Love");
a.add("nitin");
a.add("Ankuniku");
System.out.println(a);
}

}
