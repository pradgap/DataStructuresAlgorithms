package sorting;

public class HeapSort {
// First create a min heap
// dequeue the value from the min heap 
	
	public void heapify(int[] a){
		for(int i=2; i<a.length; i++){
			swim(a,i);
		}
	}
	
	public void swim(int[] a,int i){
		int temp;
		while(i>1){
			if(a[i/2]>a[i]){
				break;				
			}
			swap(a,i,i/2);
			i=i/2;
		}
	}
	
	public void sink(int[] a, int i, int N){
		int index;
		while(2*i+1<N){
			index= max(a,2*i, 2*i+1);
			if(a[i]<a[index]){
				swap(a,i,index);
				i=index;
			}
			else{
				break;
			}
				
		}
		if(2*i<N){
			if(a[i]<a[2*i])
				swap(a,i,2*i);
		}
		
	}
	
	public void hSort(int[] a){
		this.heapify(a);
		for(int N=a.length-1; N>1; N--){
			swap(a,N,1);
//			swim(a,i-1);
			sink(a,1,N);
		}
		
	}
	
	public void swap(int[] a, int i, int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	
	public int max(int[] a, int i, int j){
		if(a[i]>=a[j])
			return i;		
		else 
			return j;
	}
}
