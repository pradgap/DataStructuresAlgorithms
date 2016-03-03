import java.io.*;
import java.util.*;

class RemoveBlanckSpaces {
  public static void main(String[] args) {
   String str="H  e l       l o     ";
   String newStr= removeSpaces(str);
   System.out.println(newStr);
  }
  
  public static String removeSpaces(String str){
    StringBuilder sb= new StringBuilder(str);
    int cnt=0;
    for(int i=0; i<sb.length(); i++){
      if(sb.charAt(i)==' '){
        cnt++;
      }
      else{
        sb.setCharAt(i-cnt,sb.charAt(i));
      }        
    }
    return sb.substring(0,sb.length()-cnt);
    
  }
}
