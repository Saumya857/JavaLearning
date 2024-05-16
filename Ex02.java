import java.util.List;

public class Ex02 {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring","Spring Boot","API","MicroSevices","AWS","PCF","Azure","Docker","Kubernetes");
        printCourses(courses);
    }
    private static void printCourses(List<String> courseList)
    {
        courseList.stream()
        .forEach(System.out::println);
    }
    
}
