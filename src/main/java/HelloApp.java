public class HelloApp {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.print("Hello ");

            for (String name : args) {
                System.out.print(name + " ");
            }

            System.out.println(); // for clean next line

        } else {
            System.out.println("Hello, World!");
        }
    }
}