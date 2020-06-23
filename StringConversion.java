package hackerrankalgorithms;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Test1 {
	public static String appendAndDelete(String s, String t, int k) {
	       String temp = "";
	       int a = s.length(); 
	       int b= t.length(); 

	       if(k>=(a+b)) {
	           temp = "Yes"; 
	       }

	       else if(k<a+b) {
	       int p=0; 
	       for(int i=0; i<Math.min(a,b); i++) {
	            if(s.charAt(i)==t.charAt(i)) {
	                p++;

	            } 

	            else {
	                break; 
	            }
	       }
	       System.out.println(p);
	        if(k-(a+b-2*p)>=0 && (k-(a+b-2*p))%2==0) {
	            temp = "Yes"; 
	        }
	        else {
	           temp = "No";
	       } 
	       }

	       

	       return temp ; 
	    }
	
	public static void main(String[] args) {
		// Above is the function to find out whether a string can be converted to another in given number of steps, which include either
		// removing the last element or adding element at the last.
	}
}
