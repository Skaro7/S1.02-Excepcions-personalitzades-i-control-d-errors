# Custom Exceptions and Error Handling – Java Exercise

## 📄 Description

This exercise focuses on **custom exceptions**, **error handling**, and working with **collections** in Java. The goal is to understand how to create, throw, and catch exceptions, as well as how to handle common runtime errors when working with lists and calculations.

It also explores the difference between **checked** and **unchecked exceptions**, and how exception design decisions affect program behavior.

### Exercise Statement

We are developing a small sales management application. Each sale can contain multiple products, and the system must calculate the total price of the sale. However, calculating a total does not make sense if no products have been added.

To handle this situation properly, we will implement validations and custom exceptions.

---

## 💻 Technologies Used

- Java 21
- Java Collections Framework (ArrayList)
- Exception Handling
- Object-Oriented Programming (OOP)
- Git & Conventional Commits

---

## 📋 Requirements

To run this project, you will need:

- Java Development Kit 21
- A Java-compatible IDE or code editor (IntelliJ IDEA, Eclipse, VS Code, etc.)
- Basic knowledge of Java exceptions and collections

---

## 🛠️ Installation

To install and run the project locally:

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```bash
   cd custom-exceptions
   ```
3. Open the project in your preferred IDE.

---

## ▶️ Execution

To execute the application:

1. Compile the Java files:
   ```bash
   javac Level1.Main.java
   ```
2. Run the program:
   ```bash
   java Level1.Main
   ```

The console output will demonstrate:

- A custom exception being thrown when trying to calculate a sale total with no products
- Proper exception handling using try-catch blocks
- An example of catching an IndexOutOfBoundsException

---

## 🌐 Deployment

This is a console-based educational project and does not require deployment to a production environment.

It can be executed on any system with a compatible Java Runtime Environment (JRE).

---

## 🧪 Exception Handling Details

### Custom Exception: `Level1.EmptySaleException`

- Initially extends `Exception` (checked exception)
- Thrown when attempting to calculate the total of a sale with no products
- Error message:
  > "To make a sale, you must first add products"

Later in the exercise, `Level1.EmptySaleException` is modified to extend `RuntimeException`, turning it into an **unchecked exception**.

---

## 📌 Checked vs Unchecked Exceptions

### Checked Exceptions

- Extend `Exception` (but not `RuntimeException`)
- Must be handled using `try-catch` or declared with `throws`
- Checked at **compile time**
- Used for recoverable conditions

Example:

```java
import Level1.EmptySaleException;

public void calculateTotal() throws EmptySaleException
```

### Unchecked Exceptions

- Extend `RuntimeException`
- Do not require explicit handling
- Detected at **runtime**
- Usually represent programming errors

Example:
```java
public class Level1.EmptySaleException extends RuntimeException
```

---

## ⚠️ Common Runtime Exception Demonstrated

### `IndexOutOfBoundsException`

- Occurs when accessing an invalid index in a collection
- Common when working with lists without proper bounds checking
- Demonstrated and handled using a try-catch block

