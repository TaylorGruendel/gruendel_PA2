import java.util.Scanner;

public class gruendel_p1 {
	public static int []encrypt(int M[])
	{
		int n=M.length;
		//New 4 digit number
		int N[]=new int[M.length];
		int temp;
		int i;
			
		for(i=0; i<M.length; i++)
		{
			N[i]=M[i];
		}
		for(i=0; i<n; i++)
		{
			N[i]=(M[i]+7)%10;
		}
			//flipping 1 & 3
			temp=N[0];
			N[0]=N[2];
			N[2]=temp;
				
			//flipping 2 & 4
			temp=N[1];
			N[1]=N[3];
			N[3]=temp;
			return N;
		}
	
	public static int []decrypt(int M[])
	{
		int N[]=new int[M.length];
		int temp;
		int n=M.length;
		int i;
		
		for(i=0; i<M.length; i++)
		{
			N[i]=M[i];
		}
		for(i=0; i<n; i++)
		{
			//converting the first two numbers back to 3 & 4
			if ((N[i]-7)<=0)
			{
				N[i]=M[i]+10;
			}
		}
		for(i=0; i<4; i++)
		{
			//converting the last two numbers back to 1 & 2
			N[i]=(N[i]-7)%10;
		}
		
			temp=N[0];
			N[0]=N[2];
			N[2]=temp;
			
			temp=N[1];
			N[1]=N[3];
			N[3]=temp;
			return N;
		}
	
	public static String Print(int M[])
	{
		//
		int i;
		for(i=0; i<4; i++)
		{
			System.out.print(M[i]);
		}
			System.out.println();
		return "";
	}
	  
	public static void main(String []args)
	{
		Scanner scnr=new Scanner(System.in);
	
		int N=Integer.parseInt(scnr.nextLine());
		int M[]=new int[4]; 
		int i;
		
		//Verifies each number is the correct number 
		for(i=0; i<4; i++)
		{
			M[3-i]=N%10;
			N=N/10;
		}
	
			System.out.println("Encrypted: ");
			Print(encrypt(M));
			System.out.println("Decrypted: ");
			Print(decrypt(encrypt(M)));
		}
	}