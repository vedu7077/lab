package com.Array;

import java.util.Scanner;

public class ThetreMain {
	public static void main(String[] args) {
		
		
		
		Theatre theatre[]=new Theatre[3];
		
		
		
		Movie movie[]=new Movie[1];
		
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<theatre.length;i++) {
			
			System.out.print("Enter the theatre id: ");
			int tid=sc.nextInt();
			
			System.out.print("Enter the theatre name: ");
			String tname=sc.next();
			
			for(int j=0;j<movie.length;j++) {
				
				System.out.print("Enter movie id: ");
				int mid=sc.nextInt();
				
				System.out.print("Enter movie name: ");
				String mname=sc.next();
				
				System.out.print("Enter movie rating: ");
				double mrating=sc.nextDouble();
			
			Theatre t=new Theatre();
			t.settId(tid);
			t.settName(tname);
			t.setMovie(new Movie());
			t.movie.setmId(mid);
			t.movie.setmName(mname);
			t.movie.setmRating(mrating);
			theatre[i]=t;
			}
		}
		
		
		System.out.println("-----------------");
		
		
		for(int i=0;i<theatre.length;i++) {
			
System.out.println(theatre[i].gettId()+" "+theatre[i].gettName()+" "+theatre[i].movie.getmId()+" "+theatre[i].movie.getmName()+" "+theatre[i].movie.getmRating());
		}
	}

}