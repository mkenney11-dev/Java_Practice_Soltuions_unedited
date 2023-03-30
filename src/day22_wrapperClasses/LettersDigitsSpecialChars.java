package day22_wrapperClasses;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon!";

        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(Character.isLetter(each)){
                letters += each;
            }else if(Character.isDigit(each)){
                digits += each;
            }else{
                specialChars += each;
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);



    }

}

/*
5. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";

        Note: Use Wrapper class methods
 */