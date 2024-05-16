import java.util.List;

public class Ex01 {
    public static void main(String []args) {
        List<Integer> number = List.of(121,3,56,77,44,10,21,9);
        printOddNumbers(number);
    }

    private static void printOddNumbers(List<Integer> numbers)
    {
        numbers.stream()
        .filter(number -> number%2!=0)
        .forEach(System.out :: println);
    }
}