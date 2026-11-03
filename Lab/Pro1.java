package program;
//Encapsulatin Example

class Student { 
    // Private variables (data hiding) 
private String name; 
private int rollNo; 

    // Setter methods (to set data) 
public void setName(String n)  
{ 
name = n; 
} 

public void setRollNo(int r)  
{ 
rollNo = r; 
} 

    // Getter methods (to get data) 
public String getName()  
{ 
return name; 
} 

public int getRollNo()  
{ 
return rollNo; 
} 
} 

public class Pro1  
{ 
public static void main(String[] args) 
{ 
Student s1 = new Student(); 

            // Setting data using setter methods 
s1.setName("John"); 
s1.setRollNo(101); 

            // Getting data using getter methods 
System.out.println("Student Name: " + s1.getName()); 
System.out.println("Roll Number: " + s1.getRollNo()); 
} 
} 