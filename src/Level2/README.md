# ConsoleReader – Robust Console Input Utility (Java 21)

## 📄 Description

This exercise implements a reusable **ConsoleReader** utility that safely reads different data types from standard input. It validates user input and prevents common runtime errors by handling `InputMismatchException` and empty inputs in a loop until valid data is provided.

A simple `Main` class demonstrates how to use the utility to read multiple types (int, char, boolean, and string) from the console.

---

## 💻 Technologies Used

* Java 21 (LTS)
* Java Standard Library

    * `Scanner`
    * `InputMismatchException`

---

## 📋 Requirements

To run this project, you will need:

* Java Development Kit (JDK) 21 (LTS)
* A Java-compatible IDE or code editor (IntelliJ IDEA, Eclipse, VS Code, etc.)

---

## 🛠️ Installation

1. Clone the repository:

   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:

   ```bash
   cd level2
   ```
3. Open the project in your preferred IDE.

---

## ▶️ Execution

1. Compile the program:

   ```bash
   javac Level2/*.java
   ```
2. Run the application:

   ```bash
   java Level2.Main
   ```

---

## 🧩 How It Works

The `ConsoleReader` class provides static methods to read and validate different input types:

* `readByte(String message)`
* `readInt(String message)`
* `readFloat(String message)`
* `readDouble(String message)`
* `readChar(String message)`
* `readString(String message)`
* `readYesNo(String message)`

Each method:

* Displays a prompt
* Attempts to read the requested type
* Catches invalid input
* Re-prompts the user until valid data is entered

The `Main` class calls these methods and prints the captured values to confirm correct input handling.

---

## 🧠 Key Concepts Practiced

* Input validation with `try-catch`
* Handling `InputMismatchException`
* Preventing invalid or empty input
* Creating reusable utility classes

---

## 🌐 Deployment

This is a console-based educational project and does not require deployment to a production environment.

It can be exe
