package MethodReferences;

import java.util.function.Supplier;
import java.util.function.Function;

import Data.Student;

public class ConstructorReference {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<String,Student> studentfunction = Student :: new;


    public static void main(String[] args) {
        System.out.println(studentSupplier.get());

        System.out.println(studentfunction.apply("John"));
    }
}
