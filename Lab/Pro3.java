package program;
// Name and email validation and String operation
import java.util.Scanner;

public class Pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter your Name:");
String Name=sc.nextLine();
System.out.println("Enter your email:");
String email=sc.nextLine();
String parts[]=Name.split("");
String FirName=parts[0];
String LasName=parts[parts.length-1];

System.out.println("Name in uppercase :"+Name.toUpperCase());
System.out.println("Name in Lowercase :"+Name.toLowerCase());

if (email.endsWith("@gmail.com")||email.endsWith("@yahoo.com")) {
	System.out.println("It is a valid email .");
	
}
else {
	System.out.println("It is a invalid email .");
}
System.out.println("Modified Name:"+Name.replace(" ", "_"));

int Vowels=0;
for (char ch:Name.toLowerCase().toCharArray()) {
	if ("aeiou".indexOf(ch)!=-1) {
		Vowels++;
	}
	
		}
System.out.println("No Vowels present in the Name ="+Vowels);

	}

}
