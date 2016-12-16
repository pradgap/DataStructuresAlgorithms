package sortingAlgo;

import java.util.Arrays;

public class CoutingSort {
	static public void main(String[] args){
		int arr[]={3,6,7,2,4,9,1,5,3,4,4,2,3,2,3,6,5,8};
		int len=arr.length;
		
//		1. Count the frequency		
		int count[]= new int[10];
		Arrays.fill(count, 0);
		
		for(int i=0; i<len; i++){
			count[arr[i]]++;
		}
		
//		2. Compute position of each element		
		int s=0;
		int sum[]= new int[10];
		
		for(int i=0;i<10; i++){
			sum[i]=s;
			s+=count[i];
		}		
		
//		3. Put in output array
		int output[]= new int[len];
		
		for(int i: arr){
			output[sum[i]]=i;
			sum[i]++;
		}

//		Print the results
		for(int w:output){
			System.out.print(w+" ");
		}
		
	}

}
