package workspace;

public class MultiDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		a[1][0]=7;
		a[1][1]=8;
		a[1][2]=9;
		
		//System.out.println(a[0][2]);
		for(int i=0;i<a.length;i++)
		for(int j=0;j<a[i].length;j++)
		{
			System.out.println(a[i][j]+"");
		}

	}

}
