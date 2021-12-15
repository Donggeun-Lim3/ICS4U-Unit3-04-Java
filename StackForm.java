/*
* This program pushes and prints a stack.
*
* @author  Donggeun Lim
* @version 1.0
* @since   2021-12-10
*/

import java.util.EmptyStackException;
import java.util.Scanner;

/** This program demonstrates a stack. */
final class StackForm {

    /**
    * Prevents instantiation.
    * Throw an exception IllegalStateException when called.
    *
    * @throws IllegalStateException
    *
    */
    private StackForm() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Creates an instance of MrCoxallStack and uses its methods.
    *
    * @param args No args will be used.
    */
    public static void main(final String[] args) {

        final MrCoxallStack<Integer> aStack = new MrCoxallStack<Integer>();
        final String[] allowedCommands =
            {"add", "pop", "show", "peek", "clear", "end"};
        final Scanner scanner = new Scanner(System.in);

        final String userCommand;
        String userInput;
        String[] userCommandArray;

        final int indexZero = 0;
        final int indexOne = 1;
        final int indexTwo = 2;
        final int indexThree = 3;
        final int indexFour = 4;
        final int indexFive = 5;

        System.out.println("Commands : add <number> - pop - show - clear - end"
                           + "\nEnter the above commands only!");

        while (true) {
            try {
                System.out.print("- ");
                userInput = scanner.next();

                // Checks what the command the user entered
                if (userInput.startsWith(allowedCommands[indexZero])) {
                    userCommandArray = scanner.nextLine().split(" ");
                    aStack.push(Integer.parseInt(userCommandArray[indexOne]));
                }
                else if (userInput.startsWith(allowedCommands[indexOne])) {
                    System.out.println("Removed: " + aStack.pop());
                }
                else if (userInput.startsWith(allowedCommands[indexTwo])) {
                    System.out.println("stack :");
                    aStack.showStack();
                }
                else if (userInput.startsWith(allowedCommands[indexThree])) {
                    System.out.println("The element at the top of the stack is : "
                                       + aStack.peek());
                }
                else if (userInput.startsWith(allowedCommands[indexFour])) {
                    aStack.clear();
                }
                else if (userInput.startsWith(allowedCommands[indexFive])) {
                    break;
                }
                else {
                    throw new IllegalArgumentException();
                }
            }
            catch (ArrayIndexOutOfBoundsException
                    | IllegalArgumentException exception) {
                System.out.println("Invalid input!");
            }
            catch (EmptyStackException exception) {
                System.out.println("The stack is empty.");
            }
        }

        System.out.println("\nDone.");
    }
}
