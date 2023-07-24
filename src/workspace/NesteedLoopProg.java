package workspace;

public class NesteedLoopProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*for(int i=1; i<=4;i++)
{
	System.out.println("outer loop started");
}
for(int j=1; j<=4;j++)
{
	System.out.println("inner loop");
}
System.out.println("outer loop finished");
	
for(int i=1; i<=4;i++)
{
	System.out.println("outer loop started");
}*/

	/*int k=1;
	for(int i=1; i<6; i++)
	{
	
		for(int j=1; j<=i;j++)
{
	System.out.print(k);
	System.out.print("\t");
	k++;
	
}
System.out.println(" ");
	
	}

	}}*/



/*int k=1;
for(int i=1; i<4; i++)
{

	for(int j=1; j<=4-i;j++)
{
System.out.print(k);
System.out.print("\t");
k++;

}
System.out.println(" ");

}

}}*/


 int k=3;
for(int i=0; i<10; i=i+3)
{

	for(int j=1; j<=i;j=j+3)
{
System.out.print(k);
System.out.print("\t");
k=k+3;

}
System.out.println(" ");

}

}}