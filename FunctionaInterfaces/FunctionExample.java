/*Function: Represents a function that accepts one argument and produces a result. 
It's widely used for mapping, transforming, or converting data. */

package FunctionaInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> function = (name) -> name.toUpperCase();

    static Function<String,String> addString = (name) -> name.toLowerCase().concat(" World");

    public static void main(String[] args) {
        System.out.println(function.apply("Hello"));

        /*First converts Hello to Upper case and then passes the result to addString 
        converts everything to lower case and concatenates world to it
        */
        System.out.println(function.andThen(addString).apply("Hello")); 

        /* First converts everything to lowerCase and concatenates world to it
         Passes the result to function and converts everything to Uppercase
        */
        System.out.println(function.compose(addString).apply("Hello"));
    }
    
}
