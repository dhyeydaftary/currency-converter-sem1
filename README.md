#  Currency-Converter

A backend-only Java application for converting currencies between multiple international currencies using real-time exchange rates stored in a 2D array. This project demonstrates core Java programming concepts in a practical, menu-driven console application.

##  Features

- **Currency Listing**: Display a comprehensive list of supported currencies with their codes and full names.
- **Currency Conversion**: Convert amounts between any two supported currencies with instant results.
- **Input Validation**: Robust validation for currency codes and amounts to ensure data integrity.
- **User-Friendly Interface**: Interactive menu system with colored console output for better readability.
- **Error Handling**: Graceful handling of invalid inputs with clear error messages.
- **Exit Confirmation**: Option to confirm exit or return to the menu for additional conversions.

##  Tech Stack

- **Language**: Java (JDK 8 or higher)
- **Libraries**: Standard Java libraries (java.util.Scanner, java.util.Arrays)
- **Execution**: Command-line interface (CLI) application

##  Installation and Setup

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed on your system.
- A terminal or command prompt to run the application.

### Steps
1. **Clone or Download the Repository**:
   - Ensure the project files are in your local directory.


2. **Compile the Java File**:
   ```bash
   javac CurrencyConverter.java
   ```

3. **Run the Application**:
   ```bash
   java CurrencyConverter
   ```

4. **Interact with the Menu**:
   - Follow the on-screen prompts to select options, enter currencies, and amounts.

- **CurrencyConverter.java**: The core file with the main class, currency data (codes, names, rates), input handling, validation, and conversion functions.

##  System Workflow

1. **Initialization**: The application loads currency codes, names, and a 2D array of conversion rates upon startup.
2. **Menu Display**: Presents a numbered menu with options to display currencies, convert currencies, or exit.
3. **User Selection**:
   - **Option 1**: Lists all available currencies in a tabular format.
   - **Option 2**: Prompts for source currency, target currency, and amount; validates inputs; performs conversion using matrix indexing; displays result.
   - **Option 3**: Asks for exit confirmation; loops back to menu if declined.
4. **Conversion Process**: Retrieves the conversion rate from the 2D array based on source and target indices, multiplies by the input amount, and outputs the result.
5. **Loop Continuation**: Repeats the menu until the user confirms exit.

##  Security and Validation Highlights

- **Currency Code Validation**: Ensures entered codes match the predefined list of supported currencies; rejects invalid entries with error messages.
- **Amount Validation**: Checks that the input amount is a positive number; prompts for re-entry on invalid values.
- **Input Sanitization**: Uses `toUpperCase()` for case-insensitive currency code matching and `Scanner.nextLine()` to handle newline consumption.
- **Error Prevention**: Prevents array index out-of-bounds errors through validation loops and index retrieval using `Arrays.asList().indexOf()`.
- **No External Data Exposure**: All data is hardcoded and processed locally, minimizing security risks in this educational context.

##  Author

**Dhyey Daftary**  
LinkedIn: [https://www.linkedin.com/in/dhyey-daftary/](https://www.linkedin.com/in/dhyey-daftary/) - Developed as part of a semester-1 Java programming project.

##  License

This project is for **educational purposes** only and is not licensed for commercial use. Feel free to use it for learning and experimentation.

For any questions, suggestions, or contributions, please contact the author through LinkedIn.