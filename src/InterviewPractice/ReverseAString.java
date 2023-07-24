package InterviewPractice;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Ankita";
int length=name.length();
String rev="";
for(int i=length-1;i>=0;i--)
{
	rev=rev+name.charAt(i);
}
System.out.println("reverse of"+name+"is"+rev);
	}

}
