package program;
// Student Array data collection

import java.util.Scanner;
class Student{
	String Name;
	int rollno;
	
Student(String Name,int rollno){
	this.Name=Name;
	this.rollno=rollno;
}
	
public void display() {
	System.out.println("Name:"+Name+"\nRoll no:"+rollno);
}
}


public class Pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Number of students :");
	     int n=sc.nextInt();
	     sc.nextLine();
	     
	     Student Students[]=new Student[n];
	     for(int i=0;i<n;i++) {
	    	 System.out.println("Enter Name:");
	    	 String Name=sc.nextLine();
	    	 System.out.println("Enter Roll NO:");
	    	 int rollno=sc.nextInt();
	    	 sc.nextLine();
	    
	    	 Students[i]=new Student(Name,rollno);
	    	 
	    	 
	     }
	     
	     System.out.println("The student Details are :");
	     for(int i=0;i<n;i++) {
	    	 Students[i].display();
	    	 
	    	 
	    	 
	     }
	     sc.close();
	     
	}

}
