package Binary_Search_01;

/**
 *Ashim Nepal
 * 01. Binary Search Algorithm! 
 */
public class Binary_Search {
	
	public static int binarySearch(int[] nums, int target) {
		//Searching space is nums[left...right]
		int left = 0;
		int right = nums.length-1;
		//loop for search in array
		while(left <= right) {
			int mid = (left+right)/2;
			if(target == nums[mid]) {
				return mid;
			}
			
			else if(target<nums[mid]) {
				right=mid-1;
			}
			else {
				left=mid+1;
			}
		}
		return -1; 
	}

	public static void main(String[] args) {
		
		int[] nums= {2,6,4,7,8,1};
		int target = 4;
		
		int index= binarySearch(nums,target);
		
		if(index != -1) {
			System.out.println("Element found at index:"+index);
			
		}
		else {
			System.out.println("Element not found!");
		}

	}

}
