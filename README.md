# GPA to Percentage Converter

## Overview
The **GPA to Percentage Converter** program is a Java-based application that converts a user's GPA (Grade Point Average) into its corresponding percentage range. The program is designed to handle different invalid inputs.

---

## Features
- **Dynamic Input Handling**: 
  - Accepts user input in decimal format for GPAs.
  - Validates inputs to ensure they are within the range of 0.0 to 4.0.
  - Handles invalid numeric inputs
  - Manages non-numeric inputs

- **Interactive Testing**: 
  - Users can test multiple GPAs consecutively.
  - Option either to continue orexit the program when done.

- **Output Clarity**: 
  - Converts GPA to a percentage range using a `switch` statement.
  - Displays messages for valid and invalid inputs.

---

## How to Run the Program

### Prerequisites
1. Ensure you have **Java Development Kit (JDK)** installed on your system.
2. Use an IDE like **IntelliJ IDEA** or a terminal with Java installed.

### Steps to Run
1. Clone or download the source code from the repository.
2. Open the project in IntelliJ IDEA or any preferred Java IDE.
3. Compile and run the program.

## Program Output
The program accepts user input for a GPA, validates it, and outputs the corresponding percentage range.

### Sample Outputs
1. **Valid Input Example**:
   - **Input**: `3.7`
   - **Output**: `Percentage: <93.0% to 92.0%`

### Conversion Logic
The program uses a `switch` statement to determine the corresponding percentage range for each GPA value. The GPA is multiplied by 10 and cast to an integer to facilitate case matching.
