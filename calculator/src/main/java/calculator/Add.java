package calculator;
import java.util.*;

public class Add 
{
	double num1,num2; 
	public Add(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void result()
	{
		double sum=num1+num2;
		System.out.println("The sum of the numbers is:"+sum);
	}
}