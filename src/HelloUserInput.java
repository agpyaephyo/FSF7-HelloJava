public class HelloUserInput {
    public static void main(String[] args) {
        System.out.println("HelloUserInput");

        String myName = "Aung Pyae Phyo";
        System.out.println("myName : " + myName);

        System.out.println("args[0] : " + args[0]);
        System.out.println("args[1] : " + args[1]);

        int userInput = Integer.parseInt(args[1]);
        double userInput3 = Double.parseDouble(args[2]);
    }
}
