import java.util.List;

public class Ex04 {
     public static void main(String[] args) {
        List<String> courses = List.of("Spring","Spring Boot","API","MicroSevices","AWS","PCF","Azure","Docker","Kubernetes");
        //Printing Courses with length greater than 4
        courses.stream()
        .filter(courseList -> courseList.length()>=4)
        .forEach(System.out::println);

        //Printing Courses with their number of characters Individually
        System.out.println("Course"+"\t\t"+"Length");
        courses.stream()
        .map(courseList -> courseList + "\t\t" +courseList.length())
        .forEach(System.out::println);
    }
}
