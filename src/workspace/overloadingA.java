package workspace;

public class overloadingA {
	public void Testing()
	{
		System.out.println("hi anku");
	}
	public void Testing(String a)
	{
		System.out.println("Niku+Anku");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			overloadingA a=new overloadingA();
					a.Testing();
					a.Testing("abc");
		}
	}

}
