package FunctionaInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> addString = (s) -> s.concat(" World");
    public static void main(String[] args) {
        System.out.println(addString.apply("Hello"));
    }
    
}
