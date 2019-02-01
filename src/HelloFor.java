public class HelloFor {

    public static void main(String[] args) {
        //simple "for"
        for (int i = 1; i <= 10; ++i) {
            System.out.println("Line " + i);
        }

        /*
        //another simple "for"
        int sum = 0;
        for (int i = 1; i <= 1000; ++i) {
            sum += i;     // sum = sum + i
        }

        System.out.println("Sum = " + sum);
        */

        /*
        //infinite for loop
        for (int i = 1; i <= 10; --i) {
            System.out.println("Hello");
        }
        */

        /*
        // for-each loop
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (char item: vowels) {
            System.out.println(item);
        }
        */

        /*
        // another for-each loop
        int[] numbers = {3, 4, 5, -5, 0, 12};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum = " + sum);
        */
    }
}
