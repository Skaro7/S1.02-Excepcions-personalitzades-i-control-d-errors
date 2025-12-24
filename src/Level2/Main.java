package Level2;

public class Main {
    public static void main(String[] args) {
        int age = ConsoleReader.readInt("Enter your age (0-99): ");
        char grade = ConsoleReader.readChar("Enter a grade: ");
        boolean answer = ConsoleReader.readYesNo("Continue? (s/n): ");
        String name = ConsoleReader.readString("Enter your name: ");

        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Continue: " + answer);
        System.out.println("Name: " + name);
    }
}
