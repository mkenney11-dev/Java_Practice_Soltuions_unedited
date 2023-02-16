package day04_concatenation;

public class PhoneNumber {

    public static void main(String[] args) {

        int countryCode = 1,
                areaCode = 703,
                localNumber = 4512625;

        String result = "+"+countryCode+"("+areaCode+")-"+localNumber;

        System.out.println(result);

    }

}

/*
create a class named PhoneNumber and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = 1
                    areaCode = 703
                    localNumber = 4512625

                output:
                    +1(703)-4512625
 */