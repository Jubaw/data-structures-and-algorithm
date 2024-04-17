package ds_and_algorithm;

public class Recursion {

/*
  Recursion =====   When a thing is defined in terms of itself. - Wikipedia
                    Apply the result of a procedure, to a procedure.
                    A recursive method calls itself.
                    Can be a substitute for iteration.
                    Divide a problem into sub-problems of the same type as the original.
                    Commonly used with advanced sorting algorithms and navigating trees

                    Advantages
                    ===============
                    Easier to read / write
                    Easier to debug

                    Disadvantages
                    ===============
                    Sometimes slower
                    Uses more memory
*/


    public static void main(String[] args) {

        walk(5);
        System.out.println(factorial(7));

        System.out.println(power(2, 2));


    }

    private static int power(int base, int exponent ) {
        if (exponent < 1) return 1;
        return base * power(base,exponent -1 );

    }

    private static int factorial(int num) {
        if (num < 1) return 1; //base case
        return num * factorial(num -1 ); //recursive
    }

    /*private static void walk(int steps) { //Normal
        for (int i = 0; i < steps; i++) {
            System.out.println("You take a step!");

        }
    }*/

    private static void walk(int steps) { //Recursive
        if (steps < 1) return;//base case
        System.out.println("You take a step");
        walk(steps - 1);

    }
    
    

}
