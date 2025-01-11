# GPA to Percentage Converter

## Overview
The **GPA to Percentage Converter** program is a Java-based application that converts a user's GPA (Grade Point Average) into its corresponding percentage range. The program is designed to handle different invalid inputs.

---

## Features
- **Dynamic Input Handling**: 
  - Accepts user input in decimal format for GPAs.
  - Validates inputs to ensure they are within the range of 0.0 to 4.0.
  - Handles invalid numeric inputs (e.g., `-1.2` or `5.6`).
  - Manages non-numeric inputs gracefully (e.g., letters or special characters).

- **Interactive Testing**: 
  - Users can test multiple GPAs consecutively.
  - Option to exit the program when done.

- **Output Clarity**: 
  - Converts GPA to a percentage range using a `switch` statement.
  - Displays meaningful messages for valid and invalid inputs.

---

## How to Run the Program

### Prerequisites
1. Ensure you have **Java Development Kit (JDK)** installed on your system.
2. Use an IDE like **IntelliJ IDEA** or a terminal with Java installed.

### Steps to Run
1. Clone or download the source code from the repository.
2. Open the project in IntelliJ IDEA or any preferred Java IDE.
3. Compile and run the program.
   - Using IntelliJ IDEA:
     - Open the `GpaToPercentage` class.
     - Click on the `Run` button or press `Shift + F10`.
   - Using the terminal:
     - Navigate to the directory containing the program.
     - Compile the program: `javac Main.java`
     - Run the program: `java Main`
4. Follow the prompts to input your GPA and view the corresponding percentage range.

---

## Program Output
The program accepts user input for a GPA, validates it, and outputs the corresponding percentage range.

### Sample Outputs
1. **Valid Input Example**:
   - **Input**: `3.7`
   - **Output**: `Percentage: <93.0% to 92.0%`

2. **Invalid Numeric Input Example**:
   - **Input**: `-1.0`
   - **Output**: `Invalid GPA entered. Please enter a GPA between 0.0 and 4.0.`

3. **Non-Numeric Input Example**:
   - **Input**: `abc`
   - **Output**: `Invalid input. Please enter a numeric GPA between 0.0 and 4.0.`

4. **Exit Option**:
   - After viewing a result, the user is prompted: `Do you want to test another GPA? (yes/no):`
   - **Input**: `no`
   - **Output**: `Program terminated. Thank you for using the GPA converter!`

---

### Conversion Logic
The program uses a `switch` statement to determine the corresponding percentage range for each GPA value. The GPA is multiplied by 10 and cast to an integer to facilitate case matching.

### Example Mapping:
- `4.0` -> `100% to 95.0%`
- `3.5` -> `<91.0% to 90.0%`
- `2.0` -> `<76.0% to 75.0%`
- `0.0` -> `<65.0% to 0.0%`

---
