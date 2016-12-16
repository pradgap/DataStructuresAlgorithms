package sorting;

// Quick Sort without random shuffling

public class QuickSort{
	public int partition(int[] a, int lo, int hi){
		if(lo==hi){
			return lo;
		}
		
		int index=lo;
		lo++;
		while(true){
			while(a[lo]<=a[index]){
				lo++;
				if(lo>=hi){
					break;
				}
			}
			while(a[hi]>=a[index]){
				hi--;
				if(lo>=hi){
					break;
				}
			}
			if(lo<hi){
				swap(a,lo,hi);
			}
			if(lo>hi){
				swap(a,index,hi);
				return hi;
			}
		}
		
	}
	

	public void swap(int[] a, int i, int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]= temp;
	}
	public void QSort(int[] a, int lo, int hi){
		int p=partition(a,lo,hi);
		if((p-1)>lo)
			QSort(a,lo,p-1);
		if((p+1)<hi)
			QSort(a,p+1,hi);

	}
}