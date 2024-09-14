public class SwitchExpressionExample {
    public static void main(String[] args) {
        String day = "TUESDAY";
        
        // Old switch
        int numLettersOld;
        switch (day) {
            case "MONDAY":
            case "FRIDAY":
            case "SUNDAY":
                numLettersOld = 6;
                break;
            case "TUESDAY":
                numLettersOld = 7;
                break;
            default:
                throw new IllegalStateException("Unknown day: " + day);
        }
        System.out.println("Old switch result: " + numLettersOld);

        // New switch expression
        int numLetters = switch (day) {
            case "MONDAY", "FRIDAY", "SUNDAY" -> 6; // arrow eliminates the need for break statement
            case "TUESDAY" -> 7;
            default -> throw new IllegalStateException("Unknown day: " + day);
        };
        System.out.println("New switch result: " + numLetters);

       
       
        // Switch expression with a block

        int month = 2;
        int year = 2024;

    int daysInMonth = switch (month) {
        case 1, 3, 5, 7, 8, 10, 12 -> 31;
        case 4, 6, 9, 11 -> 30;
        case 2 -> {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                yield 29;  // Leap year
            } else {
                yield 28;  // Regular year
            }

            //The yield keyword is used to return a value from within a block.
        }
        default -> throw new IllegalArgumentException("Invalid month: " + month);
    };

    System.out.println("Days in month: " + daysInMonth);  // Output: 29 (Leap year)

    //Exhaustiveness in Switch Expression

    /*When using switch as an expression, the cases must be exhaustive, meaning all possible input values must be handled. 
    If the switch expression doesn’t cover all possible values, the default case is mandatory.*/

    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

    Day day = Day.MONDAY;

    String dayType = switch (day) {
        case SATURDAY, SUNDAY -> "Weekend";
        case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
    };

    System.out.println(dayType);  // Output: Weekday

    /*	•	Here, Day is an enum, and all possible values are handled, so no default case is required.
	•	If you don’t handle all possible cases, the compiler will enforce the inclusion of a default case.*/
    
    }

    //############### Key benefits ##############
   /* •	It reduces boilerplate code, especially when used as an expression.
	•	It eliminates the error-prone fall-through behavior.
	•	It provides more flexibility, better syntax for handling multiple case labels, and ensures exhaustive handling of all possible cases.*/
}