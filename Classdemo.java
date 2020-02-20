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




public class Classdemo 
{
	public static void main(String args[])throws IOException
	{
		int Lo;
		boolean flag=true;	
		Scanner input=new Scanner(System.in);		
		System.out.print("How many entries you want in database :");
		int tot=input.nextInt();		
		createfile in=new createfile(tot);			
		do {
				System.out.println("");
				System.out.println("\tWhen you are ready choose one from bellow   ");
				System.out.println("\tPress 1 to Push values");
				System.out.println("\tPress 2 to See values");
				System.out.println("\tPress 3 to store values");
				System.out.println("\tPress 4 for exit");
				System.out.println("");
				System.out.print("\tPlease choose one  :");
				System.out.print("");
				int ch=input.nextInt();
				
				switch(ch)
				{
					case 1:  in.push_data();
							 break;
				    case 2:  in.pop_data();
							 break;
				    case 3:  in.store_data();
							 break;
					case 4:  System.exit(0);
							 break;
					default: System.out.println("\n\tOops !!  Look's like you have pressed a wrong button.");											
							 System.out.println("\tLet's do it again\n ");
							 break;			
				}
			}while (flag);
		
	}
}





class packet
{
	private String name;
	private String ID;
	private int number;
	private float salary;
	private String Fname[];
	

	Scanner input=new Scanner(System.in);
	void input_data(String x,String y,int z,float a)
	{
		name=x;
		ID=y;
		number=z;
		salary=a;
		System.out.println("\n\t Data recorded");
	}



	void output_data()
	{
		System.out.println("\t The employee name is :"+name);
		System.out.println("\t The employee ID is :"+ID);
		System.out.println("\t The employee phone number is :"+number);
		System.out.println("\t The employee salary is :"+salary);
	}
	
	
	
	void process_data() throws IOException
	{
		
			FileWriter put=new FileWriter("Default.txt",true);
						
			put.write("\nEmploye ID:");
			for (int i=0;i<ID.length();i++)
			{
				put.write(ID.charAt(i));						
			}
			put.write("\nEmploye name is :");
			for (int i=0;i<name.length();i++)
			{
				put.write(name.charAt(i));							
			}		
			put.write("\nEmploye Number is :");
			put.write(Integer.toString(number));								
			put.write("\nEmploye Salary is :");
			put.write(Float.toString(salary));						
			put.write("\n");
			put.write("\n");
			put.close();		
	}	
}




class createfile
{
	private int tot;
	private packet objarr[];
	createfile(int tot)
	{
			this.tot=tot;
			
	}
	
		
	void push_data()
	{
		Scanner input=new Scanner(System.in);
		
		objarr = new packet[10];
		for(int Lo=0;Lo<tot;Lo++)
			{	
				System.out.println("\n\t Entry no: "+(Lo+1));				
				System.out.print("\t Enter Employee id :");
				String i=input.next();
				input.nextLine();
				System.out.print("\t Enter the employee name : ");
				String na=new String();
				na=input.nextLine();
				System.out.print("\t Enter Employee phone number : ");
				int ph=input.nextInt();
				System.out.print("\t Enter employee salary : ");
				float sa=input.nextFloat();
				objarr[Lo]=new packet();
				objarr[Lo].input_data(na,i,ph,sa);
			}
	}
	
	
	
	void pop_data()
	{
		boolean flag=true;
		Scanner input=new Scanner(System.in);
		System.out.print("\n\t Do you want to show the given data\n\t Pls confirm (Yes/No) :");
		char opnion=input.next().charAt(0);	
		do
		{	switch(opnion)
				{
					case 'Y':
					case 'y':	for(int Lo=0;Lo<tot;Lo++)
								{
									System.out.print("\n\t Printing the stored data\n");
									System.out.print("\n\t Entry no "+(Lo+1)+" is\n");
									objarr[Lo].output_data();
									flag=false;
								}
								break;
					case 'N': 
					case 'n': 	System.out.println("\n\t Ok!!");
								flag=false;
								break;
					default: 	System.out.println("\n\t Wrong input");
								System.out.print("\n\t Input again :");
								opnion=input.next().charAt(0);
				}
		}while(flag);	
	}
	
	
	
		
	void store_data() throws IOException
	{
		boolean flag=true;
		Scanner input=new Scanner(System.in);
		System.out.print("\n\t Do you want to store the given data\n\t Pls confirm (Yes/No) :");
		char opnion=input.next().charAt(0);
		do
		{	switch(opnion)
				{
					case 'Y':
					case 'y':	for(int Lo=0;Lo<tot;Lo++)
								{
									objarr[Lo].process_data();
								}
								System.out.println("\n\t Data recorded");
								flag=false;
								break;
					case 'N': 
					case 'n': 	System.out.println("\n\t Storage cancelled");
								flag=false;
								break;
					default: 	System.out.println("\n\t Wrong input");
								System.out.print("\n\t Input again :");
								opnion=input.next().charAt(0);
				}
		}while(flag);	
			
	}
	
}









/*		
 * 		AT LINE 110
 * 
 * 
		char opnion=input.next().charAt(0);
		System.out.print("Do want to create new file");
		if(opnion=='Y'||opnion=='y')
			{
				Fname=input.Next();
				FileWriter put=new FileWriter(Fnam,true);
			}
		else if(opnion=='N'||opnion=='n')
			{
				FileWriter put=new FileWriter("Default.txt",true);
			}
		else
			{
				System.out.println("\n\t Wrong input");
			}
		*/	
