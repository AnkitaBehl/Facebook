package workspace;

public class Virat {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
  String s = "Ankita love Nitin";
  String[] splittedString = s.split(" ");
 // System.out.println(splittedString[0]);
 // System.out.println(splittedString[1]);
 // System.out.println(splittedString[1].trim());
  for(int i=splittedString.length-1;i>=0;i--)
  {
	  System.out.println(splittedString[i]);
  }
	}

}