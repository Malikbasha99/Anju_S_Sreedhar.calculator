package calculator;
import java.util.*;
public class Sub 
{
	double num1,num2; 
	public Sub(double num1,double num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	public void result()
	{
		double diff;
		if(num1<num2)
			diff=num2-num1;
		else
			diff=num1-num2;
		System.out.println("The difference of the numbers is:"+diff);
	}
	}
