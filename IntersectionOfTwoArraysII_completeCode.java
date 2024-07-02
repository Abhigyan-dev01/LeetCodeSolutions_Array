import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionoftwoArraysII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array1");
        int[] arr1 = new int[in.nextInt()];
        System.out.println("Enter the size of array2");
        int[] arr2 = new int[in.nextInt()];

        System.out.println("Insert numbers to array1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        System.out.println("Insert numbers to array2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
        }

        int[] intsecArray = intersect(arr1, arr2);
        System.out.print(Arrays.toString(intsecArray));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        int i=0,j=0,k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                res.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
        }

        int result[]=new int[res.size()];
        for(int x : res)
        {
            result[k++]=x;
        }
        return result;
    }
}
