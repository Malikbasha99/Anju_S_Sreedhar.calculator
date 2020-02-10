package calculator;
import java.util.*;

public class Div 
{
	double num1,num2; 
	public Div(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void result()
	{
		double quotient=num1/num2;
		System.out.println("The quotient of the numbers is:"+quotient);
	}
} 
