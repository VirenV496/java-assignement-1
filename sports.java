package arrayofobjects;

import java.util.Scanner;


public class sports {
	
	static int Acc_id;
	String des;
	int quant;
	int rate;
	
	 sports(int a, String b,int c,int d){
	  Acc_id=a;
	  des=b;
	  quant=c;
	  rate=d;
	 }

	 public void display() {
		 
		 System.out.println(Acc_id++ +" " + des + " "+ quant + " "+ rate);
	 }
	
	
	
	public static void main(String[] args) {

	   
	      sports []ts = new sports [10];
	      
	         int a1;
			 String b1;
			 int c1;
			 int d1;
			 
			 Scanner sc=new Scanner(System.in);
			 
			  for(int i = 0; i<ts.length;i++) {
			
			 System.out.println("enter acc_id ");
	    	 a1 =sc.nextInt();
	    	 
	    	 System.out.println("enter enter description ");
	    	 b1= sc.next();
	    	 
	    	 System.out.println("enter quantity");
	    	 c1= sc.nextInt();
	    	 
	    	 System.out.println("enter rate");
	    	 d1=sc.nextInt();  	 
	    	 
	    	 ts[i]=new  sports(a1,b1,c1,d1);
	    	 
			  }
			   
	    	 System.out.println("\nrecords \n");
	    	 

			   for(int i=0;i<ts.length;i++)
			    ts[i].display();
		}	
}
