package functional;

import java.util.*;

public class QuadraticRoots 
{
	public static void main(String[] args) 
	{
		double a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		a=s.nextDouble();
		System.out.println("Enter b value: ");
		b=s.nextDouble();
		System.out.println("Enter c value:");
		c=s.nextDouble();
		s.close();
		QuadraticRoots qr=new QuadraticRoots();
		qr.qudraticRoots(a, b, c);
	}
	public void qudraticRoots(double a,double b,double c)
	{
		double delta;
		delta=(b*b)-(4*a*c);
		double root1,root2;
		if(delta>0)
		{
			root1=(-b+Math.sqrt(delta))/(2*a);
			root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.printf("Root1: %.2f, Root2: %.2f", root1, root2);
		}
		else if(delta==0)
		{
			root1=root2=-b/(2*a);
			System.out.printf("Root1: %.2f, Root2: %.2f", root1, root2);
		}
		else
			System.out.println("Roots are imaginary");		
	}

}
