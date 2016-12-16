/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1

*/


public class Solution{

	public static void main(String[] args){
	int[] arr={1,2,3};
	int swapIndex=arr.length-1;
	boolean swapFlag=false;
	for(int i=arr.length-1; i>0; i--){
			if(arr[i]>arr[i-1]){
				swapIndex=i-1;
				swapFlag=true;
				break;
			}

		}
		if(swapFlag){
			int min=Integer.MAX_VALUE;
			int minIndex=arr.length-1;
			for(int i=swapIndex+1; i<arr.length; i++){
				if(arr[swapIndex]<arr[i] && min>arr[i]){
					min=arr[i];
					minIndex=i;
				}
			}
			// Swap the value with swapIndex
			int temp=arr[swapIndex];
			arr[swapIndex]=arr[minIndex];
			arr[minIndex]=temp;


			// Create temp Array
			int[] tempArr= new int[arr.length-1-swapIndex];
			for(int i=0; i<tempArr.length; i++){
				tempArr[i]=arr[swapIndex+1+i];
			}

			Arrays.sort(tempArr);

			for(int i=0; i<tempArr.length; i++){
				arr[swapIndex+1+i]=tempArr[i];
			}
		}
		else{
			Arrays.sort(arr);
		}

		for(int w: arr){
				System.out.println(w);
			}
	}
}
