package MethodReferences;

import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String,String> stringToLowerCase = String::toLowerCase; 

    static Function<String,String> stringToLowerCaseUsingReference = String::toLowerCase;
    public static void main(String[] args) {
        
        System.out.println(stringToLowerCase.apply("Hello"));

        System.out.println(stringToLowerCaseUsingReference.apply("Hello"));
    }
    
}
