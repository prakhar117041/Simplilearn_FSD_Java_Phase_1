package com.lockheed;

import java.util.*;
public class Lockheed {
	
	static ArrayList files = new ArrayList<String>(); 
	
	public static void main(String args[])
	{
		files.add("AmbitionsCannotBeLockeddown"); 
	    files.add("SabkoPtaHaiJobGuaranteed"); 
	    files.add("GetCertifiedGetAhead"); 
	    developer_details();
	    welcome_screen();
	    return;
    }
	private static void developer_details() 
	{
	 System.out.println("*****************************************" + "\nHi this is Prakhar Gupta working as an associate learning designer in Simplilearn Solutions Pvt.Ltd.");	
	 System.out.println("This is a prototype of lockedMe.com ");
	 System.out.println("Users can add, delete, search, and retrieve their files using this desktop app");
	 System.out.println("**NOTE:The users will be able to interact with command line only since its a prototype");
     System.out.println("\n*****************************************");
	}
	
	private static void welcome_screen() 
	{   Scanner sc1 = new Scanner(System.in);
		files.sort(null); 
	     System.out.println("Enter 1 To view all the exsisting files");
	     System.out.println("Enter 2 To perform operations like  (Creating, Deleting, and Searching) a file");
	     System.out.println("Enter 3 To close the application "); 
	     System.out.println("\n*****************************************");
	     System.out.println("Choose your option:");  
	    
	     int optionForOuterSwitch=0; 
	     try
	     {optionForOuterSwitch = sc1.nextInt();}
	     catch(Exception e) 
	     {
	    	System.out.println("Invalid Input, try again!!"); 
	    	welcome_screen();
	     }
	     switch(optionForOuterSwitch) 
		 {
		 case 1: 
			 disp(files);
			 break; 
		 case 2: 
			 business_ops(files);
			 break;
		 case 3:
			 System.out.println("Thanks for using this application");
			 System.exit(0); 
			 break; 
			 default:
				 System.out.println("Kindly enter a valid option");
		 }
		welcome_screen();
	}
	
	
	private static void business_ops(ArrayList<String> files)
	{    Scanner sc2 = new Scanner(System.in);
		 System.out.println("\n*****************************************");
		 System.out.println("Enter 1 To add  a file"); 
		 System.out.println("Enter 2 To remove a file");
		 System.out.println("Enter 3 To Search a file"); 
		 System.out.println("Enter 4 To go back to the main menu"); 
		 System.out.println("\n*****************************************");
	     System.out.println("Choose your option:");  
	     int optionForInnerSwitch=0; 
	     try {
	     optionForInnerSwitch=sc2.nextInt();} 
	     catch(Exception e) 
	     {
	    	System.out.println("Invalid input, try again!!"); 
	    	business_ops(files);
	     }
		 switch(optionForInnerSwitch) 
		 { case 1: 
			   business_ops_add(files);  
			   break;
		   case 2:
			   business_ops_remove(files); 
			   break;
		   case 3: 
			   business_ops_search(files); 
			   break;
		   case 4: 
			   business_ops_retrun_to_main_menu(); 
			   break; 
			   default:  
				   System.out.println("Kindly enter a valid option");
		 }
		
	}
	
	private static void disp(ArrayList<String> a1) 
    {Collections.sort(a1);
   	 for(String i: a1) 
   	 {
   		 System.out.println(i);   	 }
    } 
	
	private static void business_ops_add(ArrayList<String> files)
	{Scanner sc1 = new Scanner(System.in);
	 String fileName; 
	 fileName =sc1.nextLine();
	 files.add(fileName); 
	 System.out.println(fileName + " Successfully added to the list"); 
	 business_ops(files);
	 return;
	}

    private static void business_ops_remove(ArrayList<String> files) 
    {Scanner sc1 = new Scanner(System.in);
     String fileName; 
     fileName = sc1.nextLine();
     if(files.contains(fileName))
     {files.remove(fileName); 
     System.out.println(fileName + " Successfully removed from the list"); } 
     else 
     {
    	 System.out.println("file not found");
     }
     business_ops(files);
     return;
    }
    
    private static void business_ops_search(ArrayList<String> files) 
    {Scanner sc1 = new Scanner(System.in);
     String fileName;
     fileName= sc1.nextLine(); 
     if(files.contains(fileName)) 
     {
    	 System.out.println("File found: " + fileName); 
     } 
     else 
    	 System.out.println("File not found"); 
     business_ops(files);
    }

    private static void business_ops_retrun_to_main_menu()
    {
    	welcome_screen(); 
    	return;
    }


}





	
