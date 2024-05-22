package array;

import java.util.Arrays;

public class SquareOfSortedArray {

	public static void main(String[] args) {
		int[] nums= {-4,-1,0,3,10};
		System.out.println(Arrays.toString(sortedSquare(nums)));
	}
	public static int[] sortedSquare(int [] nums) {
		int[] ans= new int[nums.length];
		int i=0;
		int j= nums.length-1;
		for(int k= nums.length-1; k>=0; k--) {
			int comp1=nums[i]*nums[i];
			int comp2=nums[j]*nums[j];
			if(comp1>comp2) {
				ans[k]=comp1;
				i++;
			}else {
				ans[k]=comp2;
				j--;
			}
		}
		return ans;
	}
}
