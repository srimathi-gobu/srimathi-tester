package org.exception;

public class Exception  {
	public static void main(String[] args) {
		
	
			int [] ar=new int[5];
			ar[4]=5;
			try {
				System.out.println(ar[5]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("handle the exception");
			}
			finally {
				System.out.println("success");
				System.out.println("exception handled");
			}
		

			
		}}
	


