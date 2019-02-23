package com.padcmyanmar.xyz;

public class HelloWord {

    public static void main(String[] args) {
        //Prints "Hello, World" to terminal windows.
        System.out.println("Hello PADC#7. My name is Aung Pyae Phyo");
        System.out.println("Welcome from Full-Stack Foundation.");

        final double PI = 3.142f;

        double circleRadius1 = PI * (3 * 3);

        final byte myAge;
        myAge = 21;

        System.out.println(myAge);

        final String myText = "My age is";
        System.out.println(myText);

        System.out.println(myText + " " + myAge);

        double circleRadius2 = PI * (60 * 60);

        int opResult = 1 + 2; //plus operation.
        System.out.println("opResult : " + opResult);

        opResult = 1 - 2; //minus operation.
        System.out.println("opResult : " + opResult);

        opResult = 2 * 3; //multiply operation.
        System.out.println("opResult : " + opResult);

        opResult = 2 / 3; //division operation.
        System.out.println("opResult : " + opResult);

        opResult = 2 % 3; //reminder operation.
        System.out.println("opResult : " + opResult);

        boolean isOpResultGreaterThan5 = opResult >= 2;
        System.out.println("isOpResultGreaterThan5 : " + isOpResultGreaterThan5);

        boolean isOpResultLessThan5 = opResult < 2;
        System.out.println("isOpResultGreaterThan5 : " + isOpResultLessThan5);

        System.out.println("true & true : " + (!(PI > 5) && (myAge > opResult)));
        System.out.println("true & false : " + (true & false));
        System.out.println("false & true : " + (false & true));
        System.out.println("false & false : " + (false & false));

        System.out.println("true | true : " + ((myAge > opResult) || (PI > 5)));
        System.out.println("true | false : " + (true | false));
        System.out.println("false | true : " + (false | true));
        System.out.println("false | false : " + (false | false));

        boolean isTrue = true;
        System.out.println("isTrue : " + !isTrue);

        int mySalary = 300;
        ++mySalary;
        System.out.println("mySalary++ : " + ++mySalary);
        mySalary--;
        System.out.println("mySalary-- : " + mySalary--);
    }
}
