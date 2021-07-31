package functional;
import java.util.*;
public class ArrayTriplets 
{
	
	public static void main(String[] args) 
	{
		int i,size;
		System.out.println("Enter size of an array:");
		Scanner s=new Scanner(System.in);
		size=s.nextInt();
		int array[]=new int[size];
		System.out.println("Enter elements in array:");
		for(i=0;i<size;i++)
		{
			array[i]=s.nextInt();
		}
		s.close();
		triplets(array, size);

	}
	static void triplets(int arr[],int size)
	{
		int count=0;
		for(int i=0;i<size-2;i++)
		{
			for(int j=i+1;j<size-1;j++)
			{
				for(int k=j+1;k<size;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						count++;
						System.out.println("The triplets are:");
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
				
					}
				}
			}
		}
		System.out.println("Number of triplets:"+count);
	}
}
