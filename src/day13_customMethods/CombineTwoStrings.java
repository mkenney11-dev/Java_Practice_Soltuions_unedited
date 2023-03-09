package day13_customMethods;

public class CombineTwoStrings {

    public static void main(String[] args) {

        System.out.println( combine("one", "eight") );

    }


    public static String combine(String str1, String str2){
        String result = str1+str2;

        if(str1.charAt( str1.length()-1 )  == str2.charAt(0)){
            result = str1 + str2.substring(1);
        }

        return result;
    }

}

/*
5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight

 */