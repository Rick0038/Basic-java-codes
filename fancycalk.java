/*
 * fancycalk.java
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


public class fancycalk{
	public static String name;
	public static boolean use=true;
	public static Scanner input = new Scanner(System.in);
	public static void main (String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("********************************************* HELLO !! ****************************************** ");
		System.out.println("\t Nice to meet you, Welcome in the program 'Let's Calculate' ");
		System.out.println("\tSo what's your name : ");
		name=input.next();
		System.out.println("\tNice name \u263A ");
		System.out.println("\tNow let's get into the program "+name);
		System.out.println("");
		menu1();
		
	}
	
	public static void menu1()
	{
		int flag1=1;
		do {
				System.out.println("");
				System.out.println("\t\tWhen you are ready choose one from bellow   ");
				System.out.println("\t\tPress 1 to start calculator");
				System.out.println("\t\tPress 2 check values");
				System.out.println("\t\tPress 3 for credits");
				System.out.println("\t\tPress 4 for a joke   ");
				System.out.println("\t\tPress 5 for  exit   ");
//				System.out.println("\t\tPress 6 for  feedback   ");
				System.out.println("");
				System.out.println("\t\tPlease choose one  : ");
				System.out.println("");
				int ch=input.nextInt();
				
				switch(ch)
				{
					case 1:  feature1();
							 break;
				    case 2:  System.out.println("\t\tSorry !!"+name);
							 System.out.println("\t\tThis is under development try again later");
							 feature2();
							 break;
				    case 3:  feature3();
							 break;
					case 4:  feature4();
							 break;
					case 5:  System.out.println("\t\tHope you have fun "+name);
							 System.out.println("\t\tSee you next time");	
							 System.exit(0);
//					case 6:  feedback();
//							 break;
					default: System.out.println("\t\tOops !!  Look's like you have pressed a wrong button.");											
							 System.out.println("\t\tLet's do it again ");
							 break;			
				}
			}while (flag1==1);
	}
	
	//Start of feature "calculator"
	public static void feature1()
	{
		int flag=1;
		do{
				System.out.println("");
				System.out.println("\t\t\tSo, Let's start the calculator ");
				System.out.println("\t\t\tPress 1 to perform a 2 number addition ");
				System.out.println("\t\t\tPress 2 to perform a 2 number substraction ");
				System.out.println("\t\t\tPress 3 to perform a 2 number multiplication ");
				System.out.println("\t\t\tPress 4 to perform a 2 number division ");
				System.out.println("\t\t\tPress 5 to perform the number's  square ");
				System.out.println("\t\t\tPress 6 to perform the number's  square root ");
				System.out.println("\t\t\tPress 7 for the previous menu of the program");
				System.out.println("\t\t\tPress 8 for exit the program ");
				System.out.println("");
				System.out.println("\t\t\tPlease choose one  : ");
				System.out.println("");
				int ch=input.nextInt();
				System.out.println("");
				
				switch(ch)
				{
					
					case 1:  add();
							 break;
					case 2:  sub();
							 break;
					case 3:  mul();
							 break;
					case 4:  div();
							 break;
					case 5:  sq();
							 break;
					case 6:  squrt();
							 break;
					case 7:  System.out.println("\t\t\tGoing back to previous menu ");
							 return ;
   					case 8:  System.out.println("\t\t\tHope you have fun "+name);
							 System.out.println("\t\t\tSee you next time");	
							 System.exit(0);			
					default: System.out.println("\t\t\tOops !!  Look's like you have pressed a wrong button.");											
							 System.out.println("\t\t\tLet's do it again ");
							 break;			
				}	
			}while(flag==1);
	}
	
	public static void add()
	{
			System.out.println("");
			System.out.println("\t\t\tPlease enter the first number ");
			float var1=input.nextFloat();
			System.out.println("\t\t\tPlease enter the secornd number ");
			float var2=input.nextFloat();
			float res=var1+var2;
			System.out.println("");
			System.out.println("\t\t\tThe resualt is "+res);

	}
	
	public static void sub()
	{
			float res;
			System.out.println("");
			System.out.println("\t\t\tPlease enter the first number ");
			float var1=input.nextFloat();
			System.out.println("\t\t\tPlease enter the secornd number ");
			float var2=input.nextFloat();
			if(var1>var2)
			{
				 res=var1-var2;
			}
			else 
			{
				 res=var2-var1;
			}
			System.out.println("");
			System.out.println("\t\t\tThe resualt is "+res);

	}
	
	public static void mul()
	{
			System.out.println("");
			System.out.println("\t\t\tPlease enter the first number ");
			float var1=input.nextFloat();
			System.out.println("\t\t\tPlease enter the secornd number ");
			float var2=input.nextFloat();
			float res=var1*var2;
			System.out.println("");
			System.out.println("\t\t\tThe resualt is "+res);

	}
	
	public static void div()
	{
			System.out.println("");
			System.out.println("\t\t\tPlease enter the first number ");
			float var1=input.nextFloat();
			System.out.println("\t\t\tPlease enter the secornd number ");
			float var2=input.nextFloat();
			float res=var1/var2;
			System.out.println("");
			System.out.println("\t\t\tThe resualt is "+res);

	}
	
	public static void sq()
	{
			System.out.println("");
			System.out.println("\t\t\tPlease enter the first number ");
			double var1=input.nextFloat();
			double res=var1*var1;
			System.out.println("");
			System.out.println("\t\t\tThe resualt is "+res);

	}
	
	public static void squrt()
	{
			System.out.println("");
			System.out.println("\t\t\tPlease enter the first number ");
			double var1=input.nextFloat();
			double res=Math.sqrt(var1);
			System.out.println("");
			System.out.println("\t\t\tThe resualt is "+res);

	}
	
	
	//Start of "cheaker"
	public static void feature2()
	{
		
	}
	
	
	//Start of "credits"
	public static void feature3()
	{
		System.out.println("");
		System.out.println("\t\t\tThanks for using this program "+name);
		System.out.println("");
		System.out.println("\t\t\tThis program is created by Rick Bhattacharya. ");
		System.out.println("\t\t\tThis program is free software. ");
		System.out.println("\t\t\tYou can redistribute it and/or modify it under the terms ");
		System.out.println("\t\t\tthe Free Software Foundation; either version 2 of the License, or");
		System.out.println("\t\t\tof the GNU General Public License as published by");
		System.out.println("\t\t\t(at your option) any later version.");
		System.out.println("");
	}
	
	
	//Start of "joke"
	public static void feature4()
	{
		
		if(use==true)
		{
			System.out.println("\t\t\tOne, joke .... on it's way!!");
			use=false;
		}
		else
		{
			System.out.println("\t\t\tOne more !! here it is !!");
			use=true;
		}
		Random gen=new Random();
		int flip=gen.nextInt(4);
		System.out.println("");
		switch(flip)
		{
			case 0: System.out.println("\t\t\tWhat's the difference between a snowman and a snowwoman");
					System.out.println("\t\t\tSnow balls");
					break;
			case 1: System.out.println("\t\t\tWhat’s brown and sticky?");
					System.out.println("\t\t\tA stick.");
					break;
			case 2: System.out.println("\t\t\tWhat is the resemblance between a green apple and a red apple");
					System.out.println("\t\t\tThey’re both red except for the green one.");
					break;
			case 3: System.out.println("\t\t\tHow did the hipster burn his mouth?");
					System.out.println("\t\t\tHe ate the pizza before it was cool.");
					break;
			case 4: System.out.println("\t\t\tHow did the blonde die ice fishing?");
					System.out.println("\t\t\tShe was hit by the zamboni.");
					break;
			case 5: System.out.println("\t\t\tHow Long is a Chinese man’s name.");
					System.out.println("\t\t\tNo, it actually is.");
					break;
			default:System.out.println("\t\t\tWhat do Alexander the Great and Winnie the Pooh have in common?");
					System.out.println("\t\t\tSame middle name.");
		}
	}

	/*Start of "Feedback"
	public static void feedback()
	{
		
	}
	*/
	 
	 
}


					/* ***********************************************************************************
					**************************************************************************************
					*******								VERSION 1.0									******
					*******																			******
					*******===	"KNOWN BUGS"  ======================================================******
					*******																			******
					*******		1) Misalligned hello												******
					*******																			******
					*******===  "Upcomming feature"  ===============================================******
					*******																			******
					*******		1) armstrong number													******
					*******		2) prime number														******
					*******		3) palindrome number												******
					*******		4) even odd															******
					*******		5) fibonacii series													******
					*******																			******
					*******		6)Feedback prompt													******
					*******																			******
					**************************************************************************************
					*************************************************************************************/
