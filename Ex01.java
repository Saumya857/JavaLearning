public class Ex01
{
    public static void main(String []args)
    {
        List<Integer> number = List.of(12,5,3,2,10,7,89,62);
    }

    private static void printOddNumbers(List<Integer> numbers)
    {
        numbers.stream()
        .filter(number -> number%2!=0)
        .forEach(System.out :: println)
    }
}