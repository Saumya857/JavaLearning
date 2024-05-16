import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring","Spring Boot","API","MicroSevices","AWS","PCF","Azure","Docker","Kubernetes");
        courses.stream()
        .filter(courseList -> courseList.contains("Spring"))
        .forEach(System.out::println);

    }

}
