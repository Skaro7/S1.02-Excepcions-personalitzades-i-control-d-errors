package Level2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                return scanner.nextByte();
            } catch (InputMismatchException e) {
                System.err.println("Error de formato");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {
        while (true) {
            System.out.print(message);
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Error de formato");
            scanner.nextLine();
        }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            System.out.print(message);
            try {
            return scanner.nextFloat();
            }
            catch (InputMismatchException e) {
                System.err.println("Error de formato");
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            System.out.print(message);
            try {
            return scanner.nextDouble();
            }
            catch (InputMismatchException e) {
                System.err.println("Error de formato");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                input = scanner.nextLine().trim();
            }

            if (input.length() == 1) {
                return input.charAt(0);
            }
            else {
                System.out.println("Error: solo se permite un único carácter.");
            }
        }
    }

    public static String readString(String message) {
        String input;
        do {
            System.out.print(message);
            input = scanner.nextLine().trim();
        } while (input.isEmpty());
        return input;
    }

    public static boolean readYesNo(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                input = scanner.nextLine().trim();
            }
            if (input.equalsIgnoreCase("s")) {
                return true;
            }
            else if (input.equalsIgnoreCase("n")) {
                return false;
            }
            else {
                System.out.println("Error: entrada no válida. Introduce 's' o 'n'.");

            }
        }
    }


}
