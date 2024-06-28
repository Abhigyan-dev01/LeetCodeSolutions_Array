package practice;

import java.util.Scanner;

public class SortedArraysMedian {
public static void main(String[] args) {
	Scanner inScanner =new Scanner(System.in);
	System.out.println("Enter the Size of array1 and array2");
	int m=inScanner.nextInt();
	int n=inScanner.nextInt();
	
	int []arr1=new int[m];
	int []arr2=new int[n];
	
	System.out.println("Enter the numbers of array1");
	for(int i=0;i<m;i++)
	{
		arr1[i]=inScanner.nextInt();
	}
	System.out.println("Enter the numbers of array2");
	for(int i=0;i<n;i++)
	{
		arr2[i]=inScanner.nextInt();
	}
	double median=findMedianSortedArrays(arr1,arr2);
	System.out.println("The median is-"+median);

}


public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    double median;
    int i=0,j=0,k=0;
    int []array=createSortedArray(nums1, nums2);
    for(int m : array)
    {
    	System.out.println(m);    	
    }  
    
    int mid=(array.length-1)/2;
    
    if((array.length)%2==0) {
    	median=(double)(array[mid]+array[mid+1])/2;
    }
    else {
		median=(double)(array[mid]);
	}      
        return median;    
}

public static int[] createSortedArray(int num1[],int num2[])  // Uses Merge Sort MERGE method for O(nlogn)
{
	int i=0,j=0,k=0;
	int []tempArray=new int[num1.length+num2.length];
	while(i<num1.length && j<num2.length)
	{
		if(num1[i]<num2[j])
		{
			tempArray[k]=num1[i];
			i++;
			k++;
		}
		else {
				tempArray[k]=num2[j];
				j++;
				k++;
			
		}
	}
	while(i<num1.length)       // If any elements left in nums1 after first while loop
	{
		tempArray[k]=num1[i];
		i++;
		k++;
	}
	while(j<num2.length)        // If any elements left in nums2 after first while loop
	{
	{
		tempArray[k]=num2[j];
		j++;
		k++;
	}
	return tempArray;
}
}
