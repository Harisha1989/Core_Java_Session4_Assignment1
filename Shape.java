import java.util.Scanner;
abstract class Figure //creation of Abstract Class with provided information in statement
{
	double dim1;
	double len,wid;
	abstract void findArea();
	abstract void findPerimeter();
}
class Circle extends Figure
{
	double cArea;
	double cPeri;
	
	void findArea() //Defining the abstract method
	{
		cArea=3.14*dim1*dim1;
		System.out.println("Area of the Circle - "+cArea);
	}
	void findPerimeter() //Defining the abstract method
	{
		cPeri=2*3.14*dim1;
		System.out.println("Perimeter of the Circle - "+cPeri);
	}
}
class Rectangle extends Figure 
{
	
	double rArea;
	double rPeri;
	void findArea() //Defining the abstract method
	{
		rArea=len*wid;
		System.out.println("Area of the Rectangle - "+rArea);
	}
	void findPerimeter() //Defining the abstract method
	{
		rPeri=2*(len+wid);
		System.out.println("Perimeter of the Rectangle - "+rPeri);
	}	
}
class Triangle extends Figure
{
	double tArea;
	double tPeri;
	void findArea()
	{
		tArea= (len*wid)/2; //Defining the abstract method
		System.out.println("Area of the Triangle - "+tArea);
	}
	void findPerimeter()
	{
		tPeri=dim1+len+wid; //Defining the abstract method
		System.out.println("Perimeter of the Triangle - "+tPeri);
	}
}
public class Shape 
{

	public static void main(String[] args) 
	{
		Figure f; //creating reference for Abstract class
		f=new Circle();	
		Scanner sc=new Scanner(System.in);
		System.out.println("*** The Area and Perimeter of Circle,Rectangle and Triangle ***");
		//providing input values for the variables of abstract class
		System.out.println("\nEnter radius of the Circle - ");
		f.dim1=sc.nextDouble();
		f.findArea(); //calling the abstract methods
		f.findPerimeter(); //calling the abstract methods
		f=new Rectangle();
		System.out.println("\nEnter length and width of the Rectangle -");
		f.len=sc.nextDouble();
		f.wid=sc.nextDouble();
		f.findArea(); //calling the abstract methods
		f.findPerimeter(); //calling the abstract methods
		f=new Triangle();
		System.out.println("\nEnter the dimensions of the Triangle -");
		f.dim1=sc.nextDouble();
		f.len=sc.nextDouble();
		f.wid=sc.nextDouble();
		f.findArea(); //calling the abstract methods
		f.findPerimeter(); //calling the abstract methods
		sc.close();
		
	}
}
