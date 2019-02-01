import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloJava {
    public static void main(String args[]) {
        System.out.println("မဂ်လာပါ ။ Java Programming Language ကို တွေ့ရတာ ဝမ်းသာပါတယ် ");

        System.out.println("My name is " + args[0]);
        System.out.println("My age is " + args[1]);
        System.out.println("The value of PI is " + args[2]);

        int myAge = Integer.parseInt(args[1]);
        float pi = Float.parseFloat(args[2]);
        float myWealth = myAge * pi;
        System.out.println("My wealth is " + myWealth);

        BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your township : ");
        try {
            String myTownship = myReader.readLine();
            System.out.println("Your township is " + myTownship);

            System.out.print("Enter your education : ");
            String myEducation = myReader.readLine();
            System.out.println("Your education is " + myEducation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
