package practice;

import java.util.Arrays;
import java.util.Scanner;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order. */

public class TwoSum {
	
	public static int[] twoSum(int []a,int target) {
		int []temp=new int[2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					temp[0]=i;
					temp[1]=j;
				}
			}
		}
		
		return temp;
		
	}
public static void main(String []args) {
	Scanner inScanner =new Scanner(System.in);
	System.out.println("Enter number of elements");
	int []a=new int[inScanner.nextInt()];
	System.out.println("Elements");
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=inScanner.nextInt();
	}
	System.out.println("Enter the target");
	int target=inScanner.nextInt();
	
	int ret[]=twoSum(a,target);
	System.out.println(Arrays.toString(ret));
	
	
}
}
