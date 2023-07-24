package workspace;

import java.util.Scanner;

public class forLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print no 1 to 10
 /*for(int i=1;i<=10;i++)
 {
	 System.out.println(i);
 }
 
 //calculate the sum of first 10 natural number
 int sum =0;
 
 for(int i=1;i<=10;i++)
 {
	 sum +=i;
	 
 }
 System.out.println("Sum:" +sum);*/
	
	
		Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
       
        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }
        
        System.out.println("Factorial: "+ fact);

}}
