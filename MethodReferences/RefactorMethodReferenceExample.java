package MethodReferences;

import java.util.function.Predicate;

import Data.Student;
import Data.StudentDataBase;

public class RefactorMethodReferenceExample {

    //static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;

    static Predicate<Student> p1 = RefactorMethodReferenceExample::filterByGrade;

    public static boolean filterByGrade(Student s){
        return s.getGradeLevel()>=3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studenSupplier.get()));
    }
    
}
