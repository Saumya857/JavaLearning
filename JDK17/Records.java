/* 	•	What Are Records?:
	•	Introduced as a standard feature after being previewed in JDK 14 and 15.
	•	Provides a concise way to declare data-carrying classes.*/

    public record Person(String name, int age) {}

    /* 	•	When you compile the code, the Java compiler automatically generates the bytecode for these methods as part of the compiled class file (.class file).
	•	This means that after compilation, the resulting bytecode for the Person record contains all the required methods 
    (constructor, accessors, equals(), hashCode(), and toString()), just like if you had written them manually.*/

    public class RecordExample {
    public static void main(String[] args) {
        // Creating a new instance of the Person record
        Person person = new Person("Alice", 25);
        
        // Accessing fields using accessor methods
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());

        // Using automatically generated toString()
        System.out.println(person);

        // Comparing records using automatically generated equals()
        Person anotherPerson = new Person("Alice", 25);
        System.out.println("Are persons equal? " + person.equals(anotherPerson));

        // HashCode comparison
        System.out.println("HashCode: " + person.hashCode());
    }
}