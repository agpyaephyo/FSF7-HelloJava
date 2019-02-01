public class HelloContinue {

    public static void main(String[] args) {

        //continue
        for (int i = 1; i <= 10; ++i) {
            if (i > 4 && i < 9) {
                continue;
            }
            System.out.println(i);
        }

        /*
        //another continue
        Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 6; ++i) {
            System.out.print("Enter a number: ");
            number = input.nextDouble();

            if (number <= 0.0) {
                continue;
            }

            sum += number;
        }
        System.out.println("Sum = " + sum);
        */

        /*
        //labeled continue
        label:
        for (int i = 1; i < 6; ++i) {
            for (int j = 1; j < 5; ++j) {
                if (i == 3 || j == 2)
                    continue label;
                System.out.println("i = " + i + "; j = " + j);
            }
        }
        */
    }
}
