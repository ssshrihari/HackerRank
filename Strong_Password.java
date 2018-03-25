/*PROBLEM
Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the following criteria:

Its length is at least .
It contains at least one digit.
It contains at least one lowercase English character.
It contains at least one uppercase English character.
It contains at least one special character. The special characters are: !@#$%^&*()-+
She typed a random string of length  in the password field but wasn't sure if it was strong. Given the string she typed, can you find the minimum number of characters she must add to make her password strong?

*/

//Author :Shrihari Shetty
//Complexity:O(n)


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    static int minimumNumber(String p) {
        int up=0,lo=0,sy=0,di=0,len=0;
        //Checking Conditions
        for(int i=0;i<p.length();i++){
            if(Character.isUpperCase(p.charAt(i)))
                up=1;
            if(Character.isLowerCase(p.charAt(i)))  
                lo=1;
            if(Character.isDigit(p.charAt(i)))
                di=1;
 if(p.charAt(i)=='!'||p.charAt(i)=='@'||p.charAt(i)=='#'||p.charAt(i)=='$'||p.charAt(i)=='%'||p.charAt(i)=='^'||p.charAt(i)=='&'||p.charAt(i)=='*'||p.charAt(i)=='('||p.charAt(i)==')'||p.charAt(i)=='-'||p.charAt(i)=='+')
            {
                sy=1;
            }
        }
        //Calculating number of symbols present
        len=sy+di+lo+up;
        
        //FOUR POSSIBLE CONDITIONS AND TWO SUBCONDITIONS
        if(len==4&&p.length()>=6)
            return 0;
        else if(len==4&&p.length()<6)
            return 6-p.length();
        else if(len<4&&p.length()>=6)
            return 4-len;
        else if(len<4&&p.length()<6)
            if(6-p.length()<=4-len)
                return 4-len;
            else
                return 6-p.length();   
        else
            return 0;
            
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(password);
        System.out.println(answer);
        in.close();
    }
}
