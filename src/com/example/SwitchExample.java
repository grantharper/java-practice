package com.example;

public class SwitchExample {

	
	public static void main(String[] args) {
		int i = 2;
		switch(i){
		
		case 0:
			//can't use b before it is declared
			//b = false;
			break;
		case 1:
			boolean b = true;
			break;
		case 2: 
			//even though case 1 may never execute the local variable defined there is accessible
			b = false;
			break;
			
		}
		
		//can't do this because b is only in scope for the switch block
		//if(b) System.out.println("b");
		
	}
	
}
