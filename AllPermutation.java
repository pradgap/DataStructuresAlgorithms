package geekforgeeksStack;

import java.util.Scanner;

public class AllPermutation {
	
	public static void main(String[] args){
		System.out.println("Please enter a string");
		Scanner scan= new Scanner(System.in);
		String str=scan.nextLine();		
		permut(str, "");
	}
	
	public static void permut(String str, String pre){
		int N=str.length();
		if(N==1){
			System.out.println(pre+str);
		}
		else{
			for(int i=0; i<N; i++){
				str=swap(str,0,i);
				permut(str.substring(1,N), pre+str.charAt(0));
				str=swap(str,0,i);
			}
		}		
	}
	
	public static String swap(String str, int i, int j){
		char ch=str.charAt(i);
		StringBuilder sb= new StringBuilder(str);
		sb.setCharAt(i, sb.charAt(j));
		sb.setCharAt(j, ch);
		str=sb.toString();
		return str;		
	}
}
