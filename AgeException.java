import java.util.Scanner;

@SuppressWarnings("serial")
class NegativeAgeException extends Exception//Inheriting the Super class Exception
{
	NegativeAgeException(String a)
	{
		System.out.println(a);
	}
}
public class AgeException
{	
	//if user inputs a negative value for age then user defined exception should be thrown
    @SuppressWarnings("resource")
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt(); //user inputs the age
		
		try //try block used for validating the age
		{  	
			if(age<0)
				//here a user defined "NegativeAgeException" exception is created, it means a class.
				//that means it acts as a subclass
				throw new NegativeAgeException("Entered age is Invalid");
			else
				System.out.println("Entered age is "+age);
		}
		catch(Exception e) //on failure of the condition the exception is caught
		{
			System.out.println("Age of a person cannot be less than 0");        
		}
     sc.close();
	}
}