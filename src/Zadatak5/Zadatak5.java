package Zadatak5;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		String rijec;
		
		do{
			System.out.println("Unesite rijec(kraj prekida unos)");
			rijec=input.next();
			
		
		}while(rijec!="kraj");

		System.out.println(rijec);



	}

}
