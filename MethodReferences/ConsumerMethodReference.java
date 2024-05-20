package MethodReferences;

import java.util.function.Consumer;

import Data.Student;
import Data.StudentDataBase;

public class ConsumerMethodReference {

    static Consumer<Student> c1 = System.out::println;

    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);

        StudentDataBase.getAllStudents().forEach(c2);
    }
    
}
