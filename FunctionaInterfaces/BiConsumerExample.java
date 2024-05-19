/*BiConsumer is another functional interface introduced in Java 8. 
It represents an operation that accepts two input arguments and returns no result. 
It has one abstract method: void accept(T t, U u). 
BiConsumers are typically used for operations that consume two inputs simultaneously. */

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
