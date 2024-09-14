	/* •	What Are Text Blocks?:
	•	Introduced to simplify handling of multiline strings.
	•	Allows for better readability and less use of escape characters.*/

    public class TextBlockExample {
    public static void main(String[] args) {
        // Old way: multiline string with concatenation
        String jsonOld = "{\n" +
                         "  \"name\": \"John\",\n" +
                         "  \"age\": 30\n" +
                         "}";
        System.out.println("Old string: " + jsonOld);

        // New way: text blocks in Java 17
        String jsonNew = """
                         {
                           "name": "John",
                           "age": 30
                         }
                         """;
        System.out.println("New string: " + jsonNew);
    }

    /*
    Limitations and Special Considerations

	1.	Inconsistent Indentation: Java will automatically trim the common leading indentation of all lines in a text block, 
    so be mindful when indenting. All lines should have consistent leading spaces to avoid unexpected trimming.

	2.	Whitespace Sensitivity: Be cautious with leading and trailing whitespace within a text block, as it’s preserved. 
    If unwanted whitespace appears, use .trim() to clean it up.
    
	3.	Line Terminators: Text blocks automatically insert a newline character at the end of each line,
     so if you need to control line breaks, consider using explicit \n or handling the line terminators manually.
     */
}