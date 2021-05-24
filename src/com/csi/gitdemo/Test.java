package com.csi.gitdemo;

public class Test {
public static void main(String[] args) {
	String s="Nita";
	String rev="";
	int len=s.length();
	for(int i=len-1;i>=0;i--){
		rev=rev+s.charAt(i);
		
	}
	System.out.println(rev);
}
}
