public class PatternMatchingExample {
    public static void main(String[] args) {
        Object obj = "Hello, Java 17!";
        
        // Old way: instanceof + explicit cast
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.length());
        }

        /*•	This involves two steps:
	•	instanceof checks if obj is a String.
	•	Then you cast obj to String in a separate line.*/

        
        // New way in Java 17: Pattern matching for instanceof
        if (obj instanceof String s) {
            System.out.println(s.length());
        }

        /*•	If obj is a String, it gets assigned to s directly.
	•	Inside the if block, s is a String and you can access String methods like length().
    
    If obj is not a String, the if block will not execute, and s will not be created. This avoids the need for a manual cast that could lead to runtime ClassCastException.
    */

    //#################################//
    /* Key Benefits
    	•	Less Boilerplate: You no longer need a separate type check and cast, reducing redundancy in the code.
	•	Safer: No accidental casting mistakes, because the type is guaranteed by the instanceof check.
	•	Cleaner Code: It improves readability, especially in more complex scenarios where multiple type checks and casts are required.*/

    
    }
}