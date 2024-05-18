/*In Java, a Comparator is an interface that specifies a comparison function, allowing you to define custom ordering for objects. 
It's commonly used for sorting collections of objects or for providing ordering to data structures 
like trees and priority queues. */

package LambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaUsingComparator {

    //Sorting list of String

    public static void main(String[] args) {
        
        List<String> courses = new ArrayList<>(List.of("Spring","Spring Boot","API","MicroSevices","AWS","PCF","Azure","Docker","Kubernetes"));

        //Earlier way of using Comparator
        Collections.sort(courses, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Courses using Comparator" );
        System.out.println(courses);

        //Using Lambda

        Collections.sort(courses, (course1,course2) -> course1.compareTo(course2));

        System.out.println("Courses using Lambda");
        System.out.println(courses);
    }
    
}
