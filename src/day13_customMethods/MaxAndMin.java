package day13_customMethods;

public class MaxAndMin {

    public static void main(String[] args) {

        System.out.println( max(100, 200) );
        System.out.println( min(100, 200) );

    }

    public static int max(int n1, int n2){

        if(n1 >= n2){
            return n1;
        }else{
            return n2;
        }

    }

    public static int min(int n1, int n2){

        if(n1 <= n2){
            return n1;
        }else{
            return n2;
        }

    }


}

/*

3. Create a method named max, that can return the maximum number between two numbers


4. Create a method named min, that can return the minimum number between two numbers
 */