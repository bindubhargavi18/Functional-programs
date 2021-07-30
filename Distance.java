package functional;
import java.util.*;
public class Distance 
{
	public static void main(String[] args) 
	{
		double x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x co-ordinate:");
		x=s.nextDouble();
		System.out.println("Enter y co-ordinate:");
		y=s.nextDouble();
		s.close();
		System.out.printf("Euclidean distance: %.2f",euclideanDistance(x,y));
		
	}
	static double euclideanDistance(double x,double y)
	{
		double distance;
		distance=Math.sqrt((x*x)+(y*y));
		return distance;
	}

}
