package day06_ifStatements;

public class NumberToWord {

    public static void main(String[] args) {

        int n = 1;
        String result = "";

        if(n == 0){
            result ="zero";
        }

        if(n == 1){
            result ="One";
        }

        if(n == 2){
            result ="Two";
        }

        if(n == 3){
            result ="Three";
        }

        if(n == 4){
            result ="Four";
        }

        if(n == 5){
            result ="Five";
        }

        if(n == 6){
            result ="Six";
        }

        if(n == 7){
            result ="Seven";
        }

        if(n == 8){
            result ="Eight";
        }

        if( n == 9){
            result ="Nine";
        }

        System.out.println(result);
        
    }
    
}

/*
Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */