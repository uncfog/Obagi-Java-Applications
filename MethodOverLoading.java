public class MethodOverLoading {
    public static void main(String[] args) {
        // Test method overloading
        greeting();
        greeting("Alice");
        greeting("Bob", 25);
        greeting("Clara", 30, "Canada");
    }

    public static void greeting() {
        System.out.println("Good Afternoon, Everyone");
    }

    public static void greeting(String name) {
        System.out.printf("Good Afternoon, %s%n", name);
    }

    public static void greeting(String name, int age) {
        System.out.printf("Good Afternoon, %s. You are %d years old.%n", name, age);
    }

    public static void greeting(String name, int age, String country) {
        System.out.printf("Good Afternoon, %s. You are %d years old and you are from %s.%n", name, age, country);
    }
}
