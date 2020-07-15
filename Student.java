package studentclass;

import java.util.Scanner;

import arrayofobjects.sports;


public class Student {
	
	
	
	     public int roll;
	     public String name;
	     int s1,s2,s3,s4,s5,s6;
	     int sum=0;
	  
	     Student(int a, String b,int s1,int s2,int s3,int s4, int s5, int s6){
	    	 
	    	 roll=a;
	    	 name=b;
	    	 this.s1=s1;
	    	 this.s2=s2;
	    	 this.s3=s3;
	    	 this.s4=s4;
	    	 this.s5=s5;
	    	 this.s6=s6;
	    	 sum = s1+s2+s3+s4+5+s6;
	    	  
	     }
	     
	     /*
	     public void setData() {
	    
	         Scanner sc = new Scanner(System.in);
	         System.out.print("Enter Roll no:= ");
	         roll = sc.nextInt();
	         System.out.print("Enter Name:= ");
	         name = sc.next();
	        
	         System.out.print("Enter 6 sub mark:= ");
	         s1 = sc.nextInt();
	         s2 = sc.nextInt();
	         s3 = sc.nextInt();
	         s4 = sc.nextInt();
	         s5 = sc.nextInt();
	         s6 = sc.nextInt();
	         
	         sum = s1+s2+s3+s4+5+s6;
	       }
	     */
	     
	     public void display()
	     {
	          System.out.println("Roll_no : "+roll);
	          System.out.println("Name    : "+name);
	          
	          System.out.println("-----MARKS-------");
	          
	          System.out.println("Sub 1     : "+s1);
	          System.out.println("Sub 2     : "+s2);
	          System.out.println("Sub 3     : "+s3);
	          System.out.println("Sub 3     : "+s4);
	          System.out.println("Sub 3     : "+s5);
	          System.out.println("Sub 3     : "+s6);
	          System.out.println("Total     : "+sum);
	          System.out.println("percentage: "+sum/6);
	          System.out.println("------------------");
	     }
	
	
	

	public static void main(String[] args) {
	
		
		Student  s [] = new Student [10];
		
		int r;
		String n;
		int s1,s2,s3,s4,s5,s6;
		
		
		
		 
		 Scanner sc=new Scanner(System.in);
		 
		  for(int i = 0; i<s.length;i++) {
		
	 System.out.println("enter roll no ");
   	 r =sc.nextInt();
   	 
   	 System.out.println("enter name ");
   	 n= sc.next();
   	 
   	 System.out.println("enter subject marks sub 1");
   	  s1= sc.nextInt();
   	 System.out.println("enter subject marks sub 2");
  	  s2= sc.nextInt(); 
  	  
  	 System.out.println("enter subject marks sub 3");
  	  s3= sc.nextInt();
  	 System.out.println("enter subject marks sub 4");
  	  s4= sc.nextInt();
  	 System.out.println("enter subject marks sub 5");
  	  s5= sc.nextInt();
   	 
  	 System.out.println("enter subject marks sub 6");
  	  s6= sc.nextInt();
  	  
  	  
   	 s[i]=new  Student(r,n,s1,s2,s3,s4,s5,s6);
   	 
   	 
		  }
		
		
		
		for(int i=0;i<s.length;i++) {
			
			s[i].display();
		}

		
	}

}
