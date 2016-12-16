package sorting;

public class MergeSort {
	
	public void mSort(int[] a, int lo, int hi){
		if((hi-lo)==1){
			return;
		}
		int mid= (lo+hi)/2;
		mSort(a, lo, mid);
		mSort(a, mid, hi);
		merge(a,lo, mid, hi);
		return;
	}
	
	public void merge(int[] a, int lo, int mid, int hi){
		int i=lo;
		int j=mid;
		int index=0;
		int[] aux= new int[hi-lo];
		while(i<mid || j<hi){
			if (i>=mid){
				aux[index]=a[j++];				
			}
			else if(j>=hi){
				aux[index]=a[i++];
			}
			else if(a[i]<=a[j]){
				aux[index]=a[i++];
			}
			else{
				aux[index]=a[j++];
			}
			index++;
		}
		for(i=0; i<aux.length; i++){
			a[i+lo]=aux[i];
		}
		
	}
	

	
	

}
