public class InstanceMethodWithReturnType{
    public static void main(String[] args) {
        InstanceMethodWithReturnType instance = new InstanceMethodWithReturnType();
        int result = instance.addition(); // Call the instance method and store the result
        System.out.printf("The sum is %d%n", result); // Print the result
    }

    public int addition() {
        int num1 = 50;
        int num2 = 17;

        return num1 + num2; // Return the sum
    }
}