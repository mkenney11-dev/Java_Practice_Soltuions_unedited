package day11_string;

import java.util.Scanner;

public class EmailTask2 {

    public static void main(String[] args) {

        // Reads email from console using Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scan.next();
        email = email.toLowerCase(); // makes the whole email lowercase
        scan.close();

        // breaks the email into the different parts
        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));

        // Makes the first and last name capitalized
        String firstUpper = firstName.substring(0,1);
        firstUpper = firstUpper.toUpperCase();
        String lastUpper = lastName.substring(0,1);
        lastUpper = lastUpper.toUpperCase();

        firstName = firstUpper + firstName.substring(1);
        lastName = lastUpper + lastName.substring(1);


        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
    }

}
/*
9. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */