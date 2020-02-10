package calculator;
import java.util.*;

public class Mult 
{
	double num1,num2; 
	public Mult(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void result()
	{
		double product=num1*num2;
		System.out.println("The product of the numbers is:"+product);
	}
}
