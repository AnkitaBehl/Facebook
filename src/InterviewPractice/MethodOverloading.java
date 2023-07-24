package InterviewPractice;

public class MethodOverloading {
    public void testing()
{
	 System.out.println("software");
}
    public void testing(String a)
    {
    	System.out.println("software+testing");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  MethodOverloading a=new MethodOverloading();
  a.testing("abc");
  
	}

}
