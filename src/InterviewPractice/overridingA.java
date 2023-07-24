package InterviewPractice;

public class overridingA {
	
	    public void testing()
	{
		 System.out.println("software");
	}
}
  class base extends overridingA
{
	
	    public void testing()
	    {
	    	System.out.println("software+testing");
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
overridingA a=new overridingA();
a.testing();
base b=new base();
b.testing();
	}

}
