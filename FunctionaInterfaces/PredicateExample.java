package FunctionaInterfaces;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Student> p1 = (i) -> i.getGradeLevel()>=3;
    static Predicate<Student> p2 = (i) -> i.getGpa()>=3.5;

    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printStudentGradeAndGpa(){
        System.out.println("Students greater than grade level 3 and 3.5 GPA ");
        studentList.forEach((student) -> {
            if(p1.and(p2).test(student))
            System.out.println(student);
        });
    }

    public static void printStudentGradeAndGpa1(){
        System.out.println("Students less than grade level 3 and 3.5 GPA ");
        studentList.forEach((student) -> {
            if(p1.or(p2).negate().test(student))
            System.out.println(student);
        });
    }
    public static void main(String[] args) {
        // Predicate<Integer> p1 = (i) -> i%2==0;

        // Predicate<Integer> p2 = (i) -> i%5==0;

        // System.out.println("Is divisible by 2 and 5 " + p1.and(p2).test(25));

        // System.out.println("Is divisible by 2 or 5 " + p1.or(p2).test(25));

        printStudentGradeAndGpa();
        printStudentGradeAndGpa1();
    }
}
