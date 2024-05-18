/*Lambda expressions allow you to concisely represent anonymous functions. 
They enable you to treat functionality as a method argument or to create small, 
inline implementations of interfaces (like functional interfaces). */


//Syntax for Lambda//

// () -> {}
// Parameters -> Lambda Body 

package LambdaExpressions;

import java.util.List;

public class IntroductionToLambda {
    
    //Printing the list of String

    public static void main(String[] args) {
        List<String> courses = List.of("Spring","Spring Boot","API","MicroSevices","AWS","PCF","Azure","Docker","Kubernetes");

        courses.forEach(course -> System.out.println(course));
    }
}
