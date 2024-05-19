package FunctionaInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    
    static BiConsumer<String,List<String>> biConsumer = (name,activities) -> System.out.println(name + " : " + activities);

    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printStudentsAndActivities(){
        studentList.forEach(
            (student) -> biConsumer.accept(student.getName(), student.getActivities())
        );

    }

    public static void main(String[] args) {
        
        //BiConsumer <Integer,Integer> addSquares = (s1,s2) -> System.out.println((s1*s1)+(s2*s2));

        //addSquares.accept(5,8);
        printStudentsAndActivities();
    }
}
