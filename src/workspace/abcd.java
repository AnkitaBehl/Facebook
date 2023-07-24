package workspace;

public class abcd {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String str="nitin";
		int[] freq=new int[str.length()];
		int i,j = 0;
		
	 char string[]=str.toCharArray();
	 for(i=0;i<str.length();i++)
	 {
		freq[i]=1;
		 for(j=j+1;j<str.length();j++) {
			 if(string[i]==string[j])
			 {
				 freq[i]++;
				 //string[j]='0';
			 }
		 }
	 }
				 System.out.println("hi how r u");
				 for(i=0;i<freq.length;i++)
				 {
					 if(string[i]!=' '&&string[i]!='0')
						 System.out.println(string[i] +"-"+freq[i]);
				 }			 
		 }	

}
