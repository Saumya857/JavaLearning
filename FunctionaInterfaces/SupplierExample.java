package FunctionaInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import Data.Student;
import Data.StudentDataBase;

public class SupplierExample {
    
    public static void main(String[] args) {
        Supplier<Student> studSupplier = () -> {
            return new Student("Emily",3,4.0,"female", 12,Arrays.asList("swimming", "gymnastics","aerobics"));
        };

        Supplier<List<Student>> studentSupplier = () -> StudentDataBase.getAllStudents();
        System.out.println(studSupplier.get());
        System.out.println(studentSupplier.get());
    }
}
