/*
 * Classdemojava
 * 
 * Copyright 2020 Rick Bhattacharya <rick@Serena>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


import java.util.*;
import java.lang.*;
import java.io.*;

class packet
{
	String na;
	int id;
	int phn;
	char empst;
	
	void input_data(String x,int y,int z,char a)
	{
		na=x;
		id=y;
		phn=z;
		empst=a;
		System.out.println("Given data inserted");
	}

	void output_data()
	{
		System.out.println("Enter the employee name"+na);
		System.out.println("Enter the employee id"+id);
		System.out.println("Enter the employee phone number"+phn);
		System.out.println("Enter the employee status"+empst);
	}

	packet()
	{
		System.out.println("Entry Created");
		System.out.println("Pls Enter the data");
	}
	
		
}
public class Classdemo
{
public static void main(String args[])
	{
	int i;	
	packet objarr[];
	objarr = new packet[10];
	Scanner input=new Scanner(System.in);
	System.out.println("How many entries you want");
	int tot=input.nextInt();
	for(i=0;i<tot;i++)
		{	
		System.out.println("Entry no: "+(i+1));		
		System.out.println("Enter Employee id");
		int l=input.nextInt();
		System.out.println("Enter the employee name");

		//Scanner yup=new Scanner(System.in); //logic ki ??//

		String imp=new String();
		imp=input.nextLine();
		System.out.println("Enter Employee phone number");
		int j=input.nextInt();
		System.out.println("Enter employee status");
		char k=input.next().charAt(0);
		objarr[i].input_data(imp,l,j,k);
		}
	
	for(i=0;i<tot;i++)
		{
		System.out.print("Entry no "+i+"is");
		objarr[i].output_data();
		}
	System.out.println("Program Ended");
	}
}
