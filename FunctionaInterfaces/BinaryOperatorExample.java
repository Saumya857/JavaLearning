package FunctionaInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> numOperator = (a,b) -> a*b;

    static Comparator<Integer> c1 = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        System.out.println(numOperator.apply(5, 4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(c1);
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(c1);

        System.out.println(maxBy.apply(10, 11));
        System.out.println(minBy.apply(29, 49));

        
    }
    
}
