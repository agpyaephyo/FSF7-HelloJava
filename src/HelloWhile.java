public class HelloWhile {

    public static void main(String[] args) {
        //simple "while"
        int i = 1;
        while (i <= 10) {
            System.out.println("Line " + i);
            ++i;
        }

        /*
        //another simple "while"
        int sum = 0, i = 100;
        while (i != 0) {
            sum += i;     // sum = sum + i;
            --i;
        }
        System.out.println("Sum = " + sum);
        */

        /*
        //do ... while
        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum += number;
        } while (number != 0.0);

        System.out.println("Sum = " + sum);
        */

        /*
        //infinite while loop
        int j = 100;
        while (j == 100) {
            System.out.print("Hey!");
        }
        */
    }
}
