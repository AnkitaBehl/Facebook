package InterviewPractice;

public class ReverseALine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Niku Loves Anku";
String rev=" ";
String[] s1=name.split(" ");
for(int i=s1.length-1;i>=0;i--)
{
	rev=rev+s1[i];
}
System.out.println(rev);

	}

}
