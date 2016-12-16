package basicstrying;

public class CountingS {
	
	public static void main(String[] args){
		String str="Nepal defeated India in football today";
//		String[] a= str.split(" ");
		String[] a= {"google", "facebook", "amazon", "microsoft","apple", "twitter", "indeed", "linkedIn"};
		CountingSort(a);
	}
	
	
	
	public static void CountingSort(String[] a){
		int N= 26; // 26 alphabets in English
		int[] frequency= new int[N]; 
		int[] cumulative= new int[N];
		String[] temp= new String[a.length];
		
		
		for(String s: a){
			frequency[s.toLowerCase().charAt(0)-'a']++;
		}
		
		for(int i=1; i<N; i++){
			cumulative[i]=cumulative[i-1]+frequency[i-1];		
		}		
		
		for(String s: a){
			temp[cumulative[s.toLowerCase().charAt(0)-'a']]=s;
			cumulative[s.toLowerCase().charAt(0)-'a']++;
		}
		
		for(String s: temp){
			System.out.println(s);
		}
		
	}

}
