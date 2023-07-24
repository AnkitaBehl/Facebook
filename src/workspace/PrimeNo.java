package workspace;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int no=7;//   7-1=6   2,3,4,5,6
  int temp=0;
  for(int i=2;i<no-1;i++)
  {
	  if(no%i==0)
	  {
		  temp=temp+1;
	  }
  }
  if(temp==0) 
  {
	  System.out.println(no+"is prime no");
  }
  else
  {
	  System.out.println(no+"is not prime no");
  }
	}

}
