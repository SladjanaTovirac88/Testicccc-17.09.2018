package Zadatak4;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.println("Unesite recenicu:");
		String recenica=input.nextLine();
		
		String predzadnjaRijec = null;
		for(int i=0;i<recenica.length();i++){
			if(recenica.charAt(i)!=' '){
				predzadnjaRijec+=recenica.charAt(i);
			}
		}
		for(int i=recenica.length()-1;i>=0;i++){
			System.out.println(i);
		}
	
	
	
	
	
	
	
	
		}



	}


