package InterviewPractice;

public class ReverseANo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=1234;
int rev=0;
int rem=0;
while(no!=0)
{
	rem=no%10;
	rev=rev*10+rem;
	no=no/10;
	
}


	System.out.println(rev);


	}

}
