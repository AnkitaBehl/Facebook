package workspace;

public class overridingA {
	public void Testing()
		{
		System.out.println("hello");
		}
}
	class base extends overridingA
	{
		
		public void Testing()
		{
		System.out.println("Testing Test");
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	overridingA a=new overridingA();
	a.Testing();
	base b=new base();
	b.Testing();
				
	}

}
