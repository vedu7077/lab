package com.string;

public class DuplicateCharFrequency {
	
	
	
	
	public static void dupLiCharFreq(char ch[]) {
		for (int i=0;i<ch.length;i++) {
			if(ch[i]=='\0') {
				continue;
			}
			int count =1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			if(count>1) {
				System.out.println(ch[i]+" : "+count);
			}
		}
		
	}

	public static void main(String[] args) {
		
		
		String s="Java";
		
		String s1=s.toLowerCase();
		
		char ch[]=s1.toCharArray();
		dupLiCharFreq(ch);

	}

}