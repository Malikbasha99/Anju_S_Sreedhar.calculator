import calculator.Add;
import calculator.Div;
import calculator.Mult;
import calculator.Sub;
import java.util.*;
public class Driver {

		public static void main(String[] args) 
		{
			int Operation;
			System.out.println("Enter the operation you want to be performed on two numbers:"
					+ "1:Addition 2:Subtraction 3:Multiplication 4:Division");
			Scanner s=new Scanner(System.in);
			Operation=s.nextInt();
			if(Operation==1)
			{
				Add a=new Add(15.0,12.0);
				a.result();
			}
			if(Operation==2)
			{
				Sub b=new Sub(12.0,15.3);
				b.result();
			}
			if(Operation==3)
			{
				Mult c=new Mult(12.0,5.0);
				c.result();
			}
			if(Operation==4)
			{
				Div d=new Div(15.0,3.0);
				d.result();
			}
			
		}

	}


