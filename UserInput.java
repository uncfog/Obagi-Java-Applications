import java.util.Scanner;


public class UserInput{
   public static void main(String[] args){
	   Scanner input = new Scanner (System.in);
	   
	   System.out.print("Enter your name: ");
	   String name = input.nextLine();
       
	   System.out.printf("Enter your gender (M/F/N): ");
	   char gender = input.next().charAt(0);
	   input.nextLine();
	   
	   System.out.print("Enter your address: ");
	   String address = input.nextLine();
	   
	   System.out.print("Enter your age: ");
	   byte age = input.nextByte();
	   
	   System.out.print("Enter your balance: ");
	   double balance = input.nextDouble();
	   
	   System.out.print("Do you love Java? (True/False): ");
	   boolean isJava = input.nextBoolean();
	   
	   System.out.println();
	   
	   
       System.out.printf("Hi %s, You are welcome to First Bank%n",name);
	   System.out.printf("You are located at %s%n", address);
	   System.out.printf("You are %d years old%n",age);
	   System.out.printf("Your account balance is %c%.2f%n",'$',balance);
	   System.out.printf("%s Do you love Java? %b%n",name,isJava); 

   }
}