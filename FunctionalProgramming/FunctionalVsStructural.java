/*Functional Programming - It is a programming paradigm where you treat functions as first class citizens,
    i.e you can pass functions as arguments to other functions, return them as value from other functions and store them. */


/*Features of Java 8 which facilitates Functional Programming
 * Lambda Expressions
 * Functional Interface
 * Method References
 * Stream APIs
 * Optional
 */

package FunctionalProgramming;
import java.util.List;

public class FunctionalVsStructural {

    //Summing the squares of even numbers in a list of integers

    public static void main(String[] args) {
        List<Integer> numbers= List.of(1,2,3,4,5);

        System.out.println("Sum of list of Integers using Structured Way = " +summingUsingStructuredWay(numbers));

        System.out.println("Sum of list of Integers using Functional Way = " +summingUsingFunctionalWay(numbers));
    }

    private static int summingUsingStructuredWay(List<Integer> numberList){
        int sumOfSquares = 0;
        for(int num:numberList)
        {
            if(num%2==0){
                sumOfSquares += num*num;
            }
            
        }
        return sumOfSquares;
    }
    
    private static int summingUsingFunctionalWay(List<Integer> numberList)
    {
        return numberList.stream()
        .filter(number -> number%2==0)
        .reduce(0, (x,y) -> (x+(y*y)));
        

        /*
        numbers.stream()
        .filter(num -> num % 2 == 0)  // Filter even numbers
        .mapToInt(num -> num * num)     // Square each number
        .sum();
         */
    }
}
