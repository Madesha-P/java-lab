package program;
import java.io.*;
import java.util.Scanner;


public class Prac4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.print(false);
		
		String File="Employees1.txt";
try(BufferedWriter bw =new BufferedWriter(new FileWriter(File))){
	System.out.print("Enter Number of employees:");
	int n=sc.nextInt();
	sc.nextLine();
			for(int i=0;i<n;i++) {
				System.out.print("Enter ID of Employee "+(i+1)+" :");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name of Employee "+(i+1)+" :");
				String Name=sc.nextLine();
				System.out.print("Enter Salary of Employee "+(i+1)+" :");
				double Salary=sc.nextDouble();
				sc.nextLine();
				bw.write(id+","+Name+","+Salary);
				bw.newLine(); 
				
			}
			System.out.println("Employee records saved successfully."); 
			
		}
catch (IOException e) { 
System.out.println("Error writing to file: " + e.getMessage()); 
}

try (BufferedReader br = new BufferedReader(new FileReader(File)))  
{ 
System.out.println("\n--- Employee Records---"); 
String line;
while ((line = br.readLine()) != null)  
{  
String[] data = line.split(","); System.out.println("ID: " + data[0] + ", Name: " + data[1] + ", Salary: " 
+ data[2]);  
}  
}  
 
catch (IOException e) 
{ 
System.out.println("Error reading file: " + e.getMessage());  
}  
sc.close();  
}
}

