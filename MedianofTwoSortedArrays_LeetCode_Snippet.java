class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median;
    int i=0,j=0,k=0;
    int []array=createSortedArray(nums1, nums2);  
    int mid=(array.length-1)/2;    
    if((array.length)%2==0) {
    	median=(double)(array[mid]+array[mid+1])/2;
    }
    else {
		median=(double)(array[mid]);
	 } 
    return median;      
    }

  public static int[] createSortedArray(int num1[],int num2[])   //Using Merge sort Merging Method
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
	while(i<num1.length)     //If the array num1 has still left with elements after first while loop
	{
		tempArray[k]=num1[i];
		i++;
		k++;
	}
	while(j<num2.length)    //If the array num2 has still left with elements after first while loop
	{
		tempArray[k]=num2[j];
		j++;
		k++;
	}
	return tempArray;
}

}
