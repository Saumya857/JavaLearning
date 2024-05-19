package FunctionaInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import Data.Student;
import Data.StudentDataBase;

public class BiPredicateExample {
    
    static BiPredicate<Integer,Double> biPredicate = (grade,gpa) -> grade>=3 && gpa>=3.9;

    static BiConsumer<String,List<String>> biConsumer = (name,activities) -> System.out.println(name +" : "+activities);

    static Consumer<Student> consumer = (student) -> {
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
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
