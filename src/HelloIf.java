public class HelloIf {

    public static void main(String[] args) {
        //if
        int number = 10;
        if (number > 0) {
            System.out.println("Number is positive.");
        }
        System.out.println("This statement is always executed.");

        /*
        //if .. else
        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is not positive.");
        }
        System.out.println("This statement is always executed.");
        */

        /*
        //if .. else .. if
        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is 0.");
        }
        */

        /*
        //nested if
        double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;
        if (n1 >= n2) {
            if (n1 >= n3) {
                largestNumber = n1;
            } else {
                largestNumber = n3;
            }
        } else {
            if (n2 >= n3) {
                largestNumber = n2;
            } else {
                largestNumber = n3;
            }
        }
        System.out.println("Largest number is " + largestNumber);
        */

        /*
        //ternary operator
        double numberDouble = -5.5;
        String result;

        result = (numberDouble > 0.0) ? "positive" : "not positive";
        System.out.println(number + " is " + result);
        */
    }
}
