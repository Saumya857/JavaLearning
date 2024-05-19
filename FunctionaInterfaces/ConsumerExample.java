/*In Java, Consumer is a functional interface defined in the java.util.function package. 
It represents an operation that accepts a single input argument and returns no result. 
Its functional method is accept(T t), which takes an argument of type T and performs some operation on it.
 */

package FunctionaInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

     static List<Student> studentList = StudentDataBase.getAllStudents();
    

    public static void printStudents(){
       // List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void printStudentsAndActivities(){
        System.out.println("Student and their Activities");
        studentList.forEach(c3.andThen(c4));
    }

    public static void printStudentAndActivitiesUsingCondition(){
        studentList.forEach(
            (student) -> { 
                if(student.getGpa()>3.5){
                c3.andThen(c4).accept(student);;
            }
        }
        );
    }

    public static void main(String[] args) {
        
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

        c1.accept("Hello World");
       // printStudents();
       // printStudentsAndActivities();
        printStudentAndActivitiesUsingCondition();
    }
    
}
