package employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	
 static int num;
 String name;
 String des;
 double salary;

 Employee(){
 
  System.out.println("\nObject Created : Obj No :"+num);
 
  name = "No Name Assigned";
  des = "not assigned";
  salary = 0;
 }

 Employee(String a, String b,double c){
 
  System.out.println("\nObject created.\nobject no:"+num);
  name=a;
  des=b;
  salary=c;
 
 }
 

 void display(){
 
  System.out.println("\n name: "+name+"\ndesignation : "+des+"\nsalary : "+salary);
 
 }

 
 public String toString(){
  
   String string="Name : "+name+"designation : "+des+" "+"salary : "+salary;
    return(string);
 
 }
 



	public static void main(String[] args) {
		 
		  try
		  {
		         
		    int n1;
		    String a1;
		    String b1;
		     double c1;
  
		   System.out.println("\nEnter No Of Employees: ");

		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   n1=Integer.parseInt(br.readLine());

		   Employee o[]=new  Employee[n1];

		   System.out.println("\nEnter The Data : ");

		   for(int i=0;i<n1;i++)
		   {

		    System.out.print("\n Name : ");
		     a1=br.readLine();
		   
		    System.out.print("\n designation : ");
		    b1=br.readLine();
		   
		    System.out.print("\nsalary:");
		    c1=Double.parseDouble(br.readLine());
		   
		    Employee.num++;

		    o[i]=new  Employee(a1,b1,c1);

		    }

		   System.out.println("\nTotal No Of Students : "+ Employee.num+"\nData : \n");

		   for(int i=0;i<n1;i++)
		    o[i].display();

		    System.out.println("\ntoString : ");

		   for(int i=0;i<n1;i++)
		    System.out.println("\nConversion toString : "+o[i].toString());
		  
		  }

		  catch(IOException e)
		  {
		   
		   System.out.println(e);
		   
		  }
		 
		 }
}

	


