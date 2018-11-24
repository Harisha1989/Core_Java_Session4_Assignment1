import java.util.Scanner;
class Even
{
	public static void main(String args[])
	{
		int[] num; // Declaring Array for the numbers
		Scanner sc=new Scanner(System.in);
		num = new int[10]; // providing array size as per the statement
		System.out.println("*** Print Even Numbers ***");
		for(int i=0;i<num.length;i++)//loop for taking the values into array
		{
			System.out.println("Enter the number");
			num[i]=sc.nextInt();
		}
		System.out.println("The numbers entered are - ");

		for (int i=0;i<num.length;i++)//loop for printing the array
		{
			System.out.print(+num[i]+",");
		}
		System.out.println("\nThe Even numbers are - "); 
		for (int i=0;i<num.length;i++)//loop for checking the EVEN numbers 
		{
			if((num[i]%2)==0)
			{
				System.out.print(+num[i]+",");
			}
		}
		sc.close();	
	}
}