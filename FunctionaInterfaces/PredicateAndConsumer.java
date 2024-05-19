package FunctionaInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import Data.Student;
import Data.StudentDataBase;

public class PredicateAndConsumer {

    static Predicate<Student> p1 = (i) -> i.getGradeLevel()>=3;
    static Predicate<Student> p2 = (i) -> i.getGpa()>=3.5;

    static BiConsumer<String,List<String>> biConsumer = (name,activities) -> System.out.println(name +" : "+activities);

    static Consumer<Student> consumer = (student) -> {
        if(p1.and(p2).test(student)){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public static void printNameAndActivities(List<Student> studentList){
        studentList.forEach(consumer);
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        printNameAndActivities(studentList);
    }
}
