public class InstanceMethodWithNoReturnType{
    public static void main(String[] args) {
        InstanceMethodWithNoReturnType instance = new InstanceMethodWithNoReturnType();
        instance.addition(); // Call the instance method
    }

    public void addition(){
        int num1 =50;
        int num2 =17;

        int sum = num1 + num2;
        System.out.printf("The sum is %d%n", sum);
    }
}