import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedParanthesis {

    public static void main(String[] args) {
                
        Scanner scan= new Scanner(System.in);
        int N= scan.nextInt();
        String str;
        for(int i=0; i<N; i++){
            str=scan.next();
           if(!isBalanced(str)){
               System.out.println("NO");
           }
           else{
               System.out.println("YES");
           }
        }
    }
    
    public static boolean isBalanced(String str){
        Stack<Character> stack= new Stack<Character>();
        char ch;
        if(str.length()==0)
            return false;
        for(int i=0; i<str.length(); i++){
            ch=str.charAt(i);
            if(ch=='}'){               
                if(stack.isEmpty() || stack.pop()!='{')
                    return false;
            }
            else if (ch==')'){             
                if(stack.isEmpty() || stack.pop()!='(')
                    return false;
            }
            else if (ch==']'){                
                if(stack.isEmpty() || stack.pop()!='[')
                    return false;
            }
            else if (ch=='('|| ch=='{' || ch=='['){
                stack.push(ch);
            }   
            else {
                return false;
            }
        }
        if(stack.isEmpty())
            return true;
        else 
            return false;
    }
}