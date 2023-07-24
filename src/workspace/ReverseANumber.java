package workspace;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int no=698215;
   int rem=0;
   int rev=0;
   
   while(no!=0)
   {
	   rem=no%10;
	   rev=rev*10+rem;
	   no=no/10;
	   
   }
   
   System.out.println(no);
   
   System.out.println(rev);
	}
	
	static
	{
		System.out.println("i love ankita");
	}
	
	static
	{
		System.out.println("nitin loves ankita");
	}

}
