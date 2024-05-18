/*Runnable is a functional interface in Java, introduced in Java 1.0. 
A functional interface is an interface that contains exactly one abstract method. 
*/

package LambdaExpressions;
public class LambdaUsingRunnable {

    public static void main(String[] args) {
        //Earlier use of Runnable
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable using legacy");
            }
        };

        Thread thread = new Thread(task);
        thread.start();

        Runnable task1 = () -> {System.out.println("Runnable using Lambda");};

        //Runnable task1 = () -> System.out.println("Runnable using Lambda");

        Thread thread1 = new Thread(task1);
        thread1.start();
    }

    
}
