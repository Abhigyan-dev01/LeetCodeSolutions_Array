package leetcodeSolutions;
import java.util.*;

public class MinDifferenceBetweenLargestAndSmallestInArray {
    private int[] nums;

    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n=in.nextInt();

        int []arr1=new int[n];


        System.out.println("Enter the numbers of array");
        for(int i=0;i<n;i++)
        {
            arr1[i]=in.nextInt();
        }
        int difference=minDifference(arr1);
        System.out.println("The difference between maximum and minimum element is="+difference);
        System.out.println(Integer.MAX_VALUE);
    }


    public static int minDifference(int[] nums) {
        if(nums.length<=4)
            return 0;
        else
        {
            Arrays.sort(nums);
            int minimumDifference = Integer.MAX_VALUE;
            for (int i = 0; i <= 3; i++) {
                minimumDifference = Math.min(minimumDifference, nums[nums.length - 1 - (3 - i)] - nums[i]);
            }
            return minimumDifference;
        }
        }


}
