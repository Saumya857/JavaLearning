package FunctionaInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import Data.Student;
import Data.StudentDataBase;

public class FunctionStudentExample {

    static Function<List<Student>,Map<String,Double>> studentfunction = (students) -> {
        Map<String,Double> studentGradeMap = new HashMap<>();
        students.forEach((student -> {
            if(PredicateExample.p1.test(student)){
                studentGradeMap.put(student.getName(),student.getGpa());
            }
            
        }));
        return studentGradeMap;
    };
    public static void main(String[] args) {
        System.out.println(studentfunction.apply(StudentDataBase.getAllStudents()));
    }
}
