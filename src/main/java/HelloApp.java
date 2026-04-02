public class HelloApp {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.print("Hello ");

            // Enhanced for loop
            for (String name : args) {
                System.out.print(name + " ");
            }

        } else {
            System.out.println("Hello, World!");
        }
    }
}