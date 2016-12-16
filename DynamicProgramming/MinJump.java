// This module finds the minimun number of jump to the end of the array
// array value represents the steps of jumps possible 
// Time Complexity O(n^2)
// Space Complexity O(n)


public class MinJump{
	public int numberOfJumps(int[] input){
		int[] steps=new int[input.length];
		Arrays.fill(steps,Integer.MAX_VALUE);
		steps[0]=0;
		int min= Integer.MAX_VALUE;
		for(int i=1; i<input.length; i++){
			min=Integer.MAX_VALUE;
			for(int j=0; j<i; j++){
				if((i-j)<=input[j]){
					min=Math.min(min,steps[j]);
				}
			}
			steps[i]=min+1;
		}
		return steps[input.length-1];
	}
}