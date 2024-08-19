package com.loop;

public class ForloopEx {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("i= "+i);
		}
		
		for(int i=0, j=0;i<10;i++,j--) {
			System.out.println("j= "+j);
		}
		
		int[] numbers = {1,2,3,4,5};
		for(int number:numbers) {
			System.out.println("number= "+number);
		}
		
	}

}
