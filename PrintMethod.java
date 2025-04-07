public class PrintMethod{
    public static void main(String[] args){
	    //using the print()
		System.out.print("\"Learning Java is one hell of a pain in the ass\"\n");
		System.out.print(" Hey please don't talk to me");
		
		//using the println()
		System.out.println();
		System.out.println("I want to tell you that Java is different from JavaScript");
		System.out.println("\t this is the indented text");
		
		//using the printf()
		System.out.printf("My name is %s and I love %s. Goodbye Idiots\n","Java","making people miserable");
		System.out.printf("I am %d years old\n", 30);
		System.out.printf("I bought Java JDK with %.2f naira%n", 159.36);
		System.out.printf("I bought Java JDK with %s%.2f%n", "$", 136.55); //Fix for currency format
		
		boolean isJavaFun = true;
		System.out.printf("Is Java fun? %b%n", isJavaFun);
	}
}
